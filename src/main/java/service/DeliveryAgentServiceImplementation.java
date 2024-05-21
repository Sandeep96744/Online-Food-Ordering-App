package service;

import repository.DeliveryAgentRepository;
import repository.DeliveryAgentRepositoryImplementation;
import restaurantManagementModule.DeliveryStatus;
import restaurantManagementModule.IncomingOrder;
import restaurantManagementModule.Order;

import java.util.List;

public class DeliveryAgentServiceImplementation implements DeliveryAgentService {

    DeliveryAgentRepository deliveryAgentRepository;
    static final DeliveryAgentServiceImplementation instance = new DeliveryAgentServiceImplementation();

    public DeliveryAgentServiceImplementation() {
        this.deliveryAgentRepository = DeliveryAgentRepositoryImplementation.getInstance();
    }

    public static DeliveryAgentServiceImplementation getInstance() {
        return instance;
    }

    @Override
    public void addOrder(Order order){
        deliveryAgentRepository.addOrder(order);
    }

    @Override
    public List<IncomingOrder> findAllPendingOrders() {
        return deliveryAgentRepository.findAllPendingOrders();
    }

    @Override
    public void setDeliveryStatus(Order order, DeliveryStatus status) {
        deliveryAgentRepository.setDeliveryStatus(order, status);
    }
}
