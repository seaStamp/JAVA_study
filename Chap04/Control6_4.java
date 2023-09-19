public class Control6_4 {
    public static void main(String[] args){
        //이름붙은(lable) 반복문2
        int i = 2;
        allLoop :
        while (true) {
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    break allLoop;
                }
                System.out.println(i + "*" + j + " = " + (i * j));
            }
            i++;
        }
    }
}
