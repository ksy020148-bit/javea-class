public class Equipment {
    // 1. 설계도(기능) 부분
    public static final int MAX_RENTAL_DAYS = 14;
    private static int equipmentCount = 0;

    private final String name;
    private boolean rented;
    private int rentalDays;
    private int dailyFee;

    public Equipment(String name) {
        this(name, 1000);
    }

    public Equipment(String name, int dailyFee) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("장비 이름이 필요합니다.");
        }
        this.name = name;
        setDailyFee(dailyFee);
        equipmentCount++;
    }

    public boolean rent() {
        return rent(1);
    }

    public boolean rent(int days) {
        if (rented || days < 1 || days > MAX_RENTAL_DAYS) {
            return false;
        }
        this.rented = true;
        this.rentalDays = days;
        return true;
    }

    public void returnEquipment() {
        this.rented = false;
        this.rentalDays = 0;
    }

    public String getName() { return name; }
    public boolean isRented() { return rented; }
    public int getRentalDays() { return rentalDays; }
    public int getDailyFee() { return dailyFee; }

    public void setDailyFee(int dailyFee) {
        this.dailyFee = Math.max(dailyFee, 0);
    }

    public static int getEquipmentCount() {
        return equipmentCount;
    }

    // ---------------------------------------------------------
    // 2. 실행(App) 부분 - 메인 메서드를 같은 클래스 안에 포함시켰습니다.
    // ---------------------------------------------------------
    public static void main(String[] args) {
        Equipment laptop = new Equipment("노트북");
        Equipment camera = new Equipment("카메라", 2000);

        System.out.println("전체 장비 수: " + Equipment.getEquipmentCount());

        System.out.println("노트북 3일 대여 성공: " + laptop.rent(3));
        System.out.println("노트북 대여 중: " + laptop.isRented());
        System.out.println("카메라 대여 중: " + camera.isRented());

        System.out.println("노트북 중복 대여 성공: " + laptop.rent(2));
        System.out.println("노트북 기존 대여 기간: " + laptop.getRentalDays());

        System.out.println("카메라 0일 대여 성공: " + camera.rent(0));
        System.out.println("카메라 15일 대여 성공: " + camera.rent(15));
        System.out.println("카메라 14일 대여 성공: " + camera.rent(14));

        laptop.returnEquipment();
        System.out.println("노트북 반납 뒤 상태: " + laptop.isRented() + "/" + laptop.getRentalDays());

        boolean baseRentSuccess = laptop.rent();
        System.out.println("노트북 기본 대여 성공/기간: " + baseRentSuccess + "/" + laptop.getRentalDays());

        laptop.setDailyFee(-500);
        System.out.println("음수 요금 보정: " + laptop.getDailyFee());
    }
}