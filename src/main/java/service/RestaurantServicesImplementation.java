package service;

import repository.RestaurantDatabaseRepository;
import repository.RestaurantDatabaseRepositoryImpl;
import restaurantManagementModule.CuisineType;
import restaurantManagementModule.MenuItem;
import restaurantManagementModule.Restaurant;

import java.util.List;

public class RestaurantServicesImplementation implements RestaurantServices {

    RestaurantDatabaseRepository db;
    public RestaurantServicesImplementation() {
        db = new RestaurantDatabaseRepositoryImpl();
    }

    @Override
    public Restaurant saveRestaurant(Restaurant restaurant) {
        return db.saveRestaurant(restaurant);
    }

    @Override
    public void updateMenuItem(int id, MenuItem item) {
        db.updateMenuItem(id, item);
    }

    @Override
    public Restaurant getRestaurantById(int id) {
        return db.getRestaurantById(id);
    }

    @Override
    public List<Restaurant> getRestaurantByLocation(String location) {
        return db.getRestaurantByLocation(location);
    }

    @Override
    public List<Restaurant> getRestaurantByType(CuisineType type) {
        return db.getRestaurantByType(type);
    }

    @Override
    public Restaurant getRestaurantByName(String name) {
        return db.getRestaurantByName(name);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return db.getAllRestaurants();
    }

    @Override
    public List<Restaurant> getAllActiveRestaurants() {
        return db.getAllActiveRestaurants();
    }

    @Override
    public List<Restaurant> getAllDeActiveRestaurants() {
        return db.getAllDeActiveRestaurants();
    }

    @Override
    public boolean updateActivationStatus(int id, boolean status) {
        return db.updateActivationStatus(id, status);
    }

    @Override
    public boolean deleteRestaurant(int id) {
        return db.deleteRestaurant(id);
    }
}
