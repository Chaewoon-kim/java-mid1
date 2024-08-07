package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split
        String [] splitStr =  str.split(","); // , 를 기준으로 자름
        for(String s : splitStr){
            System.out.println(s);
        }

       /* String joinStr = "";
        for(String string : splitStr){
            joinStr += string + "-";
        }
        System.out.println("joinStr = " + joinStr);*/


        //문자열 배열 연결
        String result = String.join("-" , splitStr);
        System.out.println("result = " + result);
    }
}
