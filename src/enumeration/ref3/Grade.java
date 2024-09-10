package enumeration.ref3;

public enum Grade {
    BASIC(10) , GOLD(20) , DIAMOND(30) , VIP(40);

    private final int discouintPercent;

    Grade(int discouintPercent) {
        this.discouintPercent = discouintPercent;
    }

    public int getDiscouintPercent() {
        return discouintPercent;
    }

    //추가 메서드 -> Grade 값을 꺼내 외부에서 사용하는 것이 아니라 스스로 계산하게끔 (객체지향의 관점)
    public int discount(int price){
        return price * discouintPercent / 100;
    }
}
