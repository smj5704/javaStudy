package Chapter4ConditionalAndLoop;

public class Chap4_1Quiz4 {
    public static void main(String[] args) {
        System.out.println("choice!");
        char grade = 'C';
        switch (grade) {
            case 'A' :
                System.out.println("VVIP");
            case 'B' :
                System.out.println("VIP");
                break;
            case 'C' :
                System.out.println("A");
            default :
                System.out.println("B");
                break;
        }
        System.out.println("thank you!");

    }
}
