package Chapter3Operator;

public class Chap3Quiz4 {
//    534자루 연ㅇ필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 1인당 몇개를 가질 수 있고 몇 개가 남는가
    public static void main(String[] args) {
        int pencils = 543;
        int students = 30;
//        몫
        int pencilsPerStudents = pencils / students;
        System.out.println(pencilsPerStudents);
//        나머지
        int pencilsLeft = pencils % students;
        System.out.println(pencilsLeft);
    }
}

