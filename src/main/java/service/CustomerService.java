package service;

import restaurantManagementModule.CuisineType;
import restaurantManagementModule.Customer;
import restaurantManagementModule.MenuItem;
import restaurantManagementModule.Restaurant;

import java.util.List;

public interface CustomerService {
    public void addItem(MenuItem item, int quantity);

    public void removeItem(MenuItem item);

    public void reviewCartItem();

    public List<Restaurant> findRestaurantByLocation(String location);

    public List<Restaurant> findRestaurantByName(String name);

    public List<Restaurant> findRestaurantByType(CuisineType type);

    public List<Restaurant> findAllActiveRestaurant();

    public void order(Customer customer, String address, String paymentType);
}
