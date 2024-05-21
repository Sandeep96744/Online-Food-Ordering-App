package repository;

import restaurantManagementModule.Customer;
import restaurantManagementModule.MenuItem;
import service.RestaurantService;
import service.RestaurantServiceImplementation;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImplementation implements CustomerRepository {

    static int id = 0;
    private Map<MenuItem, Integer> cart;
    RestaurantService restaurantService;

    public CustomerRepositoryImplementation() {
        cart = new HashMap<>();
        restaurantService = new RestaurantServiceImplementation();
    }

    @Override
    public void addItem(MenuItem item, int quantity) {
        cart.put(item, quantity);
    }

    @Override
    public void removeItem(MenuItem item) {
        cart.remove(item);
    }

    @Override
    public void reviewCartItem() {
        System.out.println("\n***** Cart Item Preview *****");
        int i = 1;
        for(MenuItem item: cart.keySet()) {
            System.out.printf("%d. %s | %s | ₹%s | Quantity: %s", i++, item.getItemName(), item.getType(), item.getItemPrice(), cart.get(item));
            System.out.println();
        }
        System.out.println("Cart Value: " + cartValue());
    }

    @Override
    public double cartValue() {
        double total = 0;
        for(MenuItem item: cart.keySet()) {
            total += item.getItemPrice() * cart.get(item);
        }
        return total;
    }

    @Override
    public void order(Customer customer, String address, String paymentType) {
        restaurantService.order(id++, customer, cart, address, paymentType);
    }


}
