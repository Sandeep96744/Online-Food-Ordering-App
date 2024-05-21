package repository;

import restaurantManagementModule.CuisineType;
import restaurantManagementModule.MenuItem;
import restaurantManagementModule.Restaurant;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface RestaurantDatabaseRepository {
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
