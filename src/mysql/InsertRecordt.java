package com.mysql;

import com.streamapi.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordt {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//step1": need get required details like url of db,name db and name of schema,username,password
        String url = "jdbc:mysql://localhost/phani";
        String uname = "root";
        String pass = "Kalhonaho02&";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con
                = DriverManager.getConnection(url, uname, pass);

        Statement statement = con.createStatement();

        StringBuilder query = getStringBuilder();
        statement.execute(query.toString());
    }

    private static StringBuilder getStringBuilder() {
        Employee emp = new Employee();
        emp.setAge(35);
        emp.setId(3);
        emp.setName("phani");

        StringBuilder query = new StringBuilder();
        query.append("insert into employee(id,name,age) values");
        query.append("(");
        query.append(emp.getId());
        query.append(",");
        query.append("'");
        query.append(emp.getName());
        query.append("'");
        query.append(",");
        query.append(emp.getAge());
        query.append(")");
        return query;
    }
}
