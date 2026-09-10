import java.util.Scanner;

public class FinalMultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("시작 단(2~9): ");
        int startDan = scanner.nextInt();

        System.out.print("끝 단(2~9): ");
        int endDan = scanner.nextInt();

        boolean invalid = startDan < 2 || startDan > 9 || endDan < 2 || endDan > 9 || startDan > endDan;


        if (invalid) {
            System.out.println("2~9 범위를 순서대로 입력하세요.");
        } else {

            for (int i = startDan; i <= endDan; i++) {
                System.out.println("===" + i + "단 ===");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}