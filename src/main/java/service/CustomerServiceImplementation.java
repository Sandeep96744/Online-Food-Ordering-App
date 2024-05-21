package service;

import repository.CustomerRepository;
import repository.CustomerRepositoryImplementation;
import restaurantManagementModule.CuisineType;
import restaurantManagementModule.Customer;
import restaurantManagementModule.MenuItem;
import restaurantManagementModule.Restaurant;

import java.util.List;

public class CustomerServiceImplementation implements CustomerService {

    CustomerRepository customerRepository;
    RestaurantService restaurantService;

    public CustomerServiceImplementation(RestaurantService restaurantService) {
        customerRepository = new CustomerRepositoryImplementation();
        this.restaurantService = restaurantService;
    }

    @Override
    public void addItem(MenuItem item, int quantity) {
        customerRepository.addItem(item, quantity);
    }

    @Override
    public void removeItem(MenuItem item) {
        customerRepository.removeItem(item);
    }

    @Override
    public void reviewCartItem() {
        customerRepository.reviewCartItem();
    }

    @Override
    public List<Restaurant> findRestaurantByLocation(String location) {
        return restaurantService.findRestaurantByLocation(location);
    }

    @Override
    public List<Restaurant> findRestaurantByName(String name) {
        return restaurantService.findRestaurantByName(name);
    }

    @Override
    public List<Restaurant> findRestaurantByType(CuisineType type) {
        return restaurantService.findRestaurantByType(type);
    }

    @Override
    public List<Restaurant> findAllActiveRestaurant() {
        return restaurantService.findAllActiveRestaurant();
    }

    @Override
    public void order(Customer customer, String address, String paymentType) {
        customerRepository.order(customer, address, paymentType);
    }


}
