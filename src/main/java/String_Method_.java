import java.util.Scanner;

public class String_Method_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str, strRep, strSub, strAry[];

        //str : 문자열 변수
        //strRep : 문자열을 바꿔주는 replace()의 변수
        //strSub : 문자열을 추출하는 substring()의 변수
        //strAry[] : 문자열을 담을 배열의 변수

        System.out.printf("문자열 입력 :");
        str = s.nextLine();


        strRep = str.replace(" ","$");
        // 변수 = 문자열변수.replace("타겟", "바꿀문자");

        strSub = str.substring(2, 8);
        // 변수 = 문자열변수.substring(지정번호부터, 지정번호까지); 추출

        strAry = str.split(" "); // 요구 분석시 상당히 많이 쓰임
        // 변수 = 문자열변수.split(" 안에기제된 문자를 기준으로 문자열이 나눠진다 ");

        System.out.println("replace : "+strRep);
        System.out.println("substring : "+strSub);
        System.out.println("입력된 문자열 : "+str);

        for(int i = 0; i < strAry.length; i++) {
            System.out.println("분리 문자열 StrAry["+i+"] : "+strAry[i]);
            //split으로 데이터를 " " 로 나눈 뒤 배열에 담긴 데이터를 순서대로 확인
        }
        for(String name : strAry){
            System.out.println(name);
        }
    }
}
