import java.util.Arrays;
public class Arrays6_2 {
    public static void main(String[] args) {
        // copyOf(), copyOfRange() 학습

        int[] arr = {0, 1, 2, 3, 4};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println();

        // copyOf(커피할 배열, 배열의 크기)
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr, 3);
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOf(arr, 7); // 범위가 넘어가는 값은 초기화 값
        System.out.println("Arrays.toString(arr4) = " + Arrays.toString(arr4));

        System.out.println();

        // copyOfRange(목적 배열, 시작요소, 끝요소(포함되지 않음))
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println("Arrays.toString(arr5) = " + Arrays.toString(arr5));
        int[] arr6 = Arrays.copyOfRange(arr, 1, 7); // 범위가 넘어가는 값은 초기화 값
        System.out.println("Arrays.toString(arr6) = " + Arrays.toString(arr6));
    }
}
