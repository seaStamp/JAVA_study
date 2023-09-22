public class Tv1_2 {
    // 속성 : 변수 선언
    String color; //색깔
    boolean power = false;  // 전원상태 : false로 초기화
    int channel = 1; // 채널 : 1로 초기화
    String brand; // 브랜드 이름 속성 추가

    // 기능 : 메서드 선언
    void power() { // 전원 기능
        power = !power;
        if (power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp() { //채널 증가 메서드
        channel++;
        System.out.println("채널 증가");
    }

    void channelDown() { //채널 감소 메서드
        channel--;
        System.out.println("채널 감소");
    }
}

class Tv1_2Main {
    public static void main(String[] args) {
        Tv1_2[] tvArr = new Tv1_2[3];

        for (int i = 0; i < 3; i++)
        {
            tvArr[i] = new Tv1_2();
        }

        tvArr[0].color = "보라색";
        tvArr[1].color = "주황색";
        tvArr[2].color = "핑크색";

        for (int i = 0; i < tvArr.length; i++)
        {
            System.out.println(i + 1 + "번째 Tv인스턴스 색깔: " + tvArr[i].color);
        }

        for (int i = 0; i < tvArr.length; i++) {
            System.out.print(i + 1 + "번째 Tv인스턴스 ");
            tvArr[i].power();
        }

        System.out.println();
        // 브랜드면 추가 전 비어있음을 확인
        for (int i = 0; i < tvArr.length; i++){
            System.out.print(i + 1 + "번째 Tv인스턴스의 브랜드 명: ");
            System.out.println(tvArr[i].brand);
        }
        System.out.println();

        // 새로운 참조변수에 배열 안에 들어있는 객체 주소 값 배정
        Tv1_2 samsung = tvArr[0];
        Tv1_2 lg = tvArr[1];
        Tv1_2 apple = tvArr[2];

        // 참조변수를 사용해서 배열안에 넣어준 객체에 접근해서 각 인스턴스에 브랜드 이름 추가하기
        samsung.brand = "samsung";
        lg.brand = "lg";
        apple.brand = "apple";

        for (int i = 0; i < tvArr.length; i++){
            System.out.print(i + 1 + "번째 Tv인스턴스의 브랜드 명: ");
            System.out.println(tvArr[i].brand);
        }
    }
}