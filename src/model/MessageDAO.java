package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageDAO {
    public static void addMessageDB(Message message) {
        try(Connection connection = Conn.getConnection()){
            PreparedStatement preparedStatement;
            try{
                String insertQuery = "INSERT INTO mensajes (mensaje, autor) VALUES (?,?)";
                preparedStatement = connection.prepareStatement(insertQuery);
                preparedStatement.setString(1, message.getMessage());
                preparedStatement.setString(2, message.getAuthor());
                Integer messageisAdded = preparedStatement.executeUpdate();

                if(messageisAdded != 0){
                    System.out.println("Mensaje agregado correctamente.");
                }else{
                    System.out.println("No se ha podido agregar el mensaje.");
                }
            }catch(SQLException ex){
                ex.printStackTrace();
                System.out.println("No se ha podido agregar el mensaje.");
            }
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("No se ha podido agregar el mensaje.");
        }
    }

    public static void getMessagesDB(){
        try(Connection connection = Conn.getConnection()){
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            try{
                String selectQuery = "SELECT * FROM mensajes";
                preparedStatement = connection.prepareStatement(selectQuery);
                resultSet = preparedStatement.executeQuery();

                while(resultSet.next()){
                    System.out.println();
                    System.out.println(resultSet.getInt(1));
                    System.out.println(resultSet.getString(2));
                    System.out.println(resultSet.getString(3));
                    System.out.println(resultSet.getTimestamp(4));
                    System.out.println();
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void getMessageByIdDB(Integer messageID){
        try(Connection connection = Conn.getConnection()){
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            try{
                String selectQuery = "SELECT * FROM mensajes WHERE id_mensaje = ?";
                preparedStatement = connection.prepareStatement(selectQuery);
                preparedStatement.setInt(1, messageID);
                resultSet = preparedStatement.executeQuery();

                while(resultSet.next()){
                    System.out.println("Mensaje ID: " + resultSet.getInt(1));
                    System.out.println("Mensaje: " + resultSet.getString(2));
                    System.out.println("Autor: " + resultSet.getString(3));
                    System.out.println("Fecha de mensaje: " + resultSet.getTimestamp(4));
                    System.out.println();
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void deleteMessageDB(Integer messageID){
        try(Connection connection = Conn.getConnection()){
            PreparedStatement preparedStatement;
            try{
                String deleteQuery = "DELETE FROM mensajes WHERE id_mensaje = ?";
                preparedStatement = connection.prepareStatement(deleteQuery);
                preparedStatement.setInt(1, messageID);
                Integer isMessageDeleted = preparedStatement.executeUpdate();

                if(isMessageDeleted != 0){
                    System.out.printf("Mensaje de ID %d eliminado correctamente", messageID);
                    System.out.println();
                }
                else{
                    System.out.printf("No se encontro el mensaje de ID %d.", messageID);
                    System.out.println();
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public static void updateMessageDB(Integer messageID, Message message){
        try(Connection connection = Conn.getConnection()){
            PreparedStatement preparedStatement;
            try{
                String updateQuery = "UPDATE mensajes SET mensaje = ?, autor = ? WHERE mensajes.id_mensaje = ?";
                preparedStatement = connection.prepareStatement(updateQuery);
                preparedStatement.setInt(3, messageID);
                preparedStatement.setString(1, message.getMessage());
                preparedStatement.setString(2, message.getAuthor());
                Integer isUpdatedTrue = preparedStatement.executeUpdate();

                if(isUpdatedTrue != 0){
                    System.out.printf("Mensaje de ID %d actualizado correctamente", messageID);
                    System.out.println();
                }
                else{
                    System.out.printf("No se encontro el mensaje de ID %d.", messageID);
                    System.out.println();
                }

            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}