package com.mysql;

import com.streamapi.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class InsertRecordaccount {
    public static void main(String[] args) {

//step1": need get required details like url of db,name db and name of schema,username,password
        String url = "jdbc:mysql://localhost/phani";
        String uname = "root";
        String pass = "Kalhonaho02&";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con
                    = DriverManager.getConnection(url, uname, pass);
            Statement statement = con.createStatement();
            StringBuilder query = getStringBuilder();
            statement.execute(query.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println("looks like jar file is not added to path");
        } catch (SQLException ex) {
            System.out.println("looks like there issue connecting db  schema or table");
        }
    }

    private static StringBuilder getStringBuilder() {
        Account account = new Account(3, "11111", "2024-05-21", "su@gmail.com");


        StringBuilder query = new StringBuilder();
        query.append("insert into account(name,phone,date,email) values");
        query.append("(");
        query.append(account.getName());
        query.append(",");
        query.append("'");
        query.append(account.getPhone());
        query.append("'");
        query.append(",");
        query.append("'");
        query.append(account.getDate());
        query.append("'");
        query.append(",");
        query.append("'");
        query.append(account.getEmail());
        query.append("'");
        query.append(")");
        return query;
    }
}
