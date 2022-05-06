package Chapter4ConditionalAndLoop;

public class BreakOutterExample {
    public static void main(String[] args) {
        Outter : for(char upper = 'A'; upper <= 'Z'; upper++) {
            for(char lower = 'a'; lower <= 'z'; lower++){
                System.out.println(upper + "_" + lower);
                if(lower == 'g'){
                    //바깥 폼 까지 완전히 break
                    break Outter;
                }
            }
        }
    }

}
