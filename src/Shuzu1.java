import java.util.Scanner;

public class Shuzu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] s =new double[5];
        double sum =0,avg;
        for (int i = 0; i <s.length ; i++) {
            System.out.println("请输入：");
            s[i]=input.nextDouble();
        }
        for (int i = 0; i <s.length ; i++) {
            sum+=s[i];
        }
        System.out.println(sum/5);
    }
}
