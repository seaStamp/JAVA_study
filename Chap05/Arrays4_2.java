import java.util.Arrays;
public class Arrays4_2 {
    public static void main(String[] args)
    {
        //문자열 배열
        String[] strArr = {"축구", "야구", "골프", "테니스"};
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        String[] strArr2 = new String[4];
        System.out.println("Arrays.toString(strArr2) = " + Arrays.toString(strArr2));
        strArr2[0] = "Hello";
        strArr2[1] = "My";
        strArr2[2] = "name is";
        System.out.println("Arrays.toString(strArr2) = " + Arrays.toString(strArr2));
    }
}
