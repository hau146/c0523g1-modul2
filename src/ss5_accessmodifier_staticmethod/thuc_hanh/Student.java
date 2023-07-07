package ss5_accessmodifier_staticmethod.thuc_hanh;

public class Student {
    int rollno;
    String name;
    static String college = "BBDIT";

    Student() {
    }

    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    //đây là method tĩnh
    static void change(){
         college = "CODEGYM";
    }

    //đây là method hiển thị các thuộc tính
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
