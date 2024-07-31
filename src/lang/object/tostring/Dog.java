package lang.object.tostring;

public class Dog {
    private String dogName;
    private int age;

    public Dog(String dogName , int age){
        this.dogName = dogName;
        this.age = age;
    }

    //toString() 메서드 재정의
    @Override
    public String toString(){
        return "Dog{" + "dogName '" + dogName + '\'' + ", age = " + age + '}';
    }


}
