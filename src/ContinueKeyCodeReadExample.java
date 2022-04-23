public class ContinueKeyCodeReadExample {
    public static void main(String[] args) throws Exception{
        int keyCode;

//        무한반복
        while(true) {
            keyCode = System.in.read();
            System.out.println("keyCode : " + keyCode);
        }
    }
}
