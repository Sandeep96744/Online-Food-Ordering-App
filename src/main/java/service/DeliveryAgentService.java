package service;

import restaurantManagementModule.DeliveryStatus;
import restaurantManagementModule.IncomingOrder;
import restaurantManagementModule.Order;

import java.util.List;

public interface DeliveryAgentService {
    public void addOrder(Order order);

    public List<IncomingOrder> findAllPendingOrders();

    public void setDeliveryStatus(Order order, DeliveryStatus status);
}
