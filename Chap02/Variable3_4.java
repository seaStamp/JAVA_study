public class Variable3_4 {
    public static void main(String[] args)
    {
        String str1 = "100";
        String str2 = "1.14"; // 정수부분이 2자리 이상이면 상관없는데 1의 자리 이상이면 오류가 난다. 왜일까
        String str3 = "8";

        double d;
        d = Double.parseDouble(str2);
        d = d + 1d;

        // 문자열 -> 숫자
        System.out.print("Integer.parseInt(str1) + 1 = ");
        System.out.println(Integer.parseInt(str1) + 1);
        // Integer.parseInt() 은 int 타입만가능
        // System.out.println("Integer.parseInt(str2) = " + Integer.parseInt(str2));
        System.out.print("Double.parseDouble(str2) + (double)(1) = ");
        System.out.println(Double.parseDouble(str2) + (double)(1));
        System.out.println("d = " + d);

        // 문자열 -> 문자
        System.out.println("str.charAt(0) = " + str1.charAt(0) + str1.charAt(1) + str1.charAt(2));
        System.out.println("str3.charAt(0) = " + str3.charAt(0));
    }
}
