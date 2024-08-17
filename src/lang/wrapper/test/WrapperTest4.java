package lang.wrapper.test;
//Q. 오토 박싱 , 오토 언박싱
public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";
        
        //1. String str을 Integer로 변환해서 출력해라.
        Integer integer1 = Integer.valueOf(str); //기본형으로 변환하고 싶을 때는 parseInt();
        System.out.println("integer1 = " + integer1);

        //2. Integer를 int로 변환해서 출력해라.
        int intValue = integer1;
        System.out.println("intValue = " + intValue);
        
        //3. int를 Integer로 변환해서 출력해라.
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);
    }
}
