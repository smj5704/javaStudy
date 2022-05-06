package Chapter4ConditionalAndLoop;

public class Chap4_2Quiz5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++){
                System.out.println("*");
                if(j == i){
                    System.out.println();
                }
            }
        }
    }

}
