package org.easybooks.xscj.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OrclConn {
    public static Connection conn;

    static {
        try {
            // 加载 Oracle JDBC 驱动
            Class.forName("oracle.jdbc.OracleDriver");

            // 创建到 Oracle 数据库的连接
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XSCJ", "SYSTEM", "Manager123");

            System.out.println("连接成功！");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 驱动未找到！");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("连接数据库失败！");
            e.printStackTrace();
        }
    }
}
