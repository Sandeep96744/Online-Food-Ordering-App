package repository;

import restaurantManagementModule.CuisineType;
import restaurantManagementModule.ItemType;
import restaurantManagementModule.MenuItem;
import restaurantManagementModule.Restaurant;
import util.JdbcConnectionUtil;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class RestaurantDatabaseRepositoryImpl implements RestaurantDatabaseRepository {

    @Override
    public Restaurant saveRestaurant(Restaurant restaurant) {
        try(Connection connection = JdbcConnectionUtil.getConnection()) {
            String createTable = "create table menu" + restaurant.getId() + "(item_name varchar(20) unique, item_type varchar(10), item_price double);";
            PreparedStatement stm0 = connection.prepareStatement(createTable);
            stm0.executeUpdate();

            String query = "insert into restaurant values (?, ?, ?, ?, ?, ?, ?, ?, null);";
            PreparedStatement stm = connection.prepareStatement(query);
            stm.setInt(1, restaurant.getId());
            stm.setString(2, restaurant.getName());
            stm.setString(3, String.valueOf(restaurant.getCuisineType()));
            stm.setString(4, restaurant.getLocation());
            stm.setTime(5, Time.valueOf(restaurant.getOpenTime()));
            stm.setTime(6, Time.valueOf(restaurant.getCloseTime()));
            stm.setBoolean(7, restaurant.isActive());
            stm.setString(8, "menu"+restaurant.getId());


            if(stm.executeUpdate() == 0)
                throw new RuntimeException("Unable to Insert Restaurant!..");

            System.out.println("Restaurant Saved!..");
            return restaurant;
        }
        catch (SQLException ex) { throw new RuntimeException(ex.getMessage()); }
    }

    @Override
    public void updateMenuItem(int id, MenuItem item) {
        try(Connection connection = JdbcConnectionUtil.getConnection()) {
            String query = "insert into menu" + id + " values (?, ?, ?);";
            PreparedStatement stm = connection.prepareStatement(query);

            stm.setString(1, item.getItemName());
            stm.setString(2, String.valueOf(item.getType()));
            stm.setDouble(3, item.getItemPrice());

            if(stm.executeUpdate() == 0)
                throw new RuntimeException("Unable to Insert Menu Item!..");

            System.out.println("Menu Updated!..");
        }
        catch (SQLException ex) { throw new RuntimeException(ex.getMessage()); }
    }

    @Override
    public Restaurant getRestaurantById(int id) {
        try(Connection connection = JdbcConnectionUtil.getConnection()) {
            String query = "select * from restaurant where id = " + id + ";";
            PreparedStatement stm = connection.prepareStatement(query);
            ResultSet resultSet = stm.executeQuery();

            Restaurant restaurant = new Restaurant();
            while(resultSet.next()) {
                restaurant.setId(resultSet.getInt(1));
                restaurant.setName(resultSet.getString(2));
                restaurant.setCuisineType(CuisineType.valueOf(resultSet.getString(3)));
                restaurant.setLocation(resultSet.getString(4));
                restaurant.setOpenTime(resultSet.getTime(5).toLocalTime());
                restaurant.setCloseTime(resultSet.getTime(6).toLocalTime());
                restaurant.setActive(resultSet.getBoolean(7));

                String qry = "select * from menu" + restaurant.getId() + ";";
                PreparedStatement stm0 = connection.prepareStatement(qry);
                ResultSet res = stm0.executeQuery();
                List<MenuItem> menu = new ArrayList<>();

                while(res.next()) {
                    MenuItem item = new MenuItem();
                    item.setItemName(res.getString(1));
                    item.setType(ItemType.valueOf(res.getString(2)));
                    item.setItemPrice(res.getDouble(3));
                    menu.add(item);
                }
                restaurant.setMenu(menu);
            }
            return restaurant;
        }
        catch (SQLException ex) { throw new RuntimeException(ex.getMessage()); }
    }

    @Override
    public Optional<Restaurant> getRestaurantByLocation(String location) {
        return Optional.empty();
    }

    @Override
    public Optional<Restaurant> getRestaurantByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return List.of();
    }

    @Override
    public List<Restaurant> getAllActiveRestaurants() {
        return List.of();
    }

    @Override
    public List<Restaurant> getAllDeActiveRestaurants() {
        return List.of();
    }

    @Override
    public Optional<Restaurant> updateActivationStatus(Restaurant restaurant) {
        return Optional.empty();
    }

    @Override
    public Optional<Restaurant> deleteRestaurant(int id) {
        return Optional.empty();
    }
}
