package Chapter3Operator;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        int result = 0;
//        0 + 10
        result += 10;
        System.out.println("result = " + result);
//        10 - 5
        result -= 5;
        System.out.println("result = " + result);
//        5 x 3
        result *= 3;
        System.out.println("result = " + result);
//        15 / 5(몫)
        result /= 5;
        System.out.println("result = " + result);
//        3 % 3(나머지)
        result %= 3;
        System.out.println("result = " + result);
    }
}
