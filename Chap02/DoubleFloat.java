public class DoubleFloat {
    public static void main(String[] args)
    {
        //float형 변수에선 뒤에 f,F표시를 해야한다. 안할시 double로 인식하고 에러남(이유 : double은 float보다 큰 변수형이기에)
        float var_float = 1.23f;
        double var_double = 1.23f; // 1.2300000190734863로 나옴.
        double var_double2 = (double)1.23f;// double로 캐스팅 해도 위와 같은 결과
        double var_double3 = 1.23;
        float var_float2 = (float)1.23; //1.23f랑 결과가 같음
        float var_float3 = (float)10041004678.23434252452345245235242; // 소수점 7자리까지만 표시되고 끊기는군..!
        //아니었다. 총 8자리의 숫자가 표시됨 >> 숫자가 커질수록 뭔가 증가됨. 넘쳐서 그러는듯
        double var_double4 = 1004100410051005678920.23434252452345245235242; // 소수점 16자리까지만 표시됨
        //마찬가지로 총 17자리의 숫자가 표시됨 아래의 숫자는 반올림하는듯. >> 또 숫자가 너무 커지면 반올림은 안됨


        System.out.println("var_float : "+ var_float + "\nvar_double : " + var_double);
        System.out.println("var_double2 : "+ var_double2 + "\nvar_double3 : " + var_double3);
        System.out.println("var_float2 : " + var_float2);
        System.out.println("var_float3 : " + var_float3);
        System.out.println("var_double4 : " + var_double4);
    }
}
