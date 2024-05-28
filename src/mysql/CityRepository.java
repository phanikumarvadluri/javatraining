package com.mysql;

import java.sql.*;

public class CityRepository {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/sakila";
        String uname = "root";
        String pass = "Kalhonaho02&";
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, uname, pass);
            statement = con.createStatement();
            String query
                    = "select * from city";
            statement.executeQuery(query);

            while (resultSet.next()) {
                String cityId = resultSet.getString("city_id");
                String city = resultSet.getString("city");
                String countyId = resultSet.getString("country_id");

                System.out.print(city + "||");
                System.out.print(cityId + "||");
                System.out.print(countyId);
                System.out.println();
            }
            System.out.println(resultSet.next());

        } catch (ClassNotFoundException ex) {
            System.out.println("looks like jar file is not added to path");
        } catch (SQLException ex) {
            System.out.println("looks like there issue connecting db  schema or table");
            System.out.println(ex);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
    }


}
