package Chapter5ReferenceType;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        //리터럴
        strArray[0] = "java";
        //리터럴
        strArray[1] = "java";
        //객체
        strArray[2] = new String("java");

        //true
        System.out.println(strArray[0] == strArray[1]);
        //false
        System.out.println(strArray[0] == strArray[2]);
        //true
        //.equals : 문자열 비교
        System.out.println(strArray[0].equals(strArray[2]));
    }
}
