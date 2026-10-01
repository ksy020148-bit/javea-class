public class EquipmentApp {
    public static void main(String[] args) {
        // TODO 9: 객체 생성
        Equipment laptop = new Equipment("노트북");
        Equipment camera = new Equipment("카메라", 2000);

        System.out.println("전체 장비 수: " + Equipment.getEquipmentCount());

        // TODO 10: 첫 대여 결과와 실제 상태 출력
        System.out.println("노트북 3일 대여 성공: " + laptop.rent(3));
        System.out.println("노트북 대여 중: " + laptop.isRented());
        System.out.println("카메라 대여 중: " + camera.isRented());

        // TODO 11: 중복 및 경계값 오류 테스트
        System.out.println("노트북 중복 대여 성공: " + laptop.rent(2));
        System.out.println("노트북 기존 대여 기간: " + laptop.getRentalDays());

        System.out.println("카메라 0일 대여 성공: " + camera.rent(0));
        System.out.println("카메라 15일 대여 성공: " + camera.rent(15));
        System.out.println("카메라 14일 대여 성공: " + camera.rent(14));

        // TODO 12: 반납, 기본 대여, 음수 요금 보정 확인
        laptop.returnEquipment(); // 노트북 반납
        System.out.println("노트북 반납 뒤 상태: " + laptop.isRented() + "/" + laptop.getRentalDays());

        boolean baseRentSuccess = laptop.rent(); // 매개변수 없는 기본 대여(1일)
        System.out.println("노트북 기본 대여 성공/기간: " + baseRentSuccess + "/" + laptop.getRentalDays());

        laptop.setDailyFee(-500); // 음수 요금 셋팅 시도
        System.out.println("음수 요금 보정: " + laptop.getDailyFee());
    }
}

