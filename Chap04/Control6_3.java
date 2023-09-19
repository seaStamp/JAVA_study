public class Control6_3 {
    public static void main(String[] args){
        //이름붙은(lable) 반복문
        allLoop :
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    break allLoop;
                }
                System.out.println(i + "*" + j + " = " + (i * j));
            }
        }
    }
}
