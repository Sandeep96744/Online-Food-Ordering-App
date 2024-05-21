package restaurantManagementModule;

import java.time.LocalTime;

public class FineDiningRestaurant extends Restaurant {

    public FineDiningRestaurant(int id, String name, String location, LocalTime closeTime, LocalTime openTime, boolean status) {
        super(id, name, CuisineType.FINE_DINING_RESTAURANT, location, closeTime, openTime, status);
    }

}
