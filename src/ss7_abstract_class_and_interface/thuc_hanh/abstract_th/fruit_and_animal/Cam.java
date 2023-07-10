package ss7_abstract_class_and_interface.thuc_hanh.abstract_th.fruit_and_animal;

public class Cam extends TraiCay {
    @Override
    public void anTheNao() {
        System.out.println("ăn kiểu lột vỏ rồi ăn từng múi");
    }
    public static void main(String[] args) {
        Cam cam = new Cam();
        cam.anTheNao();
    }
}
