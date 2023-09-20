public class Arrays2_1 {
    public static void main(String[] args)
    {
        int [] arr = new int [10];
        System.out.println("배열의 길이 = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println();
        // index 범위를 벗어나는 경우 Error 발생
        for (int i = 0; i < arr.length + i; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}

class Solution {
    public int solution(int[] array) {
        int [] minCheck = new int [2];
        int len = array.length;

        minCheck[0] = array[len-1];

        for(len = len ; len > -1 ; len--){
            if(array[len-1] == minCheck[0]){
                minCheck[1] = 1;
            } else {
                minCheck[1] = 0;
                minCheck[0] = (array[len-1] < minCheck[0])?array[len-1]:minCheck[0];
            }
        }
        if (minCheck[1] == 1)
            return -1;
        return minCheck[0];
    }
}