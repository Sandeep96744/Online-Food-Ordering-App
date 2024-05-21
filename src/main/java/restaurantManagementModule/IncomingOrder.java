package restaurantManagementModule;

public class IncomingOrder {
    private Order order;
    private DeliveryStatus status;

    public IncomingOrder(Order order) {
        this.order = order;
        this.status = DeliveryStatus.PICKED_UP;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }
}
