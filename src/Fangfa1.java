import java.util.Scanner;

public class Fangfa1 {
    public static void main(String[] args) {
        System.out.println("请输入你要选的日期：");
        int dayOfWeek = new Scanner(System.in).nextInt();
        ShowWeekDayOfChinese(dayOfWeek );
        ShowWeekDayOfJapanese(dayOfWeek );          //调用方法
        ShowWeekDayOfEnglish(dayOfWeek );

    }
    private static boolean isRight(int dayOfWeek){
        if (dayOfWeek<1||dayOfWeek>7){
            return  false;
        }
        return true;
    }
        public static void ShowWeekDayOfChinese(int dayOfWeek){
        if (!isRight(dayOfWeek)){
            System.out.println("必须输入1-7之间的数字");
            return;
        }
        String [] weeks={"星期一","星期二","星期四","星期四","星期五","星期六","星期天"};
        System.out.println(weeks[dayOfWeek-1]);
    }
        public static void ShowWeekDayOfJapanese(int dayOfWeek){
            if (!isRight(dayOfWeek)){
                System.out.println("必须输入1-7之间的数字");
                return;
            }
        String [] weeks={"一","二","四","四","五","六","天"};
            System.out.println(weeks[dayOfWeek-1]);
        }
        public static void ShowWeekDayOfEnglish(int dayOfWeek) {
            if (!isRight(dayOfWeek)){
                System.out.println("必须输入1-7之间的数字");
            return;
        }
        String [] weeks={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
            System.out.println(weeks[dayOfWeek-1]);
        }
}