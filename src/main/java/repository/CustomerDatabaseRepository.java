package repository;

import restaurantManagementModule.Customer;
import restaurantManagementModule.MenuItem;

public interface CustomerDatabaseRepository {
    public Customer saveCustomer(Customer customer);

    public boolean saveItem(Customer customer, int restaurantId, String itemName, int quantity);

    public boolean deleteItem(Customer customer, String itemName);

    public void reviewCartItem();

    public double cartValue();

    public void placeOrder(Customer customer, String address, String paymentType);
}
