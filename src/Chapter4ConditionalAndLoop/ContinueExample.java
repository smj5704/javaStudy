package Chapter4ConditionalAndLoop;

public class ContinueExample {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            //홀수인경우에 루프위로 다시 돌아감.짝수는 내려가서 프린트 출력
            if(i%2 != 0) {
                continue;
            }
            //홀수는 실행되지 않음
            System.out.println(i);
        }
    }
}
