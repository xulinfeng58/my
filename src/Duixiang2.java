import javax.management.relation.Role;

/**
 * 构造方法
 * 1.没有方法值
 * 2.方法名一致
 * 3.类似重载
 */
public class Duixiang2 {
public String name;
public int level;
public String job;

////默认构造
   public Duixiang2(){};

    public Duixiang2(String name1,int level1,String job1){
    name =name1;
    level=level1;
    job=job1;
}
    public void show(){
        System.out.println(name+"\t"+level+"\t"+job);

}}
