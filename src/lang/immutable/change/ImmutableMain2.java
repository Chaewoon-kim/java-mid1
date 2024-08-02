package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);
        //새로운 객체를 만들어서 반환했으면 그 값을 받아야 하는데 받지 않고 있음
        //리턴 값을 버리는 꼴


        System.out.println("obj1 = " + obj1.getValue());
        //여기서 obj1의 값은 여전히 10.

    }
}
