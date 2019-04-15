import java.util.Scanner;

//老九商城系统更新，增加购物车模块，即在系统中输入购买的产名，
// 输入购买数量，即打印出该产品的总价，然后继续录入购买的产品信息，
// 最后在停止录入产品信息的时候打印出本次购物应付的总金额，以及通过实付金额进行相应的找零。
public class while5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num;
        int quntity;
        int sum;
        int price;
        String choise = "y";
        System.out.println("查询编号如下：");
        System.out.print("1.资料");
        System.out.print("\t2.大礼包");
        System.out.println("\t3.自学宝典");
        while ("y".equals(choise)){
            System.out.println("请输入您要查询价格商品的编号：");
            num =input.nextInt();
            System.out.println("请输入购买的数量");
            quntity = input.nextInt();
            switch (num){
                case 1:
                    price=99;
                    sum=quntity*price;
                    System.out.println("1.资料"+"\t价格为："+price+"\t数量："+quntity+"\t总价为："+sum);
                    break;
                case 2:
                    price=100;
                    sum=quntity*price;
                    System.out.println("1.大礼包"+"\t价格为："+price+"\t数量："+quntity+"" + "\t总价为："+sum);
                    break;
                case 3:
                    price=50;
                    sum=quntity*price;
                    System.out.println("1.自学宝典"+"\t价格为："+price+"\t数量："+quntity+"" + "\t总价为："+sum);
                    break;
                default:
                    System.out.println("请输入正确是编号");
                    break;
            }
            System.out.println("是否继续查询？(y/n)");
            choise=input.next();
        }
        System.out.println("已结束查询。");
    }
}
