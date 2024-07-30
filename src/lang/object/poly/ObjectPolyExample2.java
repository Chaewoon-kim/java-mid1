package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); //object 인스턴스도 만들 수 있음

        //Object 배열 -> 최상위 부모인 object는 모든 타입의 객체를 담을 수 있음
        Object [] objects = {dog, car , object};

        size(objects);
    }
    //인스턴스는 Object 타입이기 때문에, 새로운 클래스가 추가되거나 변경되어도 메서드 수정 필요 x
    private static void size(Object [] objects){
        System.out.println("전달된 객체의 수: " + objects.length);
    }
}
