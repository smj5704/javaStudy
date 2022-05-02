package Chapter2Variable;

public class QStopExample {
    public static void main(String[] args) throws Exception{
        int keyCode;
//break ? while(true){}으 무한반복을 중지시켜줌
        while(true) {
            keyCode = System.in.read();

            System.out.println("keyCode : " + keyCode);
            if(keyCode == 113){
                break;
        }
        }
    }
}
