package Chapter3Operator;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("----------------");
        //11
        x++;
        //12
        ++x;
        System.out.println("x ? " + x);

        System.out.println("----------------");
        //9
        y--;
        //8
        --y;
        System.out.println("y ? " + y);

        System.out.println("----------------");
        //x를 증가시키지 않고 에 먼저 위에 x값을 대입
        z = x++;
        //12
        System.out.println("z ? " + z);
//        이후에 1증가
//        13
        System.out.println("x ? " + x);

        System.out.println("----------------");
//        x를 증가 시킨 후 z에 대입
        z = ++x;
//        14
        System.out.println("z ? " + z);
//        14
        System.out.println("x ? " + x);
    }
}
