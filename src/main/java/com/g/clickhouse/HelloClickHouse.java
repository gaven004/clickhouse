package com.g.clickhouse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Properties;

import com.clickhouse.jdbc.ClickHouseDataSource;

public class HelloClickHouse {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:ch://47.94.96.234:18123";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "P7HtW800kgmx");

        ClickHouseDataSource dataSource = new ClickHouseDataSource(url, properties);
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from system.tables limit 10")) {
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columns = resultSetMetaData.getColumnCount();
            while (resultSet.next()) {
                for (int c = 1; c <= columns; c++) {
                    System.out.print(resultSetMetaData.getColumnName(c) + ":" + resultSet.getString(c) + (c < columns ? ", " : "\n"));
                }
            }
        }
    }
}
