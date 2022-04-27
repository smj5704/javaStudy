public class CharOperationExample {
    public static void main(String[] args) {
//        char c1 = bb로 컴파일 된다
        char c1 = 'A' + 1;
        char c2 = 'A';
//        char변수가 산술연산자로 사용을 하면 int 타입으로 변환되어서 결과가 int가 되서 에러. ex. char c3 = c2 + 1;
        System.out.println(c1);
        System.out.println(c2);
    }
}
