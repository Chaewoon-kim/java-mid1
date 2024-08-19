package enumeration.ex2;

public class ClassGrade {

    //static 변수 사용해 메서드 영역에 위치 , final 을 사용해 참조값 변경 x , 객체 사용
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    //private 생성자 추가
    private ClassGrade(){}
}
