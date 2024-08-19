package enumeration.ex2;

public class DiscountService {
    //문자열 대신 ClassGrade 타입을 받아옴
    public int discount(ClassGrade classGrade , int price){
        int discountPercent = 0;

        if(classGrade == ClassGrade.BASIC){
            discountPercent = 10;
        }else if(classGrade == ClassGrade.GOLD){
            discountPercent = 20;
        }else if(classGrade == ClassGrade.DIAMOND){
            discountPercent = 30;
        }else{
            System.out.println("할인 X");
        }
        return price * discountPercent / 100;
    }
}
