package lang.object.test;

import java.util.Objects;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    //equals 메서드 오버라이딩 equals() -> == 으로 값을 비교하기 때문에 재정의 필요
    @Override
    public boolean equals(Object o) {
        //본인의 값과 인스턴스로 넘어오는 값이 같다면 true 반환
        if (this == o)
            return true;
        //null이랑 비교했을 때는 항상 false 반환
        if (o == null || getClass() != o.getClass())
            return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }


    //toString() -> 객체 정보 출력 메서드, 원하는 객체 정보를 출력하고 싶다면 재정의
    @Override
    public String toString(){
        return "Rectangle{" + "width = " + width + ", height = " + height + "}";
    }
}
