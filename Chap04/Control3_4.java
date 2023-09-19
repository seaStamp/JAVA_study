public class Control3_4 {
    public static void main(String[ ] args){
        //중첩 for문
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단 시작합니다.");
            for (int j = 1; j < 10; j++) {
                System.out.println("j는 현재 " + (j) + "입니다.");
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }
}
