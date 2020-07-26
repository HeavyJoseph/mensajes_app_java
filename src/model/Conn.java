package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn{
    public static Connection getConnection(){
        Connection conx = null;
        try{
            conx = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app?serverTimezone=UTC", "root", "");
            if(conx != null){
                System.out.println("Conexión exitosa la puta madre");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return conx;
    }
}