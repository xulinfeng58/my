import java.util.Scanner;

public class Fangfa4{
    /* 用户输入的年份  */
    public static int  year =Integer.MIN_VALUE;
    /* 用户输入的月份 */
    public static int month = Integer.MIN_VALUE;
    /*对应每个月份的天数 */
    private static int[]dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) {
        PrintCalendar();
        getSumDayOfYears();
    }

    /**
     * 打印月历的核心方法
     */
    private static void PrintCalendar() {
        //1.让用户输入年份和月份
        InputYearMonth();
        //2.计算1900-1-1到用户输入年份月份的总天数（year==2017,month=7   2017-7-1）
           //2-1计算隔年的总天数
           //2-2计算各月的天数之和
        int sum =getSumDayOfYears();
        sum +=getSumDayOfMonth();
        sum++;

        //3.打印年份和月份
        PrintMonthTitle();
        //4.打印月份的标题（星期一到星期日）
        //在上面
        //5.根据某月1日是星期几，打印月历的内容
        PrintCalendarContent(sum%7);
    }

    /**
     * 根据每月1号是周几打印月历的内容
     * @param dayOfWeek 当月1号是星期几
     */
    private static void PrintCalendarContent(int dayOfWeek){
        //注意，dauOfWeek取值范围是0-6
        int sepCount =0;//  \t的数量
        if (dayOfWeek==0){
            sepCount=6;
        }else {
            sepCount=dayOfWeek-1;
        }
        for (int i = 0; i <sepCount ; i++) {
            System.out.print("\t\t");
        }
        for (int i = 0; i <dayOfMonth[month-1] ; i++) {
            System.out.print(i+1);
            if ((dayOfWeek + i) % 7 ==0){
                //周日
                System.out.println();
            }else{
                System.out.print("\t\t");
            }
        }
    }
    private  static void PrintMonthTitle(){
        String  []monthNames ={"一","二","三","四","五","六","七","八","九","十","十一","十二"};
        System.out.println("\t\t"+year+"\t"+monthNames[month-1]);
        String [] weeksdays={"星期一","星期二","星期三","星期四","星期五","星期六","星期天"};
        for (int i = 0; i <weeksdays.length ; i++) {
            System.out.print(weeksdays[i]+"\t");
        }
        System.out.println();
    }

    /**
     * 获得1900到year年的总天数
     * @return
     */
    private static int getSumDayOfYears() {
        //需要判断用户是否已经 输入了年份
        if (year == Integer.MIN_VALUE){
            System.out.println("年份错误，请重新输入年份和月份");
        InputYearMonth();
    }
        int sum = 0;
        for (int i = 1900; i <year ; i++) {
            sum+=365;//每年累加365天
                     //将闰年封装成方法
            if (isLeapYear(i)){
                 sum++;//闰年多加一天
            }
        }
        return sum;
    }

    /**
     * 得到year年1月1号到year年month-1月最后一天的总天数
     * @return
     */
    private static int getSumDayOfMonth() {
        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            sum += dayOfMonth[i];
            //如果year年是闰年，并且month >=3
        }
        if (isLeapYear(year) && month >= 3){
            sum++;
    }
        return sum;
    }

    /**
     * 用来判断传入的year是不事闰年
     * @param year 要判断的年份
     * @return 是闰年返回true
     */
    private static boolean isLeapYear(int year){
        return year%400==0||year%4==0||year%100 !=0;

    }

    /**
     * 接收用户输入的年份和月份
     */
    private static void InputYearMonth(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        year =input.nextInt();
        System.out.println("请输入月份：");
         month = input.nextInt();
         input.close();//关闭对象
         input=null;//销毁对象
    }










}