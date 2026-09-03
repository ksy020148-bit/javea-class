//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args)
//    {
//        int studyMoths = 6;
//        int projectCount = 2;
//
//        int totalExperiensre
//                = studyMoths + projectCount;
//        System.out.println(totalExperiensre);
//    }
//}

//{
//int age = 20; //선언 + 초기화
//age =21; //대입
//        // int age =22;
//        //같은 범위에서 다시 선언하면 오류
//        System.out.
//
//println(age);
//    }
//    {
//    final int PASS_SOCRE =60;
//    int score =75;
//
//    boolean passed = score >= PASS_SOCRE;
//    //PASS_SOCRE + 70;
//        //컴파일 오류: 다시 대입할 수 없음
//    }
//}
//    {
//        byte lavel =3;
//        short year = 2026;
//        int projaectCount =12;
//        long popuation = 8_100_00_000L;
//
//        float ratio = 0.75F;
//        double average = 92.5;
//        char grade ='A';
//        boolean passed = true;
//
//        int price = 1_500_000_000;
//        int count = 2;
//
//        long wrong = price*count;
//        long correct =(long)price*count;
//
//        System.out.println(wrong);
//        System.out.println(correct);
//    }
//}
//    {
//        int total = 5;
//        int people =2;
//
//        double wrong = total/people;    //2.0
//        double correct  =(double) total/ people; // 2.5
//
//        System.out.println(wrong);
//        System.out.println((correct));
//    }

//    {
//        String name="김자바";
//        String role ="Java 개발자";
//
//        int lengh = name.length();
//        boolean hasJava = role.contains("Java");
//
//        String empty="";
//        String missinf = null;
//    }
//    {
//        String missing = null;
//        String empty = "";
//        String blank= "";
//
//        System.out.println(empty.isEmpty()); //TRUE
//        System.out.println(blank.isBlank()); //true
//
//        //missing.isBlank();
//
//    }
//    {
//        String role ="Jaba Backend";
//
//        int lengh = role.length();
//        char first = role.charAt(0);
//        boolean hasJava = role.contains("Java");
//        boolean backend = role.endsWith("Backend");
//
//        System.out.println(lengh);
//    }
//    {
//        String raw = "Java Backend";
//
//        String cleaned = raw.trim();
//        String firstWord = cleaned.substring(0,4);
//        String changed = cleaned.replace("Backend","Dveloper");
//
//        System.out.println(raw);
//        System.out.println(changed);
//    }
//    {
//        double score = 92.8;
//        int point = (int) score;
//
//        int value =130;
//        byte small = (byte)value;
//
//        System.out.println(point);
//        System.out.println(small);
//    }
//    {
//        String monthsText ="6";
//        String scoreText ="92.5";
//        String readyText = "true";
//
//        int months = Integer.parseInt(monthsText);
//        double score = Double.parseDouble(scoreText);
//        boolean ready = Boolean.parseBoolean(readyText);
//    }
//    {
//        int age = 24;
//
//        if(age >= 18) {
//            String massage = "성인";
//            System.out.println(massage);
//        }
//    }
//    {
//        int score = 75;
//        String result;
//
//        if (score >= 60) {
//            result = "합격";
//        }else{
//            result = "불합격";
//        }
//    }
//    {
//        String name = "김자바";
//        int months = 6;
//        double rating = 4.567;
//        boolean avilable = true;
//
//        System.out.printf("이름: %s%n", name);
//        System.out.printf("개월: %d%n",months);
//        System.out.printf("평점: %2f%n",rating);
//        System.out.printf("가능: %b&n", avilable);
//
//    {
//     int temperature = 12;
//     int belowZero = -temperature;
//
//        System.out.println(temperature);
//        System.out.println(belowZero);
//        System.out.println(-belowZero);
//    }
//    {
//        int count = 3;
//
//        int a = ++count;
//        int b = -count++;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(count);
//    }
//    {
//        int score = 10;
//        int a = -score;
//        int b = ++score;
//        int c = score--;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(score);
//
//
//    }
//    {
//        int total = 5;
//        int people = 2;
//
//        int a = total / people;
//        double b = total/ people;
//        double c = (double)total/ people;
//
//        System.out.println(c);
//    }
//
//
//    {
//        int max = Integer.MAX_VALUE;
//        int overfolow = max + 1;
//
//        System.out.println(max);
//        System.out.println(overfolow);
//    }
//
//        {
//            int min = Integer.MIN_VALUE;
//            int underflow = min - 1;
//
//            System.out.println(min);
//            System.out.println(underflow);
//        }
//
//
//    {
//        double sum = 0.0;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        System.out.println(sum);
//    }
//    {
//        long subtotalWon = 14_000;
//        long discountRate = 10;
//        long wrong
//                = subtotalWon * (discountRate / 100);
//        long correct
//                = subtotalWon * discountRate / 100;
//        System.out.println(wrong); // 0
//        System.out.println(correct); // 1400
//    }
//    {
//        double normal = 10.0 / 2.0;
//        double infinity = 10.0 / 0.0;
//        double nan = 0.0 / 0.0;
//        System.out.println(normal); // 5.0
//        System.out.println(infinity); // Infinity
//        System.out.println(nan); // NaN
//    }
//    {
//        String a = "Java";
//        String b = "Java";
//        String c = new String("Java");
//        System.out.println(a == b); // true 가능
//        System.out.println(a == c); // false
//        System.out.println(a.equals(c)); // true
//    }
//    {
//        double nan = 0.0 / 0.0;
//        System.out.println(nan == nan); // false
//        System.out.println(nan != nan); // true
//        boolean check = Double.isNaN(nan);
//        System.out.println(check); // true
//    }
//    {
//        int age = 26;
//        boolean atLeast20 = age >= 20;
//        boolean atMost40 = age <= 40;
//        boolean inRange
//                = atLeast20 && atMost40;
//        System.out.println(inRange); // true
//    }
//    {
//        int divisor = 0;
//        boolean safe
//                = divisor != 0
//                && 10 / divisor > 1;
//        System.out.println(safe); // false
//// 나눗셈은 실행되지 않는다
//    }
//    {
//        int first = 7; // ...0111
//        int second = 8; // ...1000
//        int firstLastBit = first & 1;
//        int secondLastBit = second & 1;
//        System.out.println(firstLastBit); // 1
//        System.out.println(secondLastBit); // 0
//    }
//    {
//        int value = 3;
//        int one = value << 1;
//        int two = value << 2;
//        System.out.println(one); // 6
//        System.out.println(two); // 12
//        System.out.println(value >> 1); // 1
//        System.out.println(value >>> 1); // 1
//    }
//    {
//        int total = 0;
//        total += 3_500;
//        total += 2_000;
//        total -= 500;
//        System.out.println(total);
//    }
    {
        int score = 65;
        String result
                = score >= 60
                ? "합격"
                : "재시험";
        System.out.println(result); // 합격
    }
}