public class KeyCodeExample {
    public static void main(String[] args) throws Exception{
//        throws Exception : 예외처리 지연처리
        int keyCode;

//        시스템이 가지고 있는 (System) 입력장치에서 (in) 입력된 키코드를 읽어라(read())
//        키보드에서 읽은 키 코드 출력
        keyCode = System.in.read();
        System.out.println("keyCode : " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode : " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode : " + keyCode);
//enter키는 캐리지 리턴 (CR : 13), 라인 피드 (LF : 10)으로 구성된 2개의 키코드가 입력된다

    }
}
