package ui;

import model.Message;
import model.MessageService;

import java.util.Scanner;

public class Menu {

    public static void showMenu(){

        int userResponse = 0;
        do{
            System.out.println("_______________________");
            System.out.println("Bienvenido, favor seleccione la opción:");
            System.out.println("1. Agregar un mensaje.");
            System.out.println("2. Revisar los mensajes.");
            System.out.println("3. Actualizar un mensaje.");
            System.out.println("4. Eliminar un mensaje.");
            System.out.println("5. Salir de la aplicación.");

            Scanner sc = new Scanner(System.in);
            userResponse = Integer.valueOf(sc.nextLine());

            switch(userResponse){
                case 1:
                    System.out.println("Ha seleccionado la opción 1");
                    MessageService.addMessage();
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opción 2");
                    MessageService.getMessages();
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opción 3");
                    MessageService.updateMessage();
                    break;
                case 4:
                    System.out.println("Ha seleccionado la opción 4");
                    MessageService.deleteMessage();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el sistema");
                    sc.close();
                    break;
                default:
                    System.out.println("Favor ingrese una opción correcta.");
                    break;
            }
        }while(userResponse != 5);

    }
}