import java.util.Scanner;

public class for_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int a = 1; a <= n; a++) {
            for (int i = 1; i <= a; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
