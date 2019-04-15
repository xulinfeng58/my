//###*  I=0  j=2     先看#号     i= 0 j=0       后看*
//##*** i=1  j=1                 i=1 j=2
//#***** i=2 j=0                 i=2  j=4
//*     *i=3                     i=3 j=6
public class For1 {
    public static void main(String[] args) {
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <= 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*i; j++) {
                if (j == 0 || j==2*i){
                System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=4-2*i ; j++) {
                if (j==0||j==4-2*i){
                System.out.print("*");
            }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
