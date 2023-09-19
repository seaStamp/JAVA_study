public class Variable3_3 {
    public static void main(String[] args)
    {
        int num = 5;
        char ch = '5';

        // 숫자 -> 문자열
        System.out.print("num + \"\" = ");
        System.out.println(num + "");
        // num 이 "5"로 변환되었기 때문에 "5"+"5" 로 결과값은 "55"
        System.out.print("num + \"\" + 5 = ");
        System.out.println(num + "" + 5);

        System.out.print("num + 5 + \"\" = ");
        System.out.println(num + 5 + "");

        // 문자 -> 문자열
        System.out.print("ch + \"\" = ");
        System.out.println(ch + "");
        // ch 이 '5'에서 "5"로 변환되었기 때문에 "5"+"8" 로 결과값은 "58"
        System.out.print("ch + \"\" + 8 = ");
        System.out.println(ch + "" + 8);
    }
}
