package ui;

import repository.RestaurantDatabaseRepository;
import repository.RestaurantDatabaseRepositoryImpl;
import restaurantManagementModule.*;
import service.*;

import java.sql.Time;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Admin {

    static RestaurantServices db = new RestaurantServicesImplementation();

    public static void main(String[] args) {
        RestaurantService repo = new RestaurantServiceImplementation();

        // adding restaurants
//        Restaurant restaurant1 = new FastFoodRestaurant(101, "Bigg Boss", "Kolkata",
//                LocalTime.parse("09:00"), LocalTime.parse("19:00"), true);
//
//        Restaurant restaurant2 = new FineDiningRestaurant(102, "Sanjha Chulha", "Delhi",
//                LocalTime.parse("09:00"), LocalTime.parse("20:00"), false);
//
//        Restaurant restaurant3 = new FineDiningRestaurant(103, "Desi Lane", "Kolkata",
//                LocalTime.parse("09:00"), LocalTime.parse("19:00"), true);


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
//        db.deleteRestaurant(102);
//        db.deleteRestaurant(101);

        //db.updateActivationStatus(102, true);

        db.getRestaurantByType(CuisineType.FINE_DINING_RESTAURANT).forEach(e -> {
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


        Scanner sc = new Scanner(System.in);

        System.out.println("1. Admin\n2. Customer\n3. Delivery Agent\n4. Exit\nMake your choice from above:");

        int choice = Integer.parseInt(sc.nextLine().strip());

        switch(choice){
            case 1:
                adminLogin(sc);
                break;
            case 2:
                customerLogin(sc);
                break;
            case 3:

                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    private static void customerLogin(Scanner sc) {
        System.out.println("Welcome Customer!");
        char ch = 'Y';
        while (ch == 'Y') {
            System.out.println("Here's your list of Services:\n1. View All Restaurants\n2. View All Active Restaurants\n3. View All In-Active Restaurants\n4. Search Restaurant By ID\n5. Search Restaurant By Name\n6. Search Restaurant By Location\n7. Search Restaurant By Cuisine_Type\nMake your choice:");
            int customerChoice = Integer.parseInt(sc.nextLine().strip());
            switch (customerChoice) {
                case 1: {

                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                default:
                    System.out.println("Invalid Input");
            }

            System.out.println("Do you wish to continue ('Y' / 'N'):");
            ch = sc.nextLine().strip().charAt(0);
        }
        System.out.println("Thank You!");
    }

    static int idCnt = 1;
    public static void adminLogin(Scanner sc) {
        System.out.println("Welcome Admin!");
        char ch = 'Y';
        while (ch == 'Y') {
            System.out.println("Here's your list of Services:\n1. Add Restaurant\n2. Search Restaurant By ID\n3. Search Restaurant By Name\n4. Search Restaurant By Location\n5. Search Restaurant By Cuisine_Type\n6. Update Restaurant's Menu\n7. Update Activation Status\n8. Delete Restaurant\n9. View All Restaurants\n10. View All Active Restaurants\n11. View All In-Active Restaurants\nMake your choice:");
            int adminChoice = Integer.parseInt(sc.nextLine().strip());
            switch (adminChoice) {
                case 1: {
                    System.out.println("Enter Details:\nRestaurant_Name:");
                    String name = sc.nextLine();
                    System.out.println("Location:");
                    String location = sc.nextLine();
                    System.out.println("Open-Time:");
                    LocalTime t1 = LocalTime.parse(sc.nextLine());
                    System.out.println("Close-Time:");
                    LocalTime t2 = LocalTime.parse(sc.nextLine());
                    System.out.println("Choose Status:\n1. Active\n2. Inactive");
                    boolean status = Integer.parseInt(sc.nextLine().strip()) == 1;
                    System.out.println("Choose CuisineType:\n1. " + CuisineType.FINE_DINING_RESTAURANT + "\n2. " + CuisineType.FAST_FOOD_RESTAURANT);
                    int type = Integer.parseInt(sc.nextLine().strip());

                    Restaurant restaurant = (type == 1) ? (new FineDiningRestaurant(idCnt, name, location, t1, t2, status)) : (new FastFoodRestaurant(idCnt, name, location, t1, t2, status));
                    db.saveRestaurant(restaurant);
                    idCnt++;
                    break;
                }

                case 2: {
                    System.out.println("Enter Restaurant_ID:");
                    int id = Integer.parseInt(sc.nextLine().strip());
                    System.out.println(db.getRestaurantById(id));
                    break;
                }
                case 3: {
                    System.out.println("Enter Restaurant_Name:");
                    String name = sc.nextLine();
                    System.out.println(db.getRestaurantByName(name));
                    break;
                }
                case 4: {
                    System.out.println("Enter Restaurant_Location:");
                    String location = sc.nextLine();
                    db.getRestaurantByLocation(location).forEach(System.out::println);
                    break;
                }
                case 5: {
                    System.out.println("Enter Restaurant_CuisineType:\nChoose CuisineType:\n1. " + CuisineType.FINE_DINING_RESTAURANT + "\n2. " + CuisineType.FAST_FOOD_RESTAURANT);
                    CuisineType type = (Integer.parseInt(sc.nextLine().strip()) == 1)? CuisineType.FINE_DINING_RESTAURANT : CuisineType.FAST_FOOD_RESTAURANT;
                    db.getRestaurantByType(type).forEach(System.out::println);
                    break;
                }
                case 6: {
                    System.out.println("Enter Restaurant_ID:");
                    int id = Integer.parseInt(sc.nextLine().strip());
                    System.out.println("Item_Name:");
                    String name = sc.nextLine();
                    System.out.println("Choose ItemType:\n1. VEG\n2. NON_VEG\n3. VEGAN");
                    int x = Integer.parseInt(sc.nextLine().strip());
                    ItemType type = (x == 1)? ItemType.VEG: (x == 2)? ItemType.NON_VEG: ItemType.VEGAN;
                    System.out.println("Price:");
                    double price = Double.parseDouble(sc.nextLine().strip());
                    MenuItem item = new MenuItem(name, type, price);
                    db.updateMenuItem(id, item);
                    break;
                }
                case 7: {
                    System.out.println("Enter Restaurant_ID:");
                    int id = Integer.parseInt(sc.nextLine().strip());
                    System.out.println("Enter Status:\n1. Active\n2. Inactive");
                    boolean status = Integer.parseInt(sc.nextLine().strip()) == 1;
                    db.updateActivationStatus(id, status);
                    break;
                }
                case 8: {
                    System.out.println("Enter Restaurant_ID:");
                    int id = Integer.parseInt(sc.nextLine().strip());

                    db.deleteRestaurant(id);
                    break;
                }
                case 9: {
                    System.out.println("Viewing all Restaurants:");
                    db.getAllRestaurants().forEach(System.out::println);
                    break;
                }
                case 10: {
                    System.out.println("Viewing all Active Restaurants");

                    db.getAllActiveRestaurants().forEach(System.out::println);
                    break;
                }
                case 11: {
                    System.out.println("Viewing all In-Active Restaurants");

                    db.getAllDeActiveRestaurants().forEach(System.out::println);
                    break;
                }

                default:
                    System.out.println("Invalid Input");
            }

            System.out.println("Do you wish to continue ('Y' / 'N'):");
            ch = sc.nextLine().strip().charAt(0);
        }
        System.out.println("Thank You!");
    }
}

