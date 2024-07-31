package lang.object.tostring;

public class ObjectPrinter {
    //Object 타입을 생성자로 받는 메서드
    public static void print(Object obj){
        String string = "객체 정보 출력: " + obj.toString(); //toString()메서드는 Object클래스 내부에 존재
        System.out.println(string);
    }
}
