package Chapter2Variable;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws Exception{
//        scanner라는 라이브러리를 사용하기 위해 new명령문을 통해 scanner 인스턴스를 () -> 생성
        Scanner sc = new Scanner(System.in);
//        sc라는 참조변수를 토애 scanner메서드에 접근함.
        String inputData;

        while(true) {
            inputData = sc.nextLine();
            sc.close();
//            \"\" : escape문자
            System.out.println("inputData? \"" + inputData + "\"");
//            정수 실수에서는 ==를 사용했지만 string은 equals를 사용해야한다
//            스캐너에 q입력시 반복문을 빠져나가고 stop 출력
            if(inputData.equals("q")) {
                break;
            }
        }
        System.out.println("stop");
    }
}
