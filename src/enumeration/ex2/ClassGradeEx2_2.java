
package enumeration.ex2;

//외부에서 임의로 ClassGrade의 인스턴스를 생성할 수 있다는 문제점
public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        /*ClassGrade classGrade = new ClassGrade();
        int result = discountService.discount(classGrade , price);
        System.out.println("newClassGrade 등급의 할인 금액: " + result);*/

    }
}
