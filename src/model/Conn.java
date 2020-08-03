package model;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conn {
    private static Connection conn;
    public static Connection getConnection(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app?serverTimezone=UTC", "root", "");
        }catch(SQLException e){
            e.printStackTrace();
        }

        return conn;
    }
}