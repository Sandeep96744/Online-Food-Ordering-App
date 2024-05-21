package restaurantManagementModule;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private int id;
    private String name;
    private CuisineType cuisineType;
    private String location;
    private LocalTime openTime;
    private LocalTime closeTime;
    private boolean isActive;
    private List<MenuItem> menu;
    List<Order> orders;

    public Restaurant() {}

    public Restaurant(int id, String name, CuisineType cuisineType, String location, LocalTime openTime, LocalTime closeTime, boolean isActive) {
        this.id = id;
        this.name = name;
        this.cuisineType = cuisineType;
        this.location = location;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.isActive = isActive;
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public void setOpenTime(LocalTime openTime) {
        this.openTime = openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(LocalTime closeTime) {
        this.closeTime = closeTime;
    }

    public void setActive(boolean status) {
        this.isActive = status;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrders(Order order) {
        this.orders.add(order);
    }

    @Override
    public String toString() {
        return "Restaurant Details:\n" +
                "ID='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cuisineType='" + cuisineType + '\'' +
                ", location='" + location + '\'' +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", isActive=" + ((isActive)?"Active\n": "Inactive\n");
    }

    public void displayMenu() {
        System.out.println("Welcome to " + this.getName() + ": A " + getClass().getSimpleName() + "!\nMenu Items:");
        for(MenuItem item: this.getMenu()) {
            System.out.printf("%-25s%-20s₹%s", item.getItemName(), item.getType(), item.getItemPrice());
            System.out.println();
        }
        System.out.println();
    }
}
