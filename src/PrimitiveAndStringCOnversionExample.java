public class PrimitiveAndStringCOnversionExample {
    public static void main(String[] args) {
//        문자열을 기본타입으로 형변환
//        int val1 = Integer.parseInt("10.0"); -> 에러. int형식으로 적어줘야함,
        int val1 = Integer.parseInt("10");
        double val2 = Double.parseDouble("3.14");
        boolean val3 = Boolean.parseBoolean("true");

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);

//        기본타입을 문자열(String)로 변환
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
