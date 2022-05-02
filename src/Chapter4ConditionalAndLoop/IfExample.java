package Chapter4ConditionalAndLoop;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if(score>=90) {
            System.out.println("up 90");
            System.out.println("grade : A ");
        }

        if(score<90) {
            System.out.println("down 90");
            System.out.println("grade : B");
        }
    }
}
