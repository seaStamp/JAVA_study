public class Operator2_1 {
    public static void main(String[] args)
    {
        int k = 0, j = 3;

        // 후위 형
        k = j++;
        System.out.println("k = j++;, k = " + k);
        System.out.println("k = j++;, j = " + j);

        // 값 초기화
        k = 0;
        j = 3;

        // 전위 형
        k = ++j;
        System.out.println("k = ++j;, k = " + k);
        System.out.println("k = ++j;, j = " + j);

    }
}
