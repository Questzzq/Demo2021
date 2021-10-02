package modules.instance;

/**
 * @author EricTseng
 * @date 2021/10/1 10:07
 */
public class Test {
    public static void main(String[] args) {
        HungrySingleInstance instance1 = HungrySingleInstance.hungrySingleInstance;
        HungrySingleInstance instance2 = HungrySingleInstance.hungrySingleInstance;
        HungrySingleInstance instance3 = HungrySingleInstance.hungrySingleInstance;
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance1 == instance2);

        LazySingleInstance lazyInstance1 = LazySingleInstance.getInstance();
        LazySingleInstance lazyInstance2 = LazySingleInstance.getInstance();
        LazySingleInstance lazyInstance3 = LazySingleInstance.getInstance();
        System.out.println(lazyInstance1);
        System.out.println(lazyInstance2);
        System.out.println(lazyInstance3);
        System.out.println(lazyInstance1 == lazyInstance2);
    }


}
