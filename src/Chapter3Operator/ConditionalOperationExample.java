package Chapter3Operator;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
//        90이면 A , 아니면 넘어감-> 80이면 B 아니면 C
        char grade = (score > 90) ? 'A' : ((score > 80 ) ? 'B' : 'C');
        System.out.println("score ? " + score + "  grade ? " + grade );
    }
}
