package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1)); //-1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); // return -1
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
        // 배열에 -1 값이 있어서 -1을 반환한 것인지, 아니면 -1 값이 없어서 -1을 반환한 것인지 명확하지 않음
        // 객체의 경우 데이터가 없으면 null이라는 명확한 값 존재
    }
}
