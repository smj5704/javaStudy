package Chapter2Variable;

public class StringConcatExample {
    public static void main(String[] args) {
//        문자열이 결합된다
        String str1 = "JDK" + 6.0;
        String str2 = str1 + " character";
        System.out.println(str2);
//        문자열과 숫자가 혼합된 + 연산식은 왼쪽에서 오른쪽으로 연산이 진행도니다. 따라서 문자열의 결합이 이루어진다.
        String str3 = "JDK" + 3 + 3.0;
//        위와같은 이유로 숫자 연산이 먼저 이루어진 후 문자열 결합이 이루어진다
        String str4 = 3 + 3.0 + "JDK";
        System.out.println(str3);
        System.out.println(str4);
    }
}
