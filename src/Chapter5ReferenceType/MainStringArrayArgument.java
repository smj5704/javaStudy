package Chapter5ReferenceType;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        //실행할때 매개값을 주지 않아서 길ㅇ 0인 String배열이 매개값으로 주어지면서
        // args.length가 0이 되므로 if문 실행 후 프로그램 강제 종료 된다.
        //매개값을 주려면 ?
        //이클립스 : run > run configurations > main > arguments > program argumets에 값입력 > apply
        if(args.length != 2){
            System.out.println("more data, please");
            //프로그램 강제 종료
            System.exit(0);
        }
        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
