package Chapter3Operator;

public class CompareOperatorExample2 {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;
        //true
        System.out.println(v2 == v3);

        double v4 = 0.1;
        double v5 = 0.1f;
        //false
        System.out.println(v4 == v5);

        //true
        System.out.println((float)v4 == v5);
    }
}
