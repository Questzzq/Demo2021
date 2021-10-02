package modules.instance;

/**
 * 饿汉单例方式定义单例类
 * @author EricTseng
 * @date 2021/10/1 9:59
 */
public class HungrySingleInstance {
    // 1.私有构造器
    private HungrySingleInstance() {}

    // 2. 定义一个公开的静态的成员变量存储一个类的对象
    // 饿汉：在这里加载静态成员变量的时候就会创建对象
    public static HungrySingleInstance hungrySingleInstance = new HungrySingleInstance();


}
