package Chapter2Variable;

public class PromotionExample {
    public static void main(String[] args) {
        //자동타입변환
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue ? " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가 Unicode ? " + charValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue ? " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue ? " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue ? " + doubleValue);


    }
}
