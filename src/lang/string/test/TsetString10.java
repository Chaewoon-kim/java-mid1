package lang.string.test;

public class TsetString10 {
    //Q. split과 join 활용
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String [] splitFruits = fruits.split(",");
        for (String fruit : splitFruits) {
            System.out.println(fruit);
        }

        //합치기
        String joinedFruits = String.join("->",splitFruits);
        System.out.println("joinedFruits = " + joinedFruits);
    }
}
