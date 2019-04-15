public class Fangfa2 {
    public static void main(String[] args) {

        SendMessgae("","","",100,1);     //调用方法
    }
    public static void SendMessgae(String name,String channelName,String Messgae,int count,int interval){ //定义方法
    String value=String.format("【%s】%s:%s",channelName,name,Messgae);   //format
        for (int i = 0; i <count ; i++) {
            System.out.println(value);
            try {
                Thread.sleep(interval*1000);          //时间间隔
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
