package restaurantManagementModule;

import java.util.*;


public class MenuItem {
    private String itemName;
    private ItemType type;
    private Double itemPrice;

    public MenuItem() {}

    public MenuItem(String itemName,ItemType type, Double itemPrice) {
        this.itemName = itemName;
        this.type = type;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

}
