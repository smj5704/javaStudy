package Chapter4ConditionalAndLoop;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if(score>=90) {
            System.out.println("score : 90 ~ 100");
            System.out.println("grade : A");
        }else if(score>=80){
            System.out.println("score : 80 ~ 89");
            System.out.println("grade : B");
        }else if(score>=70) {
            System.out.println("score : 70 ~ 79");
            System.out.println("grade : C");
        }else {
            System.out.println("score : 60 down");
            System.out.println("grade : D");
        }
    }
}
