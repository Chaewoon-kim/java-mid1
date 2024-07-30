package lang.object;

public class objectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod(); //상속

        //toString()은 Object 클래스의 메서드. child -> parent -> object
        String string = child.toString(); //toString() -> 객체에 관한 정보 제공
        System.out.println(string);
    }
}
