package repository;

import restaurantManagementModule.MenuItem;
import restaurantManagementModule.Restaurant;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface RestaurantDatabaseRepository {
    public Restaurant saveRestaurant(Restaurant restaurant);

    public void updateMenuItem(int id, MenuItem item);

    public Restaurant getRestaurantById(int id);

    public Optional<Restaurant> getRestaurantByLocation(String location);

    public Optional<Restaurant> getRestaurantByName(String name);

    public List<Restaurant> getAllRestaurants();

    public List<Restaurant> getAllActiveRestaurants();

    public List<Restaurant> getAllDeActiveRestaurants();

    public Optional<Restaurant> updateActivationStatus(Restaurant restaurant);

    public Optional<Restaurant> deleteRestaurant(int id);
}
