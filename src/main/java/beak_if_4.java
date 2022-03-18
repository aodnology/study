import java.util.Scanner;

public class beak_if_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>0) {
            if (b > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } // if 로 x 값을 먼저 설정한뒤 중첩 if를 사용하여 1값을 설정
          // else 를 사용하여 y만 음수인 4를 설정
        else {
            if(b>0){
                System.out.println("2");
            }
            else {
                System.out.println("3");
            }//else 를 이용하여 중첩 if에 y만 양수인 값인 2를 설정
             //else 를 사용하여 나머지 모두 음수인 값인 3을 설정
        }
    }
}
