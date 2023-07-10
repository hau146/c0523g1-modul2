package ss7_abstract_class_and_interface.thuc_hanh.interface_th;

public class Pig implements Animal{ //có thể interface nhiều lớp được
    @Override
    public void tiengKeu() {
        System.out.println("con lợn kêu: éc éc");
    }

    @Override
    public void chay() {
        System.out.println("chạy bẹt bẹt");
    }
}
