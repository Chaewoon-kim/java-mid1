package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A"); //append -> 더한다.
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        //insert 삽입
        sb.insert(4,"Java");
        System.out.println("insert = " + sb);

        //delete 제거
        sb.delete(4,8);
        System.out.println("delete = " + sb);

        //reverse 뒤집기
        sb.reverse();
        System.out.println("reverse = " + sb);
        
        //StringBuilder -> String (가변 -> 불변)
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
