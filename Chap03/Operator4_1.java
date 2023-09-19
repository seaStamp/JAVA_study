public class Operator4_1 {
    public static void main(String[] args)
    {
        int a = 10, b = 4;
        float c = 1.4f;

        //덧셈
        System.out.print("a + b = ");
        System.out.print(a + b);

        //뺄셈
        System.out.print("a - b = ");
        System.out.println(a - b);

        // 곱셈
        System.out.print("a * b = ");
        System.out.println(a * b);

        // 나눗셈
        // 소수점 이하는 버려진다.
        System.out.print("a / b = ");
        System.out.println(a / b);

        // 10 / 4.0f -> 10.0f / 4.0f -> 2.5
        System.out.print("a / (float)b = ");
        System.out.println(a / (float)b);
        System.out.print("c = ");
        System.out.println(c);
    }
}
