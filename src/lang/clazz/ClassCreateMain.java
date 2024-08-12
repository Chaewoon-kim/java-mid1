package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception{
        //*클래스 정보 조회 방법
        Class helloClass = Hello.class;
        //Class helloClass1 = Class.forName("java.lang.clazz.Hello");

        
        //getDeclaredConstructor().newInstance()를 통해 동적으로 인스턴스 생성
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
