public class Chap3Quiz10 {
    public static void main(String[] args) {
//        방법 1
        int var1 = 10;
        int var2 = 3;
        int var3 = 14;
        double result1 = var1 * var1 * Double.parseDouble(var2 + "." + var3);

        System.out.println("circle1 ? " + result1);
//        방법 2
        String pie1 = String.valueOf(var2);
        String pie2 = String.valueOf(var3);
        String strPie = pie1 + "." + pie2;

        double pie = Double.parseDouble(strPie);
        double result2 = pie * var1 * var1;

        System.out.println("circle2 ? " + result2);
    }
}
