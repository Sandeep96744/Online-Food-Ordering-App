package repository;

import restaurantManagementModule.IncomingOrder;
import restaurantManagementModule.DeliveryStatus;
import restaurantManagementModule.Order;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class DeliveryAgentRepositoryImplementation implements DeliveryAgentRepository {

    List<IncomingOrder> orders;
    static final DeliveryAgentRepository instance = new DeliveryAgentRepositoryImplementation();

    private DeliveryAgentRepositoryImplementation() {
        this.orders = new ArrayList<>();
    }

    public static DeliveryAgentRepository getInstance() {
        return instance;
    }


    @Override
    public void addOrder(Order order) {
        IncomingOrder incomingOrder = new IncomingOrder(order);
        orders.add(incomingOrder);
        processOrder(incomingOrder);
    }

    @Override
    public List<IncomingOrder> findAllPendingOrders() {
        return orders.stream().filter(incomingOrder -> incomingOrder.getStatus() == DeliveryStatus.PICKED_UP || incomingOrder.getStatus() == DeliveryStatus.EN_ROUTE).toList();
    }

    @Override
    public void setDeliveryStatus(Order order, DeliveryStatus status) {
        orders.forEach(e -> {
            if(e.getOrder() == order)
                e.setStatus(status);
        });
    }

    public void processOrder(IncomingOrder order) {
        try {
            System.out.println("\nOrder Placed Successfully");
            sleep(2000);
            System.out.println("Order Status: " + order.getStatus());
            sleep(3000);
            order.setStatus(DeliveryStatus.EN_ROUTE);
            System.out.println("Order Status: " + order.getStatus());
            sleep(6000);
            order.setStatus(DeliveryStatus.DELIVERED);
            System.out.println("Hurray! Order Status: " + order.getStatus());
            sleep(2000);

        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
