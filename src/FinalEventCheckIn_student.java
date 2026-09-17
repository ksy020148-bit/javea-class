import java.util.Scanner;


class Student {
    String studentId;
    String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
}

public class FinalEventCheckIn_student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 5;
        Student[] roster = new Student[capacity];

        while (true) {
            System.out.println("\n=== 취업 특강 신청 관리 ===");
            System.out.println("1. 신청");
            System.out.println("2. 조회 및 취소");
            System.out.println("3. 현황");
            System.out.println("4. 종료");
            System.out.print("메뉴 선택: ");

            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                int count = 0;
                for (int i = 0; i < capacity; i++) {
                    if (roster[i] != null) {
                        count++;
                    }
                }

                if (count >= capacity) {
                    System.out.println("안내: 정원(5명)이 모두 차서 신청이 마감되었습니다.");
                    continue;
                }

                System.out.print("학번을 입력하세요: ");
                String id = scanner.nextLine();

                boolean isDuplicate = false;
                for (int i = 0; i < capacity; i++) {
                    if (roster[i] != null && roster[i].studentId.equals(id)) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    System.out.println("안내: 이미 신청된 학번입니다. (중복 신청 거절)");
                    continue;
                }

                System.out.print("이름을 입력하세요: ");
                String name = scanner.nextLine();


                for (int i = 0; i < capacity; i++) {
                    if (roster[i] == null) {
                        roster[i] = new Student(id, name);
                        System.out.println("안내: 신청이 완료되었습니다.");
                        break;
                    }
                }

            } else if (menu == 2) {
                // [조회 및 취소] 기능
                System.out.println("\n--- 현재 신청 명단 ---");
                for (int i = 0; i < capacity; i++) {
                    if (roster[i] != null) {
                        System.out.println((i + 1) + "번: 학번 " + roster[i].studentId + " / 이름 " + roster[i].name);
                    } else {
                        System.out.println((i + 1) + "번: null");
                    }
                }

                System.out.print("\n취소할 학생의 학번을 입력하세요 (취소 안함: 엔터): ");
                String cancelId = scanner.nextLine();

                if (!cancelId.isEmpty()) {
                    boolean isCanceled = false;
                    for (int i = 0; i < capacity; i++) {
                        if (roster[i] != null && roster[i].studentId.equals(cancelId)) {
                            roster[i] = null;
                            System.out.println("안내: 성공적으로 취소되었습니다.");
                            isCanceled = true;
                            break;
                        }
                    }
                    if (!isCanceled) {
                        System.out.println("안내: 일치하는 학번이 없습니다.");
                    }
                }

            } else if (menu == 3) {
                // [현황] 기능
                int currentCount = 0;
                for (int i = 0; i < capacity; i++) {
                    if (roster[i] != null) {
                        currentCount++;
                    }
                }

                System.out.println("\n--- 특강 신청 현황 ---");
                System.out.println("현재 신청인: " + currentCount + "명");
                System.out.println("남은 자리: " + (capacity - currentCount) + "명");

                System.out.print("명단 배열 상태: [");
                for (int i = 0; i < capacity; i++) {
                    if (roster[i] != null) {
                        System.out.print(roster[i].name);
                    } else {
                        System.out.print("null");
                    }
                    if (i < capacity - 1) System.out.print(", ");
                }
                System.out.println("]");

            } else if (menu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 1~4 사이의 숫자를 입력해주세요.");
            }
        }


        scanner.close();
    }
}