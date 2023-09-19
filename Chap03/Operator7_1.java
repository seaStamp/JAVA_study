public class Operator7_1 {
    public static void main(String[] args)
    {
        boolean r1, r2, r3, r4, r5, r6;

        char ch1 = 'a', ch2 = 'B'; // 'a' : 97, 'A' : 65, 'B' : 66, 'C' : 67

        r1 = ch1 > 'A' && ch2 < 'C'; //true
        r2 = ch1 == 'A' && ch2 < 'C'; // false

        r3 = ch1 > 'A' || ch2 == 'C'; // true
        r4 = ch1 < 'A' || ch2 > 'C'; // false

        System.out.println("&& 연산자에 의한 결과 r1 = " + r1); // true
        System.out.println("&& 연산자에 의한 결과 r2 = " + r2); // false

        System.out.println("|| 연산자에 의한 결과 r3 = " + r3); // true
        System.out.println("|| 연산자에 의한 결과 r4 = " + r4); // false

        System.out.println("! 연산자에 의한 결과 r4 = " + !r4); // true

        System.out.println();

        int num = 10;
        // num은 2의 배수 그리고 3의 배수이다.
        r5 = num % 2 == 0 && num % 3 ==0;
        System.out.println("num은 2의 배수 그리고 3의 배수 = " + r5);// false

        // num은 2의 배수 또는 3의 배수이다.
        r6 = num % 2 == 0 || num % 3 ==0;
        System.out.println("num은 2의 배수 또는 3의 배수 = " + r6);// true

    }
}
