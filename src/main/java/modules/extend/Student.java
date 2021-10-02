package modules.extend;

/**
 * @author EricTseng
 * @date 2021/10/1 11:52
 */
public class Student extends People {
    public String getMyName() {
        return super.getName();
    }
}
