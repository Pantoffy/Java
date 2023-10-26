package Exam;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private String transactionTime;
    private List<LineItem> lineItems;

    public Order(String customerName, String transactionTime) {
        this.customerName = customerName;
        this.transactionTime = transactionTime;
        lineItems = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public void addProduct(Product product, int quantity) {
        LineItem lineItem = new LineItem(product, quantity);
        lineItems.add(lineItem);
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    @Override
    public String toString() {
        return "Order{" + "customerName='" + customerName + '\'' + ", transactionTime='" + transactionTime + '\'' + ", lineItems=" + lineItems + '}';
    }
    public double cost() {
        double totalCost = 0;
        for (LineItem item : lineItems) {
            totalCost += item.cost();
        }
        return totalCost;
    }
}
