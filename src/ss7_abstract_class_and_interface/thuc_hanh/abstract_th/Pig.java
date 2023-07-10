package ss7_abstract_class_and_interface.thuc_hanh.abstract_th;

import ss7_abstract_class_and_interface.thuc_hanh.abstract_th.Animal;

public class Pig extends Animal {

    @Override
    public void animalSound() { //mở rộng thêm kêu
        System.out.println("éc éc");
    }
}
