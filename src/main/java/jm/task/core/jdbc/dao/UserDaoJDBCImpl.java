package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.sql.Connection;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

    ; Connection connection = getConnection();
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {





        String sql = "CREATE TABLE products (Id INT PRIMARY KEY AUTO_INCREMENT, ProductName VARCHAR(20), Price INT)";

        try (Connection conn = DriverManager.getConnection(url, username, password)){

            Statement statement = conn.createStatement();
            // создание таблицы
            statement.executeUpdate(sql);

            System.out.println("Database has been created!");
        }
    }
         catch(Exception ex){
        System.out.println("Connection failed...");

        System.out.println(ex);







    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
