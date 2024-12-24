package lab8;

import java.util.Scanner;

public class Menu {
    private Library<LibraryItem> library;
    private Scanner scanner;

    public Menu() {
        library = new Library<>();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Remove Item");
            System.out.println("4. Display Items");
            System.out.println("5. Get Item Details");
            System.out.println("6. Add Client");
            System.out.println("7. Remove Client");
            System.out.println("8. Display Clients");
            System.out.println("9. Get Client Details");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            try {
                switch (choice) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        addMagazine();
                        break;
                    case 3:
                        removeItem();
                        break;
                    case 4:
                        library.displayItems();
                        break;
                    case 5:
                        getItemDetails();
                        break;
                    case 6:
                        addClient();
                        break;
                    case 7:
                        removeClient();
                        break;
                    case 8:
                        library.displayClients();
                        break;
                    case 9:
                        getClientDetails();
                        break;
                    case 10:
                        System.out.println("Exiting the system...");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void addBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Book Category: ");
        String category = scanner.nextLine();
        System.out.print("Enter Book ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter Publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter Language: ");
        String language = scanner.nextLine();
        
        library.addBook(title, id, category, isbn, publisher, Language.valueOf(language.toUpperCase()));
        System.out.println("Book added successfully!");
    }

    private void addMagazine() {
        System.out.print("Enter Magazine Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Magazine ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Magazine Category: ");
        String category = scanner.nextLine();
        System.out.print("Enter Magazine ISSN: ");
        String issn = scanner.nextLine();
        System.out.print("Enter Publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter Language: ");
        String language = scanner.nextLine();
        
        library.addMagazine(title, id, category, issn, publisher, Language.valueOf(language.toUpperCase()));
        System.out.println("Magazine added successfully!");
    }

    private void removeItem() {
        System.out.print("Enter Item ID to Remove: ");
        int id = scanner.nextInt();
        library.removeItem(id);
        System.out.println("Item removed successfully!");
    }

    private void getItemDetails() throws ItemNotFoundException {
        System.out.print("Enter Item ID: ");
        int id = scanner.nextInt();
        LibraryItem item = library.getItem(id);
        System.out.println(item.getItemDetails());
    }

    private void addClient() {
        System.out.print("Enter Client ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Client Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Client Email: ");
        String email = scanner.nextLine();
        
        library.addClient(id, name, email);
        System.out.println("Client added successfully!");
    }

    private void removeClient() {
        System.out.print("Enter Client ID to Remove: ");
        int id = scanner.nextInt();
        library.removeClient(id);
        System.out.println("Client removed successfully!");
    }

    private void getClientDetails() throws ClientNotFoundException {
        System.out.print("Enter Client ID: ");
        int id = scanner.nextInt();
        Client client = library.getClient(id);
        System.out.println(client.getClientDetails());
    }
}
