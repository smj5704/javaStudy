public class ForMultiplicationTableExample {
    public static void main(String[] args) {
        for(int m = 2; m<=9; m++) {
            System.out.println("*** " + m + " ***");
//            m번 돌아가는 곳 안에서 n번 돌아간다
            for(int n = 1; n<=9; n++) {
                System.out.println(m + " x " + n + " = " + (m * n));
            }
        }
    }
}
