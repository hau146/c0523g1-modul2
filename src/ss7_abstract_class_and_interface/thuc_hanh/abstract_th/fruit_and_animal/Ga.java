package ss7_abstract_class_and_interface.thuc_hanh.abstract_th.fruit_and_animal;
public class Ga extends DongVat implements CoTheAnDuoc {

    @Override
    public void tiengKeu() {
        System.out.println("gà kêu: cục tác");
    }
    @Override
    public void anTheNao() {
        System.out.println("ăn kiểu: chiên, rán, luộc, kho");
    }

    public static void main(String[] args) {
        Ga ga = new Ga();
        ga.tiengKeu();
        ga.anTheNao();
    }


}
