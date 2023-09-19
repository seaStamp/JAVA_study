public class Control1_3 {
    public static void main(String[] args)
    {
        // 다중 if - else if - else 예제
        char ch = 'p';

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 대문자입니다.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("해당 문자는 영문 대문자입니다");
        } else {
            System.out.println("해당 문자는 영문자가 아닙니다.");
        }

        int score = 70;

        if (score >= 90) {
            System.out.println("A등급입니다.");
        } else if (score >= 80) {
            System.out.println("B등급입니다.");
        } else if (score >= 70) {
            System.out.println("C등급입니다.");
        }
    }
}
