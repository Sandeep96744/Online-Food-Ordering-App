package repository;

import restaurantManagementModule.CuisineType;
import restaurantManagementModule.Customer;
import restaurantManagementModule.MenuItem;
import restaurantManagementModule.Restaurant;

import java.util.List;
import java.util.Map;

public interface RestaurantRepository {

    public void addRestaurant(Restaurant restaurant);

    public void setActivationStatus(Restaurant restaurant,boolean status);

    public void updateMenuItem(Restaurant restaurant, MenuItem item);

    public Restaurant getRestaurantById(int id);

    public List<Restaurant> findRestaurantByLocation(String location);

    public List<Restaurant> findRestaurantByName(String name);

    public List<Restaurant> findRestaurantByType(CuisineType type);

    public List<Restaurant> findAllActiveRestaurant();

    public List<Restaurant> findAllDeactivatedRestaurant();

    public void order(int id, Customer customer, Map<MenuItem, Integer> cart, String address, String paymentType);
}
