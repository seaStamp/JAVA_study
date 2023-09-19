public class Control1_4 {
    public static void main(String[] args) {
        //중첩 if 예제
        int score = 87;

        if (score >= 90) {
            if(score >= 95) {
                System.out.println("A++등급입니다.");
            } else {
                System.out.println("A등급입니다.");
            }
        } else if (score >= 80) {
            if (score >= 85) {
                System.out.println("B++등급입니다.");
            } else {
                System.out.println("B등급입니다.");
            }
        } else if (score >= 70) {
            if (score >= 75) {
                System.out.println("C++등급입니다.");
            } else {
                System.out.println("C등급입니다.");
            }
        } else {
            System.out.println("D등급입니다.");
        }
    }
}
