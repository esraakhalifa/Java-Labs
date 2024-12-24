package lab8;
import java.util.ArrayList;
import java.util.List;
public class Library <T extends LibraryItem>{
    List<LibraryItem> libraryItems = new ArrayList<>();
    List<Client> clients = new ArrayList<>();


    private void addItem(T libraryItem)
    {
        this.libraryItems.add(libraryItem);
    }
    public void removeItem(int Id)
    {
        for(LibraryItem item : libraryItems)
        {
            if(item.Id == Id) this.libraryItems.remove(item);
        }
    }
    public void addBook(String Title, Integer Id, String Category, String ISBN, String Publisher, Language language)
    {
        Book book = new Book(Title, Id, Category, ISBN, Publisher, language);
        this.addItem((T)book);
    }
    public void addMagazine(String Title, Integer Id, String Category, String ISSN, String Publisher, Language language)
    {
        Magazine magazine = new Magazine(Title, Id, Category, ISSN, Publisher, language);
        this.addItem((T)magazine);
    }
    public LibraryItem getItem(int Id) throws ItemNotFoundException
    {
        T ChosenItem = null;
        for(LibraryItem item : libraryItems)
        {
            if(item.Id == Id) return item;
        }
        if (ChosenItem == null) throw new ItemNotFoundException("Item with ID " + Id + " not found.");
        return ChosenItem;
    }
    public void addClient(int Id, String Name,String Email)
    {
        Client client = new Client(Id, Name, Email);
        this.clients.add(client);
    }
    public void removeClient(int Id)
    {
        for(Client client : clients)
        {
            if(client.Id == Id) this.clients.remove(client);
        }   
    }
    public void displayItems()
    {
        for(LibraryItem item : libraryItems)
        {
            String message = item.getItemDetails();
            System.out.println(message);
        }
    }
    public Client getClient(int Id) throws ClientNotFoundException
    {
        Client ChosenClient = null;
        for(Client client : clients)
        {
            if(client.Id == Id) return client;
        }  
        if (ChosenClient == null) throw new ClientNotFoundException("Client with ID " + Id + " not found.");
        return ChosenClient;
    }
    public void displayClients()
    {
        for(Client client : clients)
        {
            String message = client.getClientDetails();
            System.out.println(message);
        }
    }


    /*void remove(int Id)
    {

    }*/

}