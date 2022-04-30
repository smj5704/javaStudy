public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'B';

//        대소문자 구분 안하게 하기 위해
        switch (grade) {
            case 'A' :
            case 'a' :
                System.out.println("grade : A");
                break;
            case 'B' :
            case 'b' :
                System.out.println("grade : B");
                break;
            default :
                System.out.println("try membership!");
        }
    }
}
