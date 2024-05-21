package service;

import restaurantManagementModule.CuisineType;
import restaurantManagementModule.MenuItem;
import restaurantManagementModule.Restaurant;

import java.util.List;

public interface RestaurantServices {
    public Restaurant saveRestaurant(Restaurant restaurant);

    public void updateMenuItem(int id, MenuItem item);

    public Restaurant getRestaurantById(int id);

    public List<Restaurant> getRestaurantByLocation(String location);

    public List<Restaurant> getRestaurantByType(CuisineType type);

    public Restaurant getRestaurantByName(String name);

    public List<Restaurant> getAllRestaurants();

    public List<Restaurant> getAllActiveRestaurants();

    public List<Restaurant> getAllDeActiveRestaurants();

    public boolean updateActivationStatus(int id, boolean status);

    public boolean deleteRestaurant(int id);
}
