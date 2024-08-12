package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); //숫자를 래퍼 객체로 변환
        Integer i2 = Integer.valueOf("10"); //문자열을 래퍼 객체로 변환
        int intValue = Integer.parseInt("10"); //문자열 전용 ,  기본형으로 변환 parseInt()
        // valueOf() vs parseInt() -> 반환형을 객체로 받을 것이냐 아니면 기본형으로 받을 것이냐의 차이

        
        //비교 compareTo()
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        //산술 연산
        System.out.println("sum = " + Integer.sum(10,20)); //합 메서드
        System.out.println("min = " + Integer.min(10,20)); //최솟값 메서드
        System.out.println("max = " + Integer.max(10,20)); //최댓값 메서드
    }
}
