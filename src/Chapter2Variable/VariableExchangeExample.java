package Chapter2Variable;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x: "+ x + " y: " + y);

//        temp = 3
        int temp = x;
//        y = 5, x-> 5로 바뀜
        x = y;
//        3 =temp, 따라서 y는 3으로 바뀜
        y = temp;
//        따라서 x = 5, y = 3

        System.out.println("x: "+ x + " y: " + y);
    }
}
