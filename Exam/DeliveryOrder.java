package Exam;

public class DeliveryOrder extends Order{
    public DeliveryOrder(String customerName, String transactionTime) {
        super(customerName, transactionTime);
    }
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DeliveryOrder{" + "address='" + address + '\'' + '}';
    }
}
