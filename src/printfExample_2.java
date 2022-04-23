public class printfExample_2 {
    //    printf()메소드 2
    public static void main(String[] args) {
        double area = 3.14159 * 10 *10;
        System.out.printf("%d, circle area ? %10.2f\n",10,area);

        String name = "Hong";
        String job = "teacher";

        System.out.printf("%6d | %-10s | %10s\n", 1, name , job);
    }
}

