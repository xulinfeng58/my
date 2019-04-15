import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer ="y";//y可有可无
        String name = null;
        do {
            System.out.println("欢迎进入武侠世界，请大侠起个响当当的名号闯江湖吧：");
            name = input.nextLine();
            System.out.println("头衔：【初入江湖】");
            System.out.println("江湖名号："+name);
            System.out.println(name+"大侠，满意您的江湖名号吗吗？(y/n)");
            answer=input.nextLine();
        }while (!"y".equals(answer));
        System.out.println(name+"大侠来啦，各位可以滚了");
    }
}
