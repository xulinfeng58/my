import java.util.Scanner;

public class Erfenchazhaofa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]array ={2,5,8,10,15,35,45,55,65,75,95};
        System.out.println("请输入要查找的数字：");
        int searchNum=input.nextInt();
        boolean isFind =false;//是否找到
        int low =0;            //下届下标
        int high = array.length -1;//上届下标
        while (high>=low){
            int mid =(high+low)/2;
            if (searchNum <array[mid]){
                high =mid-1;
            }else if (searchNum>array[mid]){
                low =mid +1;
            }else {
                System.out.println("找到了数字！，下标为："+mid);
                break;
            }
        }
    }}
