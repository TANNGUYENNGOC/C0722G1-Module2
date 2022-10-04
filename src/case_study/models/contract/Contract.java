package case_study.models.contract;

public class Contract {
    private String numberContrac; //số hợp đồng
    private String iDBooking;
    private double moneyDeposit; //Tiền đặt cọc
    private double totalPayment; //Tổng thanh toán
    private String iDCustomer; //Mã khách hàng

    public Contract() {
    }

    public Contract(String numberContrac, String iDBooking, double moneyDeposit, double totalPayment, String iDCustomer) {
        this.numberContrac = numberContrac;
        this.iDBooking = iDBooking;
        this.moneyDeposit = moneyDeposit;
        this.totalPayment = totalPayment;
        this.iDCustomer = iDCustomer;
    }

    public String getNumberContrac() {
        return numberContrac;
    }

    public void setNumberContrac(String numberContrac) {
        this.numberContrac = numberContrac;
    }

    public String getiDBooking() {
        return iDBooking;
    }

    public void setiDBooking(String iDBooking) {
        this.iDBooking = iDBooking;
    }

    public double getMoneyDeposit() {
        return moneyDeposit;
    }

    public void setMoneyDeposit(double moneyDeposit) {
        this.moneyDeposit = moneyDeposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getiDCustomer() {
        return iDCustomer;
    }

    public void setiDCustomer(String iDCustomer) {
        this.iDCustomer = iDCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContrac='" + numberContrac + '\'' +
                ", iDBooking='" + iDBooking + '\'' +
                ", moneyDeposit=" + moneyDeposit +
                ", totalPayment=" + totalPayment +
                ", iDCustomer='" + iDCustomer + '\'' +
                '}';
    }
}
