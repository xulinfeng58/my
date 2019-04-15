public class Demo {
    public String name;
    public int dengJi;

    public Demo (String name1,int dengJi1){
        name =name1;
        dengJi=dengJi1;
    }
    public void Show(){
        System.out.println(name+"\t"+dengJi);
    }
    public void shuoHua(){
        if (name=="小舞"){
            System.out.println("哈哈哈哈");
        }else {
            System.out.println("啦啦啦啦");
        }
    }
}
