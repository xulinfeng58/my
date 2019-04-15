import java.util.Scanner;

public class duixiang_5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        Double radius =input.nextDouble();

        Duixiang5 duixiang =new Duixiang5(radius);
        duixiang.show();
    }
}
