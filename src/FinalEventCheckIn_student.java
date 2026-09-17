import java.util.Scanner;

class Student {
    String id, name;
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class FinalEventCheckIn_student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = 5;
        Student[] roster = new Student[capacity];

        while (true) {
            System.out.print("\n=== 취업 특강 신청 관리 ===\n1. 신청\n2. 조회 및 취소\n3. 현황\n4. 종료\n메뉴 선택: ");
            int menu = sc.nextInt();
            sc.nextLine();

            int count = 0;
            for (Student s : roster) if (s != null) count++;

            switch (menu) {
                case 1:
                    if (count >= capacity) {
                        System.out.println("안내: 정원(5명)이 모두 차서 신청이 마감되었습니다.");
                        break;
                    }
                    System.out.print("학번을 입력하세요: ");
                    String id = sc.nextLine();

                    boolean isDup = false;
                    for (Student s : roster) if (s != null && s.id.equals(id)) isDup = true;

                    if (isDup) {
                        System.out.println("안내: 이미 신청된 학번입니다. (중복 신청 거절)");
                        break;
                    }

                    System.out.print("이름을 입력하세요: ");
                    String name = sc.nextLine();
                    for (int i = 0; i < capacity; i++) {
                        if (roster[i] == null) {
                            roster[i] = new Student(id, name);
                            System.out.println("안내: 신청이 완료되었습니다.");
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- 현재 신청 명단 ---");
                    for (int i = 0; i < capacity; i++) {
                        System.out.println((i + 1) + "번: " + (roster[i] != null ? "학번 " + roster[i].id + " / 이름 " + roster[i].name : "null"));
                    }

                    System.out.print("\n취소할 학생의 학번을 입력하세요 (취소 안함: 엔터): ");
                    String cancelId = sc.nextLine();
                    if (cancelId.isEmpty()) break;

                    boolean isCanceled = false;
                    for (int i = 0; i < capacity; i++) {
                        if (roster[i] != null && roster[i].id.equals(cancelId)) {
                            roster[i] = null;
                            System.out.println("안내: 성공적으로 취소되었습니다.");
                            isCanceled = true;
                            break;
                        }
                    }
                    if (!isCanceled) System.out.println("안내: 일치하는 학번이 없습니다.");
                    break;

                case 3: // [현황]
                    System.out.println("\n--- 특강 신청 현황 ---");
                    System.out.println("현재 신청인: " + count + "명\n남은 자리: " + (capacity - count) + "명");
                    System.out.print("명단 배열 상태: [");
                    for (int i = 0; i < capacity; i++) {
                        System.out.print(roster[i] != null ? roster[i].name : "null");
                        if (i < capacity - 1) System.out.print(", ");
                    }
                    System.out.println("]");
                    break;

                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 1~4 사이의 숫자를 입력해주세요.");
            }
        }
    }
}