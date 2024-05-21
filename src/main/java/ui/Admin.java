package ui;

import repository.RestaurantDatabaseRepository;
import repository.RestaurantDatabaseRepositoryImpl;
import restaurantManagementModule.*;
import service.CustomerService;
import service.CustomerServiceImplementation;
import service.RestaurantService;
import service.RestaurantServiceImplementation;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

public class Admin {
    public static void main(String[] args) {
        RestaurantService repo = new RestaurantServiceImplementation();

        // adding restaurants
        Restaurant restaurant1 = new FastFoodRestaurant(101, "Bigg Boss", "Kolkata",
                LocalTime.parse("09:00"), LocalTime.parse("19:00"), true);

        Restaurant restaurant2 = new FineDiningRestaurant(102, "Sanjha Chulha", "Delhi",
                LocalTime.parse("09:00"), LocalTime.parse("20:00"), false);

        Restaurant restaurant3 = new FineDiningRestaurant(103, "Desi Lane", "Kolkata",
                LocalTime.parse("09:00"), LocalTime.parse("19:00"), true);


        RestaurantDatabaseRepository db = new RestaurantDatabaseRepositoryImpl();

//        db.saveRestaurant(restaurant1);
//        db.saveRestaurant(restaurant2);
//        db.saveRestaurant(restaurant3);

        // adding items in restaurant1
//        repo.addRestaurant(restaurant1);
//        repo.updateMenuItem(restaurant1, new MenuItem("Noodles", ItemType.VEG, 149.0));
//        repo.updateMenuItem(restaurant1, new MenuItem("Soup", ItemType.VEG,119.0));
//        repo.updateMenuItem(restaurant1, new MenuItem("Manchurian", ItemType.VEGAN, 349.0));

//        db.updateMenuItem(101, new MenuItem("Noodles", ItemType.VEG, 149.0));
//        db.updateMenuItem(101, new MenuItem("Soup", ItemType.VEG,119.0));
//        db.updateMenuItem(101, new MenuItem("Manchurian", ItemType.VEGAN, 349.0));
//
//        // adding items in restaurant2
//        repo.addRestaurant(restaurant2);
//        repo.updateMenuItem(restaurant2, new MenuItem("Chicken Biryani", ItemType.NON_VEG, 399.0));
//        repo.updateMenuItem(restaurant2, new MenuItem("Paneer Masala", ItemType.VEG, 249.0));
//        repo.updateMenuItem(restaurant2, new MenuItem("Butter Naan", ItemType.VEG, 25.0));


//        db.updateMenuItem(102, new MenuItem("Chicken Biryani", ItemType.NON_VEG, 399.0));
//        db.updateMenuItem(102, new MenuItem("Paneer Masala", ItemType.VEG, 249.0));
//        db.updateMenuItem(102, new MenuItem("Butter Naan", ItemType.VEG, 25.0));


//        // adding items in restaurant3
//        repo.addRestaurant(restaurant3);
//        repo.updateMenuItem(restaurant3, new MenuItem("Crispy Baby Corn", ItemType.VEG, 199.0));
//        repo.updateMenuItem(restaurant3, new MenuItem("Paneer Chilli", ItemType.VEG, 299.0));

//        db.updateMenuItem(103, new MenuItem("Crispy Baby Corn", ItemType.VEG, 199.0));
//        db.updateMenuItem(103, new MenuItem("Paneer Chilli", ItemType.VEG, 299.0));
//        db.updateMenuItem(103, new MenuItem("Paneer Chilli", ItemType.VEG, 299.0));

//        db.deleteRestaurant(103);

        db.getAllRestaurants().forEach(e -> {
            System.out.println(e);
            e.displayMenu();
        });

        // Finding all active restaurants
//        List<Restaurant> restaurantList = repo.findAllActiveRestaurant();
//        System.out.println("Active Restaurants:");
//        restaurantList.forEach(restaurant -> System.out.println(restaurant.getName()));


//        // after deactivating restaurants, finding active ones
//        repo.deActivateRestaurant(101);
//        repo.activateRestaurant(102);
//
//
//        restaurantList = repo.findAllActiveRestaurant();
//        System.out.println("\nActive Restaurants:");
//        restaurantList.forEach(restaurant -> {
//            System.out.println(restaurant.getName());
//            restaurant.displayMenu();
//        });
//
//
//        // finding restaurants by location
//        String location = "Kolkata";
//        restaurantList = repo.findRestaurantByLocation(location);
//        System.out.println("\nRestaurants in " + location + ":");
//        restaurantList.forEach(restaurant -> System.out.println(restaurant.getName()));
//
//
//        CuisineType type = CuisineType.FINE_DINING_RESTAURANT;
//        restaurantList = repo.findRestaurantByType(type);
//        System.out.println("\nRestaurants in " + type + ":");
//        restaurantList.forEach(restaurant -> System.out.println(restaurant.getName()));
//




//        Customer customer = new Customer("Karan");
//
//        CustomerService customerService = new CustomerServiceImplementation(repo);
//        List<Restaurant> list = customerService.findAllActiveRestaurant();
//        System.out.println("Active Restaurants:");
//        list.forEach(restaurant -> System.out.println(restaurant.getName()));
//
//        Restaurant restaurant = list.get(1);
//        restaurant.displayMenu();
//        String item1 = "Paneer chilli";
//        List<MenuItem> menu = restaurant.getMenu();
//
//        MenuItem menuItem1 = menu.stream().filter(e -> e.getItemName().equalsIgnoreCase(item1)).findAny().get();
//        customerService.addItem(menuItem1, 1);
//        customerService.reviewCartItem();
//
//        customerService.order(customer,"1st Floor, Birla Garden", "Credit card");
//
//        String item2 = "crispy Baby corn";
//        MenuItem menuItem2 = menu.stream().filter(e -> e.getItemName().equalsIgnoreCase(item2)).findAny().get();
//        customerService.addItem(menuItem2, 3);
//        customerService.order(customer, "3/E, park street", "Cash");



    }
}

