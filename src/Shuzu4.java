import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

//由于商城系统升级，需要将原有积分进行备份作为历史数据，
// 然后再进行新一年的积分累加。作为周年庆贺礼，
//  赠送每位会员500积分，编写程序输出5名会员的积分情况，
public class Shuzu4 {
    public static void main(String[] args) {
        int[] nums =new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <nums.length ; i++) {
            System.out.println("请输入第"+(i+1)+"位会员的积分：");
            nums[i] =input.nextInt();
        }
        System.out.println("编号"+"\t历史积分"+"\t新年积分");
        for (int i = 0; i <nums.length ; i++) {
            System.out.println((i+1)+"\t\t"+nums[i]+"\t\t"+(nums[i]+500));
        }
    }
}
