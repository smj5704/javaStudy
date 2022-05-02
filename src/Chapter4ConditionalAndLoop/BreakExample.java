package Chapter4ConditionalAndLoop;

public class BreakExample {
    public static void main(String[] args) {
        while(true) {
            int num = (int) ((Math.random()*6)+1);
            System.out.println("random num ? " +num);

            if(num == 6) {
                break;
            }
        }
        System.out.println("numbe 6 ! finish");
    }
}
