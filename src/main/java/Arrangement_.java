import java.util.Scanner;

public class Arrangement_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[]aa=new int[4]; // 정수형 배열을 선언한다
        int hap;

        System.out.printf("1번째 숫자를 입력하세요 : ");
        aa[0] = s.nextInt();
        System.out.printf("2번째 숫자를 입력하세요 : ");
        aa[1] = s.nextInt();
        System.out.printf("2번째 숫자를 입력하세요 : ");
        aa[2] = s.nextInt();
        System.out.printf("2번째 숫자를 입력하세요 : ");
        aa[3] = s.nextInt();

        hap = aa[0] + aa[1] + aa[2] + aa[3];

        System.out.printf("합계 --> %d \n", hap);
    }
}
