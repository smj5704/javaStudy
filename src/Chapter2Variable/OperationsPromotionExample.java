package Chapter2Variable;

public class OperationsPromotionExample {
    public static void main(String[] args) {
//        자동타입변환 연산
        int intValue = 10;
        double doubleValue = 5.5;
        double result1 = intValue + doubleValue;
        System.out.println(result1);
//       강제타입변환 연산
//        double타입이었던 5.5가 강제타입변환으로 인해 5로 바뀜.
        int result2 = intValue + (int)doubleValue;
        System.out.println(result2);

//        문자열 타입변환 - 유니코드
        char charValue = 'A';
        intValue = charValue;
//        자동타입변환으로 인해 charValue는 int(65(유니코드))가 되었다.연산과정에서 double로 한번 더 형변환이 일어남. -> 65.0 + 5.5
        System.out.println("intValue?"+intValue);
        double result3 = charValue + doubleValue;
//        강제 타입변환으로 인해 doubleValue가 int타입으로 바뀌면서 5로 저장되었다. -> 65 + 5
        int result4 = charValue + (int)doubleValue;
        System.out.println(result3);
        System.out.println(result4);



    }
}
