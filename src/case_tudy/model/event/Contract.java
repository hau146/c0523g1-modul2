package case_tudy.model.event;

public class Contract {
    private int someContracts;
    private int moneyDeposit;
    private int moneyPayments;

    public Contract() {
    }

    public Contract(int someContracts, int moneyDeposit, int moneyPayments) {
        this.someContracts = someContracts;
        this.moneyDeposit = moneyDeposit;
        this.moneyPayments = moneyPayments;
    }

    public int getSomeContracts() {
        return someContracts;
    }

    public void setSomeContracts(int someContracts) {
        this.someContracts = someContracts;
    }

    public int getMoneyDeposit() {
        return moneyDeposit;
    }

    public void setMoneyDeposit(int moneyDeposit) {
        this.moneyDeposit = moneyDeposit;
    }

    public int getMoneyPayments() {
        return moneyPayments;
    }

    public void setMoneyPayments(int moneyPayments) {
        this.moneyPayments = moneyPayments;
    }

    @Override
    public String toString() {
        return "Số hợp đồng : " + someContracts +
                ", Tiền cọc trước : " + moneyDeposit +
                ", Tổng tiền thanh toán : " + moneyPayments;

    }
}
