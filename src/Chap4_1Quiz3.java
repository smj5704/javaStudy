public class Chap4_1Quiz3 {
    public static void main(String[] args) {
        int score = 85;
        System.out.print("grade ? ");
        if(score < 70) {
            System.out.println("D");
        }else if(score < 80) {
            System.out.println("C");
        }else if(score < 90 ) {
            System.out.println("B");
        }else {
            System.out.println("A");
        }
        System.out.print("\n");
    }
}
