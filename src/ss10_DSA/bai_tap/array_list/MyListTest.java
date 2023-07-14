package ss10_DSA.bai_tap.array_list;

import java.util.Arrays;

public class MyListTest {
    static class Person<P> {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

//    String name;
//    int age;

//    public MyListTest(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "MyListTest{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        MyList<MyListTest> myList1 = new MyList<MyListTest>(15); //tạo mảng theo ý mình
        myList.add(0,10); //thêm
        myList.add(1,11);
        myList.add(2,12);
        myList.add(3,14);
        myList.add(13,15); //trường hợp add vượt quá index mảng
//        System.out.println(myList.remove(2)); //xóa
//        myList.contanis(12); //kiểm tra xem trong mảng có thằng truyền vào không
//        System.out.println("Đã lấy về thằng " + myList.get(1)); //lấy về phần tử theo chỉ số
//        System.out.println("Có " + myList.size() + " phần tử trong mảng"); //xem có bao nhiu phần tử
//        myList.esusureCapacity(10); //tăng kích thuớc mảng
//        System.out.println(myList.indexOf(14)); //tìm vị trí của thằng truyền vào
//        myList.clear(); //xóa sạch
//        myList.add(50); //thêm cuối
    }
}
