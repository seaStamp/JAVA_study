public class Arrays2_2 {
    public static void main(String[] args) {
        int [] num1 = new int[]{1,2,3,4,5,6,7,8,9};
        int [] num2 = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < num2.length; i++){
            System.out.println("num1[" + i + "] = " + num1[i]);
        }
        System.out.println();
        for (int i = 0; i < num2.length; i++){
            System.out.println("num2[" + i + "] = " + num2[i]);
        }

        System.out.println();

        // 주의 할 점!
        int[] num3;
        //num3 = {1,2,3,4,5,6,7,8,9}; // Error 발생합니다. 선언해줄 때 주소값 및 공간이 정해지기때문에

        // 위처럼 나눠서 표현을 해야 한다면 이렇게 초기화해야한다.
        num3 = new int[]{1,2,3,4,5,6,7,8,9};
        num3 = new int[]{1,2,3};

        for (int i = 0; i < num3.length; i++) {
            System.out.println("num3[" + i + "] = " + num3[i]);
        }
    }
}
