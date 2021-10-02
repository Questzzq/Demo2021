package modules.interface_after_jdk8;

/**
 * @author EricTseng
 * @date 2021/10/2 10:37
 */
public interface SportManInter {
    /**
     * jdk 8 开始，支持默认方法
     * 必须用 default 修饰，默认用 public 修饰
     * 接口不能实例对象，所以默认方法只能过继给实现类，由实现类的对象调用
     */
    default void run() {
        System.out.println("running---");
    }

    /**
     * jdk 8 之后支持静态方法
     * 必须用 static 修饰，默认使用 public 修饰
     * 接口的静态方法，必须要用接口名.静态方法名去调用
     */
    static void eat() {
        System.out.println("eat----");
    }

    /**
     * jdk 1.9之后开始支持私有方法
     * 必须在接口内部才能被访问
     */
//    private void say() {
//        System.out.println("say---");
//    }
}
