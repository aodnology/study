import java.util.Scanner;

public class study220313_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = in.nextInt();
        if(age >= 20) {
            System.out.println("성인");
        } else {
            System.out.println("미성년자");
        }
    }
}
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a + b);
    }                                // 값을 입력받고 더하기 연산자를 사용할 경우
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        double a=in.nextDouble(); //오차범위를 벗어나지 않기위한 명령어
        double b=in.nextDouble();

        in.close();
        System.out.print(a/b);

    }
}