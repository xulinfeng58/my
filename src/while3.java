//通过编程，利用循环计算100以内的奇数和，并观察每一次循环中的变量的值变化。
public class while3 {
    public static void main(String[] args) {
        int num =1;
        int sum =0;
        while (num<=100){
            sum = num +sum;
            num +=2;

        }
        System.out.println(sum);
    }
}