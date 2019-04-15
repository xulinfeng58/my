//假设有一个长度为5的数组：int []array = new int[]{1, 3, -1, 5, -2};
//现在要创建一个新数组newArray[]，要求新数组中的元素与原数组中的元素逆序，
// 并且如果原数组中的元素值小于0，在新数组中按0存储。试编程输出新数组中的元素。

public class Shuzu6 {
    public static void main(String[] args) {
        int []array = new int []{1,3,-1,5,-2};
        int temp;
        for (int i = 0; i <array.length/2 ; i++) {
            temp =array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        System.out.print("新数组的元素为：");
        for (int i = 0; i <array.length ; i++) {
            if (array[i]<0){
                array[i]=0;
            }
            System.out.print(array[i]+" ");
        }
    }
}
