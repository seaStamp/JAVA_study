public class Operator8_1 {
    public static void main(String[] args)
    {
        //삼항 연산자 - 조건식? 반환값1 : 반환값2
        int num1 = 8, num2 = 12;
        int result;

        result = num1 - num2 > 0 ? num1 : num2;

        System.out.println("두 정수 중 더 큰 수는 " + result + "입니다."); // 12
    }
}
