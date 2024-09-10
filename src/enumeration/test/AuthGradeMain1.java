package enumeration.test;
//인증 등급 열거형 [조회]하기
//AuthGrade를 활용해 다음 결과가 출력되도록 코드를 작성해라.
public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("grade = " + value.name() + ", level = " + value.getLevel() + ", 설명 = " + value.getDescription());
        }
    }
}
