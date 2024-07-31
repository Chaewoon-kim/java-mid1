package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1" , 2);
        Dog dog2 = new Dog("멍멍이2" , 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString()); //toString 메서드 오버라이딩 하지 않았음 -> Object.toString()메서드 실행
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());


        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car); //toString()을 호출하나 직접 호출하나 값은 같음
        System.out.println(dog1);
        System.out.println(dog2);


        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car); // 재정의된 자식 메서드가 따로 없기 때문에 Object.toString()메서드 실행
        ObjectPrinter.print(dog1); //타입은 Object이지만 재정의된 자식 메서드가 있기 때문에 Dog.toString()메서드 실행
        ObjectPrinter.print(dog2);



    }
}
