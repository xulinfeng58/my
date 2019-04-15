import java.util.Scanner;

public class Shuzu2 {
    public static void main(String[] args) {
        int[] nums =new  int[10];
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=((int)(Math.random()*10000))%1001;
        }
        System.out.println("数组元素");
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+",");
        }
        System.out.println();
        //以上为生成一个随意数组

        Scanner input = new Scanner(System.in);
        System.out.print("请输入你要查找的元素：");
        int a=input.nextInt();
        int s =-1;
        for (int i = 0; i <nums.length ; i++) {
            if (a == nums[i]){
                System.out.println("找到了！");
                s =i;
                break;
        }
        }
        if (s==-1){
            System.out.println("没找到！");
        }else {
            System.out.println("要找的下标元素为:"+s);

        }
    }
}
