package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; //반복 횟수 설정
        long startTime , endTime;

        //기본형 long사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for(int i = 0 ; i < iterations ; i ++){
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");

        //래퍼클래스 long 사용
        Long sumWrapper = 0L; //기본형과 다르게 뒤에 L 표기
        startTime = System.currentTimeMillis();
        for(int i = 0 ; i < iterations; i++){
            sumWrapper += i; //오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime - startTime) + "ms");
        //기본형과는 다르게 래퍼 클래스는 객체이기 때문에 기본형의 값 뿐만 아니라 객체 메타 데이터를 포함하고 있으므로 더 많은 메모리 사용.
    }

}
