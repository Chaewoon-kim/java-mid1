package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString()반환값 출력
        System.out.println(string);
        //object 직접 출력
        System.out.println(object);

        //둘의 값이 같은 이유: System.out.println() 메서드는 사실 내부에서 toString()을 호출.
        //따라서 toString()을 직접 호출하나 object를 직접 호출하나 값이 같음

    }
}
