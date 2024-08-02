package lang.immutable.test;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2024,1,1);
        MyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        //date1의 주소만 변경하고 싶어
        System.out.println("2025 -> date1");
        date1.setYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        //같은 참조값 가지고 있기 때문에 date2의 년도 역시 변경 -> 불변객체 만들 필요 O
    }
}
