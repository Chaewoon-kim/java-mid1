package lang.object;

public class Child extends Parent/*명시적으로 상속 -> Object 상속x */{
    public void childMethod(){
        System.out.println("Child.childMethod");
    }
}
