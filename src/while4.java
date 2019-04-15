import java.util.Scanner;

//为了方便老九君在后台给我们的小伙伴一些线上折扣，
// 一起来给老九君开发一个商品价格查询系统吧。
// 在后台输入要查找商品的编号，
// 即显示对应商品的价格，输入y/n来表示继续还是结束查找！
public class while4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String choise = null;

        do {
            System.out.println("请输入您要查询的商品编号：");
            num = input.nextInt();

            switch (num) {
                case 111:
                    System.out.println("价格为110");
                    break;
                case 134:
                    System.out.println("价格为414");
                    break;
                case 1423:
                    System.out.println("价格为2312123");
                    break;
                default:
                    System.out.println("请输入正确编码。");
                    break;
            }
            System.out.println("是否继续查找？(y/n)");
            choise = input.next();
        }while ("y".equals(choise));
        System.out.println("查询结束");
    }


}