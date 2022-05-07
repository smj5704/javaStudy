package Chapter5ReferenceType;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[] {83, 90, 87 };
        int sum1 = 0;
        for(int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("total sum1 : " + sum1);
        //add메소드를 부름
        int sum2 = add( new int[]{83, 90, 87});
        System.out.println("total sum2 : " + sum2);
        System.out.println();
    }
    //총합을 계산해서 리턴하는 메소드. 정적함수 . 83,90,87을 가져와서 계산 후 리턴
    public static int add(int[] scores){
        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += scores[i];
        }
        //리턴하는 값의 자료형태와 일치해야하므로 sum은 int형태로 리턴된다.
        return sum;
    }
}
