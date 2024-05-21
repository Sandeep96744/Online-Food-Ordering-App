package restaurantManagementModule;


import java.time.LocalTime;

public class FastFoodRestaurant extends Restaurant {


    public FastFoodRestaurant(int id, String name, String location, LocalTime closeTime, LocalTime openTime, boolean status) {
        super(id, name, CuisineType.FAST_FOOD_RESTAURANT, location, closeTime, openTime, status);
    }

}
