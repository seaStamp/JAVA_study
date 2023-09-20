import java.util.Arrays;
public class Arrays6_3 {
    public static void main(String[] args)
    {
        int [] arr = {3,1,8,5,9,2,10,7,6,4};
        System.out.println(("Arrays.toString(arr) = " + Arrays.toString(arr)));
        System.out.println();

        Arrays.sort(arr); // 오름차순으로 정렬
        System.out.println("sort");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
