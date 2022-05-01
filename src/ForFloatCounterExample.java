public class ForFloatCounterExample {
    public static void main(String[] args) {
//        float 타입은 정확하게 표현하기 힘들어서 9번만루프가 돌아간다
        for(float x = 0.1f; x<=1.0f; x+=0.1f) {
            System.out.println(x);
        }
    }
}
