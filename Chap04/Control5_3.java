public class Control5_3 {
    public static void main(String[] args)
    {
        //do-while문 예제
        int j = 1;

        do {
            System.out.println("do / while 문이 " + j + "번째 반복 실행중입니다.");
            j++; // 이 부분을 삭제하면 무한 루프
        } while (j <20) ;

        System.out.println("do / while 문이 종료된 후 변수 j의 값은 " + j + "입니다.");
    }
}
