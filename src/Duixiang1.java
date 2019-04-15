/**
 * 类和对象的关系
 */
public class Duixiang1 {
    //角色名称
    public String name;
    //等级
    public int level;
    //职业
    public String job;

    public void show(){
        System.out.println(name+"\t"+level+"\t"+job);
    }
    //释放技能
    public void doSkill(){
        if (name.equals("劳拉")){
            System.out.println("hahaha");
        }else if(name.equals("孙悟空")){
            System.out.println("adadada");
        }else {
            System.out.println(name+"gagaga");
        }
    }

}
