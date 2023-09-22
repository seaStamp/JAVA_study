import java.sql.Time;

class Time3_1 {
    // 클래스를 사용하여 사용자 시간을 기록하기
        int hour, minute, second;
}

class Time3_1Main {
    public static void main(String[] args)
    {
        // 총 3명의 시간을 객체로 관리
        Time3_1 t1 = new Time3_1();
        Time3_1 t2 = new Time3_1();
        Time3_1 t3 = new Time3_1();

        Time3_1[] timeArr = new Time3_1[3];
        timeArr[0] = new Time3_1();
        timeArr[1] = new Time3_1();
        timeArr[2] = new Time3_1();
    }
}
