import java.util.Scanner;

//从键盘输入一位整数，当输入1-7时，显示下面对应的星期名称:
//        a) 1:周一,2:周二, 3:周三, 4:周四, 5:周五, 6:周六, 7:周日;
//        b)  输入其他数字时提示用户重新输入，输入数字0时程序结束。
public class For3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in =1;
        int choise =0;
while ( in !=0){
    System.out.println("请输入：");
    choise =input.nextInt();
    switch (choise){

        case 1:
            System.out.println("星期一");
            break;
        case 2:
            System.out.println("星期二");
            break;
        case 3:
            System.out.println("星期三");
            break;
        case 4:
            System.out.println("星期四");
            break;
        case 5:
            System.out.println("星期五");
            break;
        case 6:
            System.out.println("星期六");
            break;
        case 7:
            System.out.println("星期七");
            break;
            default:
                System.out.println("请重新输入，请输入1-7的数字");
                break;
    }
}
    }
}
