package lab8;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.InputMismatchException;

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
            System.out.println("10. Borrow Item");
            System.out.println("11. Return Item");
            System.out.println("12. Update Client");
            System.out.println("13. Update Item");
            System.out.println("14. Exit");
            System.out.print("Choose an option: ");


            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
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
                        borrowItem();
                        break;
                    case 11:
                        returnItem();
                        break;
                    case 12:
                        updateClient();
                        break;
                    case 13:
                        updateItem();
                        break;
                    case 14:
                        System.out.println("Exiting the system...");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            } catch (InputMismatchException e)
            {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); 
            }
             catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void addBook() {
        try {
            System.out.print("Enter Book Title: ");
            String title = scanner.nextLine();

            System.out.print("Enter Book ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (library.ItemIsFound(id)) {
                throw new ItemNotUniqueException("Item ID already exists. Please use a unique ID.");
            }

            System.out.print("Enter Book Category: ");
            String category = scanner.nextLine();

            System.out.print("Enter Book ISBN: ");
            String isbn = scanner.nextLine();

            System.out.print("Enter Publisher: ");
            String publisher = scanner.nextLine();

            System.out.print("Enter Language: ");
            String language = scanner.nextLine();

            library.addBook(title, id, category, isbn, publisher, Language.valueOf(language.toUpperCase()), Status.AVAILBLE);
            System.out.println("Book added successfully!");

        } catch (ItemNotUniqueException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid language specified. Please try again.");
        }
    }

    private void addMagazine() {
        try {
            System.out.print("Enter Magazine Title: ");
            String title = scanner.nextLine();

            System.out.print("Enter Magazine ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (library.ItemIsFound(id)) {
                throw new ItemNotUniqueException("Item ID already exists. Please use a unique ID.");
            }

            System.out.print("Enter Magazine Category: ");
            String category = scanner.nextLine();

            System.out.print("Enter Magazine ISSN: ");
            String issn = scanner.nextLine();

            System.out.print("Enter Publisher: ");
            String publisher = scanner.nextLine();

            System.out.print("Enter Language (EN or AR): ");
            String language = scanner.nextLine();

            library.addMagazine(title, id, category, issn, publisher, Language.valueOf(language.toUpperCase()), Status.AVAILBLE);
            System.out.println("Magazine added successfully!");

        } catch (ItemNotUniqueException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid language specified. Please try again.");
        }
    }

    private void removeItem() {
        System.out.print("Enter Item ID to Remove: ");
        int id = scanner.nextInt();
        library.removeItem(id);
        System.out.println("Item removed successfully!");
    }
    private void updateClient()
    {
        try{
            System.out.print("Enter Client ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            if (!library.ClientIsFound(id)) {
                throw new ClientNotFoundException("Client ID doesn't exist. Please enter a correct ID.");
            }
            System.out.println("Choose an option:");
            System.out.println("1) Name");
            System.out.println("2) Email");
            System.out.print("Enter here:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice)
            {
                case 1:
                    System.out.print("Enter New Client Name: ");
                    String NewName = scanner.nextLine();
                    if (!Pattern.matches("^[a-zA-Z ]+$", NewName)) {
                        throw new IllegalArgumentException("Invalid name format. Only letters and spaces are allowed.");
                    }
                    library.UpdateClientNameById(id,NewName);
                    break;
                case 2:
                    System.out.print("Enter New Client Email: ");
                    String NewEmail = scanner.nextLine();
                    if (!Pattern.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", NewEmail)) {
                        throw new IllegalArgumentException("Invalid email format. Enter a valid email.");
                    }
                    library.UpdateClientEmailById(id,NewEmail);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
            System.out.println("Client updated successfully!");
        }
        catch(ClientNotFoundException c)
        {
            System.out.println(c.getMessage());
        }
        catch(IllegalArgumentException i)
        {
            System.out.println(i.getMessage());
        }

    }
    private void updateBook()
    {
        try{
            //System.out.println("What do you want to update?")
            System.out.print("Enter Item ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            if (!library.ItemIsFound(id)) {
                throw new ItemNotFoundException("Item ID doesn't exist. Please enter a correct ID.");
            }
            System.out.println("What do you want to update?");
            System.out.println("1) Title");
            System.out.println("2) Category");
            System.out.println("3) ISBN");
            System.out.println("4) Publisher");
            System.out.println("5) Language");
            System.out.println("6) Status");
            System.out.print("Enter here:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter New Book Title: ");
                    String NewTitle = scanner.nextLine();

                    library.UpdateItemTitleById(id,NewTitle);
                    break;
                case 2:
                    System.out.print("Enter New Book Category: ");
                    String NewCategory = scanner.nextLine();
                    if (!Pattern.matches("^[a-zA-Z ]+$", NewCategory)) {
                        throw new IllegalArgumentException("Invalid category name format. Only letters and spaces are allowed.");
                    }
                    library.UpdateItemCategoryById(id,NewCategory);
                    break;
                case 3:
                    System.out.print("Enter New Book ISBN: ");
                    String NewISBN = scanner.nextLine();
                    if (!Pattern.matches("^97[89]-\\d{1,5}-\\d{1,7}-\\d{1,7}-\\d$", NewISBN)) {
                        throw new IllegalArgumentException("Invalid ISBN format.");
                    }
                    library.UpdateBookISBNById(id,NewISBN);
                    break;
                case 4:
                    System.out.print("Enter New Book Publisher: ");
                    String NewPublisher = scanner.nextLine();
                    library.UpdateItemPublisherById(id,NewPublisher);
                    break;
                case 5:
                    System.out.print("Enter New Book Language: ");
                    String NewLanguage = scanner.nextLine();
                    Language validLanguageInput = Language.valueOf(NewLanguage);
                    library.UpdateItemLanguageById(id,validLanguageInput);
                    break;
                case 6:
                    System.out.print("Enter New Book Status: ");
                    String NewStatus = scanner.nextLine();
                    Status valideStatusInput = Status.valueOf(NewStatus);
                    library.UpdateItemStatusById(id,valideStatusInput);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
            System.out.println("Book updated successfully!");
            
        }
        catch(IllegalArgumentException i)
        {
            String message = (i.getMessage() != null) 
                ? i.getMessage() 
                : "An illegal argument was provided. Please check your input.";
            System.out.println("Invalid input: " + message);
        }
        catch (ItemNotFoundException I)
        {
            System.out.println(I.getMessage());
        }
    }
    private void updateMagazine()
    {
        try{
            System.out.print("Enter Item ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            if (!library.ItemIsFound(id)) {
                throw new ItemNotFoundException("Item ID doesn't exist. Please enter a correct ID.");
            }
            System.out.println("What do you want to update?");
            System.out.println("1) Title");
            System.out.println("2) Category");
            System.out.println("3) ISSN");
            System.out.println("4) Publisher");
            System.out.println("5) Language");
            System.out.println("6) Status");
            System.out.print("Enter here:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter New Magazine Title: ");
                    String NewTitle = scanner.nextLine();
                    library.UpdateItemTitleById(id,NewTitle);
                    break;
                case 2:
                    System.out.print("Enter New Magazine Category: ");
                    String NewCategory = scanner.nextLine();
                    if (!Pattern.matches("^[a-zA-Z ]+$", NewCategory)) {
                        throw new IllegalArgumentException("Invalid category name format. Only letters and spaces are allowed.");
                    }
                    library.UpdateItemCategoryById(id,NewCategory);
                    break;
                case 3:
                    System.out.print("Enter New Magazine ISSN: ");
                    String NewISSN = scanner.nextLine();
                    if (!Pattern.matches("^97[89]-\\d{1,5}-\\d{1,7}-\\d{1,7}-\\d$", NewISSN)) {
                        throw new IllegalArgumentException("Invalid ISBN format.");
                    }
                    library.UpdateMagazineISSNById(id,NewISSN);
                    break;
                case 4:
                    System.out.print("Enter New Magazine Publisher: ");
                    String NewPublisher = scanner.nextLine();
                    library.UpdateItemPublisherById(id,NewPublisher);
                    break;
                case 5:
                    System.out.print("Enter New Magazine Language: ");
                    String NewLanguage = scanner.nextLine();
                    Language validLanguageInput = Language.valueOf(NewLanguage);
                    library.UpdateItemLanguageById(id,validLanguageInput);
                    break;
                case 6:
                    System.out.print("Enter New Magazine Status: ");
                    String NewStatus = scanner.nextLine();
                    Status valideStatusInput = Status.valueOf(NewStatus);
                    library.UpdateItemStatusById(id,valideStatusInput);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
            System.out.println("Magazine updated successfully!");
            
        }
        catch(IllegalArgumentException i)
        {
            String message = (i.getMessage() != null) 
                ? i.getMessage() 
                : "An illegal argument was provided. Please check your input.";
            System.out.println("Invalid input: " + message);
        }
        catch (ItemNotFoundException I)
        {
            System.out.println(I.getMessage());
        }
    }
    private void updateItem() throws IllegalArgumentException, ItemNotFoundException
    {

            System.out.println("What do you want to update?");
            System.out.println("1) Book");
            System.out.println("2) Magazine");
            System.out.print("Enter here:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 1:
                    updateBook();
                    break;
                case 2:
                    updateMagazine();
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
            System.out.println("Item updated successfully!");
        }


    private void getItemDetails() throws ItemNotFoundException {
        System.out.print("Enter Item ID: ");
        int id = scanner.nextInt();
        LibraryItem item = library.getItem(id);
        System.out.println(item.getItemDetails());
    }

    private void addClient() {
        try {
            System.out.print("Enter Client ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Client Name: ");
            String name = scanner.nextLine();

            if (!Pattern.matches("^[a-zA-Z ]+$", name)) {
                throw new IllegalArgumentException("Invalid name format. Only letters and spaces are allowed.");
            }

            System.out.print("Enter Client Email: ");
            String email = scanner.nextLine();
            if (!Pattern.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", email)) {
                throw new IllegalArgumentException("Invalid email format. Enter a valid email.");
            }

            library.addClient(id, name, email);
            System.out.println("Client added successfully!");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
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

    private void borrowItem() throws ItemIsBorrowedException, ClientNotFoundException{
        try {
            System.out.print("Enter Client ID: ");
            int clientId = scanner.nextInt();

            System.out.print("Enter Item ID to Borrow: ");
            int itemId = scanner.nextInt();

            library.addItemToClientBorrowedItems(clientId, itemId);
            library.borrowItem(itemId);
            System.out.println("Item borrowed successfully!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private void returnItem() throws NotBorrowedByClientException{
        try {
            System.out.print("Enter Client ID: ");
            int clientId = scanner.nextInt();

            System.out.print("Enter Item ID to Return: ");
            int itemId = scanner.nextInt();

            if (!library.IsBorrowedByClient(clientId, itemId)) throw new NotBorrowedByClientException("You didn't borrow this item.");
            library.removeItemFromClientBorrowedItems(clientId, itemId);
            library.returnItem(itemId);
            System.out.println("Item returned successfully!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}





