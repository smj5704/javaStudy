package Chapter5ReferenceType;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "minchul";
        String strVar2 = "minchul";

        if(strVar1 == strVar2) {
            System.out.println("Reference is same");
        }else{
            System.out.println("Reference is different");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("Same String");
        }

        String strVar3 = new String("minchul");
        String strVar4 = new String("minchul");

        //new 연산자로 생성시 ==연산자는 번지를 비교하기 때문에 같지 않다는 결과를 낸다.
        if(strVar3 == strVar4){
            System.out.println("Reference is same");
        }else{
            System.out.println("Reference is different");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("Same String");
        }
    }
}
