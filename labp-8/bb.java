import java.io.*;
import java.net.*;
import java.util.*;

class BulletinBoard {
    private ArrayList<String> Messages;

    public BulletinBoard() {
        Messages = new ArrayList<>();
    }

    public void postMessage(String message) {
        Messages.add(message);
        System.out.println("Message posted");
    }

    public void editMessage(int index, String newMessage) {
        if (index >= 0 && index < Messages.size()) {
            Messages.set(index, newMessage);
            System.out.println("Message edited successfully");
        } else {
            System.out.println("Invalid index. Message not edited.");
        }
    }

    public void deleteMessage(int index) {
        if (index >= 0 && index < Messages.size()) {
            Messages.remove(index);
            System.out.println("Message deleted");
        } else {
            System.out.println("The message does not exist");
        }
    }

    public void viewMessages() {
        if (Messages.size() > 0) {
            for (int i = 0; i < Messages.size(); i++) {
                System.out.println((i + 1) + ". " + Messages.get(i));
            }
        } else {
            System.out.println("Messages list is empty");
        }
    }
}

public class bb {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BulletinBoard bulletinBoard = new BulletinBoard();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Bulletin Board Menu ---");
            System.out.println("1. Post a message");
            System.out.println("2. Edit a message");
            System.out.println("3. Delete a message");
            System.out.println("4. View messages");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter your message: ");
                    String message = scanner.nextLine();
                    bulletinBoard.postMessage(message);
                    break;
                case 2:
                    bulletinBoard.viewMessages();
                    System.out.print("Enter the number of the message to edit: ");
                    int editIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter the new message: ");
                    String newMessage = scanner.nextLine();
                    bulletinBoard.editMessage(editIndex, newMessage);
                    break;
                case 3:
                    bulletinBoard.viewMessages();
                    System.out.print("Enter the number of the message to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    bulletinBoard.deleteMessage(deleteIndex);
                    break;
                case 4:
                    bulletinBoard.viewMessages();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting Bulletin Board. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}