// 강제 타입변환
public class CastingExample {
    public static void main(String[] args){
        int intValue = 44032;
        char charValue = (char) intValue;
        System.out.println(charValue);

        // 정수부분만 담기고 소수점 부분은 버림
        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);
    }
    
}
