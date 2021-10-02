package modules.instance;

/**
 * @author EricTseng
 * @date 2021/10/1 10:26
 */
public class LazySingleInstance {
    // 1.私有化构造器
    private LazySingleInstance (){}

    // 2.创建一个静态成员变量存储本类的对象，此时不能初始化对象
    private static LazySingleInstance lazySingleInstance; // 类加载的时候，其实是null

    // 3.定义一个方法，让其他地方可以调用获取一个对象
    public static LazySingleInstance getInstance() {
        if(lazySingleInstance == null) {
            // 第一次来获取对象
            lazySingleInstance = new LazySingleInstance();
        }
        return lazySingleInstance;
    }
}
