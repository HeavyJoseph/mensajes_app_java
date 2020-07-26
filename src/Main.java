import model.Conn;

import java.sql.Connection;

public class Main {
    public static void main(String[] args){
        try(Connection cnx = Conn.getConnection()){

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
