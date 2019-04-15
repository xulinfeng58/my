import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result = 0;
        String op= "";
        String choice = null;
        do {
            System.out.println("请输入两个操作数：");
            num1 = input.nextDouble();
            num2 = input.nextDouble();

            System.out.println("请输入运算符:");
            op = input.next();
            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    if (num2 ==0){
                        System.out.println("除数不能为0");
                        result=0;
                    }
                    break;
                default:
                    System.out.println("位置运算符，运算失败！");
                    break;
            }
            System.out.println(result);
            System.out.println("是否继续？(y/)");
            choice = input.nextLine();
        }while ("y".equals(choice));
    }
}