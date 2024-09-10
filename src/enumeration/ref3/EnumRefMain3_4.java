package enumeration.ref3;

public class EnumRefMain3_4 {
    public static void main(String[] args) {
        int price = 10000;

        //values() 메서드를 통해 Grade 열거형의 모든 상수를 배열로 구할 수 있음
        //때문에 이후에 새로운 등급이 추가되더라도 main() 코드를 변경할 필요 없음
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDiscount(grade , price);
        }

    }

    private static void printDiscount(Grade grade , int price){
        System.out.println(grade.name() +  " 등급의 할인 금액: " + grade.discount(price));
    }
}
