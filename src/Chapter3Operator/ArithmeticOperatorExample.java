package Chapter3Operator;

public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;

        int result1 = v1 + v2;
        System.out.println("result1=" + result1);

        int result2 = v1 - v2;
        System.out.println("result2=" + result2);

        int result3 = v1 * v2;
        System.out.println("result3=" + result3);

        //몫(나머지 없이)
        int result4 = v1 / v2;
        System.out.println("result4=" + result4);

        //나머지
        int result5 = v1 % v2;
        System.out.println("result5=" + result5);

        //수수점까지 보이게
        double result6 = (double) v1 / v2;
        System.out.println("result6=" + result6);
    }
}
