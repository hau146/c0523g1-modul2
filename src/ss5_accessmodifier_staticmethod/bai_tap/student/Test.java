package ss5_accessmodifier_staticmethod.bai_tap.student;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Hậu");
        student1.setClasses("C05");
        System.out.println(student1.name);
        System.out.println(student1.classes);
    }
}
