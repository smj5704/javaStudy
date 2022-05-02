package Chapter2Variable;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        System.out.println("time ? " + "hour : " + hour + "  minute : " + minute);

        int totalMinute = (hour * 60 ) + minute;
        System.out.println("total Minute ? " + totalMinute);
     }
}
