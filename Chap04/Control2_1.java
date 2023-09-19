public class Control2_1 {
    public static void main(String[] args)
    {
        // switch문 예제
        int month = 11;
        String monthString = "";
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            case 0: case 13:
                System.out.println("이런식으로 case 문을 사용할 수 있습니다.");
                break;
            case 15:
            default: monthString = "Invalid month";
        }
        System.out.println(monthString);

    }
}
