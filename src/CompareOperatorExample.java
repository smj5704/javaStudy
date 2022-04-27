public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
//        ()안은 조건문
//        true
        boolean result1 = (num1 == num2);
//        false
        boolean result2 = (num1 != num2);
//        true
        boolean result3 = (num1 <= num2);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
//        아스키 코드로 출력
//        65
        char char1 = 'A';
//        66
        char char2 = 'B';
//        true
        boolean result4 = (char1 < char2);
        System.out.println("result4 = " + result4);
    }
}
