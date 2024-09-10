package enumeration.ref1;

public class ClassGrade {

    //static 변수 사용해 메서드 영역에 위치 , final 을 사용해 참조값 변경 x , 객체 사용
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);


    private final int discountPercent;


    //생성자를 만들었기 때문에 위에 객체들은 discountPercent에 해당하는 인수들을 넣어줘야 함.
    public ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    //할인율 반환 메서드
    public int getDiscountPercent() {
        return discountPercent;
    }
}
