package enumeration.ref3;

public class EnumRefMain3_3 {
    //Grade가 스스로 할인율을 계산하기 때문에 더는 DiscountService 클래스가 필요 없어짐
    public static void main(String[] args) {
        int price = 10000;
        //출력 부분 중복 제거
        printDiscount(Grade.BASIC , price);
        printDiscount(Grade.GOLD , price);
        printDiscount(Grade.DIAMOND , price);
    }

    private static void printDiscount(Grade grade , int price){
        //grade.name()을 통해 ENUM의 상수 이름을 사용할 수 있음
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}
