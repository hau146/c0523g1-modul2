package ss5_accessmodifier_staticmethod.thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student student1 =new Student();
        Student student2 =new Student();
        System.out.println(student1.college);
        System.out.println(student2.college);
        System.out.println(Student.college);
        Student.change(); // đang gọi tới change để thay đổi college
        System.out.println(student1.college);
        System.out.println(student2.college);

        //tạo đối tượng
        Student s1 = new Student(1, "Hau");
        Student s2 = new Student(2,"Hoang");
        Student s3 = new Student(3, "Thien");

        //dùng đối tượng gọi tới display để hiển thị thuộc tính
        s1.display();
        s2.display();
        s3.display();
    }
}
