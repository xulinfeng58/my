// 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，
// 又多吃了一个第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
// 以后每天早上都吃了前一天剩下的一半零一个。
// 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
public class For2 {
    public static void main(String[] args) {
        int x1;
        int x2=1;
        for (int i =0; i <9 ; i++) {
            x1=(x2+1)*2;
            x2=x1;
            System.out.println(x1);
        }
   }
}
