class Tv11_1 {
    //초기화 방법 - 명시적 초기화
    boolean power = false;  // 기본형 변수의 초기화
    int channel = 1;        // 기본형 변수의 초기화
    // Audio audi = new Audio(); // 참조형 변수의 초기화, 참조형은 객체주소 or null로 초기화
    // 참조형의 기본값은 null
    //...
}

class Tv11_2 {
    //초기화 블럭
    static boolean power;
    int channel;

    // 클래스 초기화 블럭
    static
    {
        power = false;
    }

    // 인스턴스 초기화 블럭
    {
        channel = 1;
    }

    // ...
}

class Tv11_3 {
    // 생성자 초기화

    // 속성 : 변수 선언
    boolean power; // 전우너상태
    int channel; // 채널
    String color; // 색깔
    long price; // 가격

    // 위 속성에서 필수로 초기값이 필요하나 값들을 초기화 해주는 기본 생성자
    Tv11_3() {
        this.power = false;
        this.channel = 1;
    }
}