package enumeration.ref2;

public enum Grade {
    //enum(열거형)도 결국 클래스이기 때문에 상수 마지막에 괄호를 열고 생성자에 맞는 인수를 전달
    //적절한 생성자가 호출
    BASIC(10) , GOLD(20), DIAMOND(30);

    private final int discountPercent;

    //private이 생략된 생성자
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    //값을 조회하기 위한 메서드 , 위에서 말했듯이 열거형도 결국 클래스이므로 메서드 추가할 수 있음
    public int getDiscountPercent() {
        return discountPercent;
    }
}
