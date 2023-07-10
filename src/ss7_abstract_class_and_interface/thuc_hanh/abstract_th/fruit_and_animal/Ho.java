package ss7_abstract_class_and_interface.thuc_hanh.abstract_th.fruit_and_animal;

public class Ho extends DongVat {
    @Override
    public void tiengKeu() {
        System.out.println("hổ kêu: gàoooo");
    }

    public static void main(String[] args) {
        Ho ho = new Ho();
        ho.tiengKeu();
    }
}
