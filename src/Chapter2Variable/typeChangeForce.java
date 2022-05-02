package Chapter2Variable;

public class typeChangeForce {
    public static void main(String[] args) {
        int intValue = 65;
        //강제타입변환, 허용범위가 더 작은 char로 int를 형변환.
        char charValue = (char)intValue;
        //int값이 65 유니코드 65인 문자열 출력 (A)
        System.out.println("carValue?"+charValue);

        //허용범위가 더 큰 double을 강제로 int로 형변환을 시켜서 소수점이 날라감.
        double doubleValue = 3.14;
        intValue = (int)doubleValue;
        System.out.println("intValue?"+intValue);
    }
}
