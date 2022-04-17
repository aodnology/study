public class Ex04_07 {
    public static void main(String[] args){
        int num1 = 100, num2 = -200;

        boolean a = (num1 !=0);
        boolean b = (num2 == 0);

        System.out.println(" 상수의 AND 연산 :"+(a&&b));
        System.out.println(" 상수의 OR 연산 : "+(a||b));
        System.out.println(" 상수의 NOT 연산 : "+(!a));
    }
}