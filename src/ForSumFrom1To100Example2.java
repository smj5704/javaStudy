public class ForSumFrom1To100Example2 {
    public static void main(String[] args) {
        int sum = 0;

        //루프 카운터 변수
        int i = 0;
        for(i = 1; i<=100; i++) {
            sum += i;
        }
        System.out.println("1 ~ " + (i-1) + " Sum ? " + sum);
    }
}
