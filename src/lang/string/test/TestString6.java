package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key); //6

        //index가 0보다 크거나 같은 이유 -> indexOf( ) 괄호 안에 단어가 없으면 -1반환
        while (index >= 0){
            index = str.indexOf(key , index + 1); //key ("hello") 단어를 index 바로 다음 위치에서부터 시작해 찾기 시작.
            count++;
            //index -> 18 ,  count - > 1 .
            //index -> 32 , count -> 2.
            // index -> -1 , count -> 3. while문 종료
            //해당 조건문은 index가 0보다 클 동안 index + 1 의 위치에서 시작해 key값인 "hello"가 나오는 인덱스 값을 반환하는 것
            // 더 이상 "hello"를 찾을 수 없을 시에 index 값은 -1을 반환
        }
        System.out.println("count = " + count);
    }
}
