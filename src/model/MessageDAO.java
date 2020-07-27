package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageDAO {
    public static void addMessageDB(Message message){
        Conn db_connect = new Conn();
        try(Connection connection = db_connect.getConnection()){
            PreparedStatement ps;
            try{
                String query = "INSERT INTO mensajes (mensaje, autor) VALUES (?,?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setString(2, message.getAuthor());
                ps.executeUpdate();
                System.out.println("El mensaje fue creado correctamente.");
            }catch(SQLException ex){
                ex.printStackTrace();
                System.out.println(ex);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public static void getMessagesDB(){

    }

    public static void deleteMessageDB(Integer messageID){

    }

    public static void updateMessageDB(Message message){

    }
}
