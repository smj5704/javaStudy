public class LogicalOperatorExample {
    public static void main(String[] args) {
//        유니코드인 65로 출력
        int charCode = 'A';

        if((charCode>=65) & (charCode<=90)) {
            System.out.println(charCode + "? uppercase");

        }
        int charCode2 = 'a';
        if((charCode2>=97) && (charCode2<=122)){
            System.out.println(charCode2 + "? lowercase");
        }
//        48 <= charCode <= 57
        if(!(charCode>=48) && !(charCode>57)) {
            System.out.println("0~9 number");
        }

        int value = 6;
//        2또는 3의 배수?
        if((value%2 == 0) | (value%3 == 0)){
            System.out.println("3");
        }
//        2또는 3의 배수?
        if((value%2 == 0) || (value%3 == 0)){
            System.out.println("2 or 3");
        }
    }
}
