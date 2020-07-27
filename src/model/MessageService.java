package model;

import java.util.Scanner;
import java.util.Date;

public class MessageService {
    public static void addMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje: ");
        String message = sc.nextLine();

        System.out.println("Escribe tu nombre: ");
        String author = sc.nextLine();

        Message messageObject = new Message(message, author, new Date());
        MessageDAO.addMessageDB(messageObject);
    }

    public static void getMessages(){

    }

    public static void deleteMessage(){

    }

    public static void updateMessage(){

    }
}