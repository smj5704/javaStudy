package Chapter4ConditionalAndLoop;

public class ForSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i<=100; i++) {
            sum += i;
        }
        System.out.println("From1To100 Sum ? " + sum);
    }
}
