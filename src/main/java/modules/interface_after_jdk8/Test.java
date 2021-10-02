package modules.interface_after_jdk8;

/**
 * @author EricTseng
 * @date 2021/10/2 10:37
 */
public class Test {
    public static void main(String[] args) {
        PingPongMan pingPongMan = new PingPongMan();
        pingPongMan.run();
        SportManInter.eat();
    }
}
