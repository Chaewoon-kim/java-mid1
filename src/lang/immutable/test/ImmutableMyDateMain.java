package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableDate date1 = new ImmutableDate(2024, 1, 1);
        ImmutableDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        //date1의 년도를 변경하고 싶어
        date1 = date1.withYear(2025); //x002
        System.out.println("2025 -> date1");
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
