//circle3
//封装
import java.util.Scanner;

public class Duixiang5 {
    //圆的半径
    public double radius;
    //圆的周长
    public double perimerter;
    //圆的面积
    public double area;

    public Duixiang5() {
    }

    public void show(){
        System.out.println(this.getPerimerter());
        System.out.println(this.getArea());
    }
    public Duixiang5(double radius) {
     //封装
        //this.radius = radius;
        //更专业的
        this.setRadius(radius);
    }

    public double getPerimerter() {
        perimerter=2*Math.PI*radius;
        return perimerter;
    }

    public double getArea() {
        area =Math.PI*Math.pow(radius,2);
        return area;
    }


    //读操作
    public double getRadius(){
        return radius;
    }
    //写操作
    public void setRadius(double radius){
        if (radius<=0){//封装的好处，可以对传入的属性进行简单的验证
            radius=1;
        }else {
        //this 自指针  朕
        this.radius=radius;
    }
    }
}

