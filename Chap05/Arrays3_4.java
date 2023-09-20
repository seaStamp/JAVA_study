import java.util.Arrays;
public class Arrays3_4 {
    public static void main(String[] args)
    {
        //랜덤으로 숫자 섞기
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("원본 = " + Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++)
        {
            int num = (int)(Math.random() * 10);
            int tmp = numArr[0]; // 배열의 첫 번째 수로 계속 초기화 된다.

            numArr[0] = numArr[num];
            numArr[num] = tmp;

            System.out.println(i + 1 + " 번째 변경 : " + Arrays.toString(numArr));
        }

        System.out.println("결과 = " + Arrays.toString(numArr));

    }
}
