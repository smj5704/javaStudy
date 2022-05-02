package Chapter2Variable;

public class printfExample_2 {
    //    printf()메소드 2 - 형식 문자열 (실수 , 문자열 , 특수문자)
    public static void main(String[] args) {
        double area = 3.14159 * 10 *10;
//        %10.2f : 실수. 소수점 이상 7자리 , 소수점 이하 2자리. 왼쪽 빈자리는 공백 ex.123.45 -> ____123.45
//        %-10.2f : 실수. 소수점 이상 7자리 , 소수점 이하 2자리. 오른쪽 빈자리는 공백 ex.123.45 -> 123.45____
//        %010.2f : 실수. 소수점 이상 7자리 , 소수점 이하 2자리. 왼쪽 빈자리는 0 ex.123.45 -> 0000123.45

//        %s : 문자열
//        %6s : 6자리 문자열, 왼쪽 빈자리 공백
//        %-6s : 6자리 문자열, 오른쪽 빈자리 공백
//
//        특수문자 ?
//        \t : 탭 (tab키)
//        \n : 줄 바꿈
//        %% : %

        System.out.printf("%d, circle area ? %10.2f\n",10,area);

        String name = "Hong";
        String job = "teacher";

        System.out.printf("%6d | %-10s | %10s\n", 1, name , job);
    }
}

