package ss7_abstract_class_and_interface.thuc_hanh.abstract_th.fruit_and_animal;

public class Tao extends TraiCay{
    @Override
    public void anTheNao() {
        System.out.println("ăn bằng cách cắn");
    }

    public static void main(String[] args) {
        Tao tao = new Tao();
        tao.anTheNao();
    }
}
