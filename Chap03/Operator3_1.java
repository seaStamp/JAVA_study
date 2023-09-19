public class Operator3_1 {
    public static void main(String[] args)
    {
        int i = 2147483647, num = 10;
        char ch = 'A';
        float f = 1.8f;

        //utf-32로 인코딩해서 4byte까진 형변환하여 나타나는 듯 하다.
        System.out.println("(char)i = " + (char)i);
        System.out.println("(int)ch = " + (int)ch);
        System.out.println("(int)f = " + (int)f);
        System.out.println("(float)num = " + (float)num);
    }
}
