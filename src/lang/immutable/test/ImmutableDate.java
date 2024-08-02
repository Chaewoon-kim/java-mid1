package lang.immutable.test;

import lang.immutable.change.ImmutableObj;

//불변 클래스
public class ImmutableDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
//setter 메서드 생성 불가

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
    //새로운 객체 생성해 반환, 여기서는 년도만 변경
    public ImmutableDate withYear(int newYear){
        return new ImmutableDate(newYear,month,day);
    }

    //월 만 변경해서 새로운 객체 반환하는 메서드
    public ImmutableDate withMonth(int newMonth){
        return new ImmutableDate(year,newMonth,day);
    }

    //일 만 변경해서 새로운 객체 반환하는 메서드
    public ImmutableDate withDay(int newDay){
        return new ImmutableDate(year,month,newDay);
    }
}
