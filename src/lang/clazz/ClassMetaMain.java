package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception{
        //*Class 조회
        
        Class clazz = String.class; // 1. 클래스에 대한 정보 조회
        //Class clazz1 = new String().getClass(); //2. 인스턴스에서 조회 (getClass())
        //Class clazz2 = Class.forName("java.lang.String"); // 3. 문자열로 조회 (전체이름 다 적어줘야 함)
        
        //* 모든 필드 출력 (getDeclaredFields)
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + " " + field.getName());
        }

        //* 모든 메서드 출력 (getDeclaredMethods)
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        //* 상위 클래스 정보 출력
        System.out.println("SuperClas: " + clazz.getSuperclass().getName()); //Object 클래스

        //* 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("interface = " + i.getName());
        }
    }
}
