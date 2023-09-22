class StaticMethod7_1 {
    int num1, num2; // 인스턴스 변수 선언 (인스턴스 별로 달라도 되는 값)
    // static int num1 = 10, num2 = 20; // 클래스 변수 선언 (공유해야하는 값)

    static int add(int num1, int num2) { //메서드 반환 타입 앞에 static 이 붙었기에 static 메서드

        System.out.println();
        System.out.println("매개변수로 입력 받은 num1, num2 확인");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // 여기서 매개변수에 있는 num1,num2와 위에 인스턴스 변수로 선언한 num1, num2는 같지 않음. 서로영향X
        // 매개변수의 num1, num2는 지역변수로 add메서드가 종료되면 사라짐.
        // 인스턴스 변수는 클래스 메서드에서 사용하지 못함!

        // StaticMethod7_1에 선언한 변수를 사용하고 싶다면?
        // 인스턴스 변수가 아닌 클래스 변수로 선언하면됨 >> static 타입 변수이름;

        // 클래스 메서드에서 클래스 변수를 사용하는 예시

        // System.out.println("클래스변수 확인");
        // System.out.println("StaticMethod7_1.num1 = " + StaticMethod7_1.num1);
        // System.out.println("StaticMethod7_1.num2 = " + StaticMethod7_1.num2);

        System.out.println("num1 + num2 = " + (num1 + num2));
        return num1 + num2;
    }
}

class StaticMethod7_1Main {
    public static void main(String[] args) {
        StaticMethod7_1 methodTest = new StaticMethod7_1(); // 객체 생성
        methodTest.num1 = 10;
        methodTest.num2 = 20;

        // methodTeset.add(methodTest.num1, methodTest.num2); //불가능 코드.
        // add는 static 메서드 이기 때문에 객체로 생성된 참조변수로는 접근 불가

        // 클래스이름.메서드이름() 방식으로 static 메서드를 호출
        StaticMethod7_1.add(methodTest.num1, methodTest.num2);
    }
}
