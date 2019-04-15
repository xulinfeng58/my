import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in ;
        double sum1=0;
        double sum2 =0;
        for (int i = 0; i <=9 ; i++) {
            System.out.print("请输入第"+(i+1)+"位会员的年龄：");
            in = input.nextInt();
            if (in>30){
                sum1=sum1+1;
            }else {
                sum2=sum2+1;
            }
        }
        System.out.println("30以上的用户比例是："+((sum1/10)*100)+"%");
        System.out.println("30以下的用户比例是："+((sum2/10)*100)+"%");
    }
}
