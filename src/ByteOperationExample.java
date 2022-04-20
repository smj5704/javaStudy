public class ByteOperationExample {
    public static void main(String[] args) {
        //정수타입의 연산 시 자동타입변환.
        byte result1 = 10 + 20;
        System.out.println(result1);

        byte x = 10;
        byte y = 20;
        int result2 = x + y;
//        x와y는 int로 형변환이 되었다.
        System.out.println(result2);

        char charValue = 'A';
        int intValue = charValue;
//        charValue는 형변환으로 인해 65로 값이 저장되었다.
        int result3 = x + y + charValue;
        System.out.println(result3);
    }
}
