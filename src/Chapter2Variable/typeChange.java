package Chapter2Variable;

public class typeChange {
    public static void main(String[] args) {
//        자동 타입 변환**
//        int가 허용범위가 더 커서 자동으로 타입변환이 일어나는데
//        char 타입인 경우에는 int타입에 유니코드숫자가 저장된다.
        char charValue = 'A';
        int intValue = charValue;

        System.out.println("intValue?"+intValue);

        //float 가 허용범위가 더 크므로 longValue가 float로형변환이 일어남.
        //소수점으로 출력
        long longValue= 100;
        float floatValue = longValue;

        System.out.println("floatValue?"+floatValue);
    }
}
