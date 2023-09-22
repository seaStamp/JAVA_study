public class Tv1_1 {
    // 속성 : 변수 선언
    String color; //색깔
    boolean power = false;  // 전원상태 : false로 초기화
    int channel = 1; // 채널 : 1로 초기화

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

class Tv1_1Main {
    public static void main(String[] args)
    {
        Tv1_1 t1 = new Tv1_1(); // TV1 인스턴스
        t1.color = "검정색"; // 색깔 초기화
        Tv1_1 t2 = new Tv1_1(); // TV2 인스턴스
        t2.color = "흰색"; // 색깔 초기화

        System.out.println("TV1 인스턴스 색깔 = " + t1.color);
        System.out.println("TV2 인스턴스 색깔 = " + t2.color);

        t1.power(); // 메서드 호출
        System.out.println("TV1 인스턴스 채널 : " + t1.channel);

        t1.channelUp(); // 메서드 호출
        System.out.println("TV1 인스턴스 채널 : " + t1.channel);
        t1.channelDown(); //메서드 호출
        System.out.println("TV1 인스턴스 채널 : " + t1.channel);

        t1.power(); // 메서드 호출

        // TV2 인스턴스 참조변수에 TV1 인스턴스의 주소를 저장 했을 때
        t2 = t1; // t1과 같은 객체를 가리키도록 하고있음

        System.out.println("TV1 인스턴스 색깔 = " + t1.color); // 검정색
        System.out.println("TV2 인스턴스 색깔 = " + t2.color); // 검정색

        // 흰색이었던 TV2 인스턴스의 색깔이 검정색으로 바뀐건가요?
        // 아닙니다.
        // 참조변수 t2에 저장되어있던 TV2 인스턴스의 주소가 없어지고
        // TV1의 주소가 t2 참조변수에 저장이 됩니다.

        // 따라서 t2 = t1; 이후 부터는
        // t2 참조변수로는 더 이상 TV2 인스턴스에 접근할 수 없습니다.
    }
}