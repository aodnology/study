public class Sting_method_log {
    public static void main(String[] args) {
        String log = "111.222.33.44 - - - (10/jun/2022:22:22:32 +0900)";
                                 //0 1 2 3                     4
        //ip
        System.out.println("IP : "+ log.substring(0, 13));

        int ip = log.indexOf(" ");
        System.out.println("IP : "+ log.substring(0, ip));
        System.out.println(ip); // 13 : ip 의 index번호

        String ip2 = log.substring(log.indexOf("1"), log.indexOf(" "));
        System.out.println("IP : "+ip2);

        //시간
        String[] item = log.split(" ");
        String time = item[4];
        System.out.println("시간 : "+ time.substring(1, time.length())); // time.substring(1 : (를 없애주기 위해


        String time2 = log.substring(log.indexOf("10"),log.indexOf(" +"));
        String time3 = log.substring(log.indexOf("(1")+1, log.indexOf(" +"));
        String time4 = log.substring(log.indexOf(" (")+2, log.indexOf(" +"));
        System.out.println("시간 : "+time2);
        System.out.println("시간 : "+time3);
        System.out.println("시간 : "+time4);
    }
}
