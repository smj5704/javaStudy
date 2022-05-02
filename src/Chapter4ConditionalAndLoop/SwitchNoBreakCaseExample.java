package Chapter4ConditionalAndLoop;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
//        8~11사이에 정수 뽑기
        int time = (int) (Math.random() * 4) + 8;
        System.out.println("now ?" + time + " o'clock");
//       break가 없으면 바로 다음으로 넘어가서 계속 출력된다
        switch (time) {
            case 8:
                System.out.println("go company");
            case 9 :
                System.out.println("discuss time");
            case 10 :
                System.out.println("work time");
            default :
                System.out.println("go out");
        }
    }
}
