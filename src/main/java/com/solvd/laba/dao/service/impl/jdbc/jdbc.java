package com.solvd.laba.dao.service.impl.jdbc;

import java.sql.*;

public class jdbc {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/tutorial";
        String username="root";
        String password="22062001lll";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url, username, password);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM employee");
            while (resultSet.next()){
                System.out.println(resultSet.getString(2));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
