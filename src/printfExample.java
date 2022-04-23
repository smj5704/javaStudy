public class printfExample {
//    printf()메소드 사용법
public static void main(String[] args) {
    int value = 123;
//    %d : 정수
//    %6d : 6자리 정수, 왼쪽 빈 자리 공백 ex. 123 -> ___123
//    %-6d : 6자리 정수, 오른쪽 빈 자리 공백 ex. 123 -> 123___
//    %06d : 6자리 정수. 왼쪽 빈자리 0 채움 ex. 123 -> 000123

    System.out.printf("price : %d\n",value);
    System.out.printf("price : %6d\n",value);
    System.out.printf("price : %-6d\n",value);
    System.out.printf("price : %06d\n",value);
}
}
