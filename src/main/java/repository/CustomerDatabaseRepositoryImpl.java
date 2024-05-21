package repository;

import restaurantManagementModule.Customer;
import restaurantManagementModule.MenuItem;
import util.JdbcConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDatabaseRepositoryImpl implements CustomerDatabaseRepository {

    @Override
    public Customer saveCustomer(Customer customer) {
        try(Connection connection = JdbcConnectionUtil.getConnection()) {
            String query = "create table cart" + customer.getId() + " (item_name varchar(20) unique, item_type varchar(10), price double, quantity int);";
            PreparedStatement stm0 = connection.prepareStatement(query);
            stm0.executeUpdate();

            String cusQuery = "insert into customer values (?, ?, ?);";
            PreparedStatement stm = connection.prepareStatement(cusQuery);
            stm.setInt(1, customer.getId());
            stm.setString(2, customer.getName());
            stm.setString(3, "cart" + customer.getId());

            if(stm.executeUpdate() == 0)
                throw new RuntimeException("Unable to Insert Customer!..");

            System.out.println("Customer Saved!..");
            return customer;
        }
        catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public boolean saveItem(Customer customer, int restaurantId, String itemName, int quantity) {
        try(Connection connection = JdbcConnectionUtil.getConnection()) {
            String query = "select * from menu" + restaurantId + "where item_name = '" + itemName + "';";
            PreparedStatement stm0 = connection.prepareStatement(query);
            ResultSet result = stm0.executeQuery();

            if(!result.next()) {
                throw new RuntimeException("Item Doesn't Exists!..");
            }

            String cartQuery = "insert into cart" + customer.getId() + " values (?, ?, ?, ?);";
            PreparedStatement stm = connection.prepareStatement(query);


            stm.setString(1, result.getString(1));
            stm.setString(2, result.getString(2));
            stm.setDouble(3, result.getDouble(3));
            stm.setInt(4, quantity);
            System.out.println("Item added to cart!..");
            return true;
        }
        catch (SQLException ex) { throw new RuntimeException(ex.getMessage()); }
    }

    @Override
    public boolean deleteItem(Customer customer, String itemName) {
        try(Connection connection = JdbcConnectionUtil.getConnection()) {
            String query = "delete from cart" + customer.getId() + " where item_name = '" + itemName + "';";
            PreparedStatement stm = connection.prepareStatement(query);

            if(stm.executeUpdate() == 0)
                throw new RuntimeException("Record Doesn't Exists!..");

            System.out.println("Item removed from cart!..");
            return true;
        }
        catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public void reviewCartItem() {

    }

    @Override
    public double cartValue() {
        return 0;
    }

    @Override
    public void placeOrder(Customer customer, String address, String paymentType) {

    }
}
