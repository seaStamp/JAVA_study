public class Control6_1 {
    public static void main(String[] args){
        //break 예제
        int sum = 0;
        int i = 0;

        while (true) {
            if(sum > 100)
                break;
            ++i;
            sum += i;
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
