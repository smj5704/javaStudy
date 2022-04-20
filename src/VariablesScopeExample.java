import java.util.Scanner;

public class VariablesScopeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2;
        if(v1 > 10 ){
            v2 = v1 - 10;
        }
        v2 = v1 + 5;
        System.out.println("v2 ? " + v2);
    }
}
