package Chapter3Operator;

import java.util.Scanner;

public class Chap3Quiz11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("id ? ");
        String id = sc.nextLine();

        System.out.println("pw ? ");
        String strpw = sc.nextLine();
        int pw = Integer.parseInt(strpw);

        if(id.equals("java")) {
            if(pw == 12345) {
                System.out.println("success!");
            }else {
                System.out.println("check your pw");
            }
        }else {
            System.out.println("check your id");
        }

    }
}
