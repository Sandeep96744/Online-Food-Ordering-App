package restaurantManagementModule;

import java.util.Map;

public class Order {
    private int orderId;
    private Customer customer;
    private Map<MenuItem, Integer> cart;
    private String address;
    private String paymentType;

    public Order(int orderId, Customer customer, Map<MenuItem, Integer> cart, String address, String paymentType) {
        this.orderId = orderId;
        this.customer = customer;
        this.cart = cart;
        this.address = address;
        this.paymentType = paymentType;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Map<MenuItem, Integer> getCart() {
        return cart;
    }

    public void setCart(Map<MenuItem, Integer> cart) {
        this.cart = cart;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
