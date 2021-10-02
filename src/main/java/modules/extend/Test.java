package modules.extend;

/**
 * @author EricTseng
 * @date 2021/10/1 11:50
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("111");
        System.out.println(student.getMyName());
        System.out.println(student.height);
        System.out.println(Student.getHeight());
    }
}
