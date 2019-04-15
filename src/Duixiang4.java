import java.util.Scanner;

//circle2
//利用构造方法（重载）
public class Duixiang4 {
    //圆的半径
    public double radius;
    //圆的周长
    public double perimerter;
    //圆的面积
    public double area;

    public Duixiang4() {
    inputRadius();
    }
    public Duixiang4(double radius1) {
    if (radius1>0) {
    radius=radius1;
    }else {
        inputRadius();
    }
    }
    private void inputRadius(){
        Scanner input =new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        radius=input.nextDouble();
        input.close();//注销
    }
    public void shouwPerimeter(){
        if (radius==0){
            inputRadius();//如果用户没有输入半径强制用户输入
        }
        perimerter=2*Math.PI*radius;
        System.out.println("周长为："+perimerter);
    }
    public void shouArea(){
        if (radius==0){
            inputRadius();
        }
        area =Math.PI*Math.pow(radius,2);
        System.out.println("圆的面积为："+area);
    }
}

