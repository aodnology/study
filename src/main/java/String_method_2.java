import java.util.Scanner;

public class String_method_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.printf("변환할 문자열을 입력 : ");
        String str = s.nextLine();

        System.out.println("원 문자열 : [" +str+"]");
        System.out.println("대문자 변환 : ["+str.toUpperCase()+"]");
        System.out.println("소문자 변환 : ["+str.toLowerCase()+"]");
        System.out.println("공백 제거 : ["+str.trim()+"]"); // 앞뒤 공백은 없애나 문자열 중간의 공백은 없애지 않는다
    }
}
