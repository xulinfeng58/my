import java.util.Scanner;

//房间类
public class Duixiang7_2 {
    //属性：记分牌，道具，参与游戏的玩家，房间号，房间名称，房间密码。。。
    //private String weapon;道具
    private Duixiang7 duixiang1 =null;
    private Duixiang7_1 duixiang2=null;
    /* 房间ID */
    private  long roomId;
    /* 房间名称 */
    private String roomName;
    /* 房间密码 */
    private String roomPass;


//游戏房名和密码 roomname room pass
    public Duixiang7_2(String roomName,String roomPass ){
        if (!("淋锋的游戏".equals(roomName)&&"123".equals(roomPass)) ){
            System.out.println("房间密码错误，游戏强制退出");
            return;
        }
        this.setRoomName(roomName);
        initGame();
        starGame();
        endGame();

    }

    //方法：开始游戏，初始化游戏，现实菜单，选择人物，判断输赢（可以定义在裁判类里）
    //初始化游戏
    public void initGame(){
        //1.实例化游戏玩家对象
        duixiang1=new Duixiang7();
        duixiang2 = new Duixiang7_1();
        //2.初始化游戏的其他属性
        //如：游戏中的花花草草
        for (int i = 0; i <100 ; i++) {
            System.out.print("*");
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("\n游戏加载成功" );
    }
    public void starGame(){
        showMenu();
        choiceRole();
        gaming();
        //打印结果
    }

    /**
     * 游戏的大循环
     */
    private void gaming() {
        while (true) {
            //双方出拳
            System.out.println(duixiang1.getName() + "请出拳：");
//        duixiang1.setFist(new Scanner(System.in).nextInt());
            Scanner input = new Scanner(System.in);
            //省略判断
            duixiang1.setFist(input.nextInt());
            int fist1 = duixiang1.getFist();
            duixiang2.getFist();
            int fist2 = duixiang2.getFist();
            // 判断输赢
            int result = judge(fist1, fist2);//调用方法判断结果
            //如果返回-1，玩家1胜利；返回0，打平；返回1，玩家2胜利
            if (result == -1) {
                System.out.println("【吉永老师】：" + duixiang1.getName() + "胜利");
                duixiang1.sendMessage(Duixiang7.MessageTypeWin);
                duixiang2.sendMessage(Duixiang7_1.MessageTypeLose);
            } else if (result == 0) {
                System.out.println("【吉永老师】：双方打平");
                duixiang1.sendMessage(Duixiang7.MessageTypeFist);
                duixiang2.sendMessage(Duixiang7_1.MessageTypeFist);
            } else {
                System.out.println("【吉永老师】：" + duixiang2.getName() + "胜利");
                duixiang1.sendMessage(Duixiang7.MessageTypeLose);
                duixiang2.sendMessage(Duixiang7_1.MessageTypeWin);
            }
            System.out.println("是否继续游戏？y/n");
            String answer = new Scanner(System.in).next();
            if (!"y".equals(answer)){
                break;
            }
        }
    }
    //现实菜单
    public void showMenu(){
        System.out.println("欢迎进入《"+roomName+"》游戏房间");
        System.out.println("出拳规则：1.剪刀；2.布；3.石头");
        }
    //选择角色
    public void choiceRole(){
        System.out.println("对方角色：1.风间 2.妮妮 3.正南 4.阿呆");
        System.out.println("请选择：");
        int choice = new Scanner(System.in).nextInt();
        String [] names={"风间","妮妮","正南","阿呆"};
        //省略对用户输入的验证
        duixiang2.setName(names[choice-1]);
        duixiang1.setName("野原新之助");
        System.out.println(duixiang1.getName()+"VS."+duixiang2.getName());
    }
    //判断输赢
    public int judge(int fist1, int fist2){
        if (fist1==fist2)return 0;//平局
        if (fist1 ==1&& fist2==3||fist1==2&&fist1==1||fist1==3&&fist2==2){
            //玩家1的分数+1，玩家2的分数-1
            duixiang1.setScore(duixiang1.getScore()+1);
            duixiang2.setScore(duixiang2.getScore()-1);
            return -1;//玩家1胜利
        }
        duixiang1.setScore(duixiang1.getScore()-1);
        duixiang2.setScore(duixiang2.getScore()+1);
        return 1;
    }
    public void endGame(){
        System.out.println(duixiang1.getName()+"\t"+duixiang2.getName());
        System.out.println(duixiang1.getScore()+"\t"+duixiang2.getScore());
        System.out.println("游戏已结束，欢迎下次再来！");
    }


    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomPass() {
        return roomPass;
    }

    public void setRoomPass(String roomPass) {
        this.roomPass = roomPass;
    }

}
