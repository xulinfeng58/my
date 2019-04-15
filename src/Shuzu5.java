import java.util.Arrays;

//有一列乱序的字符：‘a’,'c','u','b','e','p','f','z'，
//        用程序实现按照英文字母表的升序和逆序输出。
public class Shuzu5 {
    public static void main(String[] args) {
        char [] ch=new char[]{'a','c','u','b','e','p','f','z'};
        System.out.print("原字符排序：");
        for (int i = 0; i <ch.length ; i++) {
            System.out.print(ch[i]+" ");
        }
        System.out.println();
        Arrays.sort(ch);
        System.out.print("升序后排序：");
        for (int i = 0; i <ch.length ; i++) {
            System.out.print(ch[i]+" ");
        }
        System.out.println();
        System.out.print("降序后排序：");
        for (int i = 0; i <ch.length/2  ; i++) {
            char temp =ch[i];
            ch[i]=ch[ch.length-i-1];
            ch[ch.length-i-1] = temp;
        }
        for (int i = 0; i <ch.length ; i++) {
            System.out.print(ch[i]+" ");
        }
    }
    }
