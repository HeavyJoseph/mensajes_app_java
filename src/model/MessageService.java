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
        MessageDAO.getMessagesDB();

    }

    public static void getMessageById(){
        System.out.println("Favor digite el ID del mensaje que desea ver:");
        Scanner sc = new Scanner(System.in);
        Integer messageID = Integer.valueOf(sc.nextLine());
        MessageDAO.getMessageByIdDB(messageID);
    }

    public static void deleteMessage(){
        System.out.println("Favor digite el ID del mensaje que desea eliminar:");
        Scanner sc = new Scanner(System.in);
        Integer messageID = Integer.valueOf(sc.nextLine());
        MessageDAO.deleteMessageDB(messageID);
    }

    public static void updateMessage(){
        System.out.println("Favor digite el ID del mensaje que desea actualizar:");
        Scanner sc = new Scanner(System.in);
        Integer messageID = Integer.valueOf(sc.nextLine());
        System.out.println("Información actual:");
        MessageDAO.getMessageByIdDB(messageID);
        System.out.println("Favor registre la nueva información.");

        System.out.println("Escribe tu mensaje: ");
        String message = sc.nextLine();

        System.out.println("Escribe tu nombre: ");
        String author = sc.nextLine();

        Message messageObject = new Message(message, author, new Date());
        MessageDAO.updateMessageDB(messageID, messageObject);
    }
}