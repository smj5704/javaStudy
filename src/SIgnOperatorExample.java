public class SIgnOperatorExample {
    public static void main(String[] args) {
        int x = 100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1?" + result1);
        System.out.println("result2?" + result2);

        byte b = 100;
//        byte타입을 부호 연산하면 int타입으로 바껴서 에러 뜬다 ex. byte result3 = -b; (x)
        int result3 = -b;
        System.out.println("result3?" + result3);
    }
}
