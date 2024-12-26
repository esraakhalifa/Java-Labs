package lab8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
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
    public void addBook(String Title, Integer Id, String Category, String ISBN, String Publisher, Language language, Status status)
    {
        if (ItemIsFound(Id)) return;
        Book book = new Book(Title, Id, Category, ISBN, Publisher, language, status);
        this.addItem((T)book);
    }
    public void addMagazine(String Title, Integer Id, String Category, String ISSN, String Publisher, Language language, Status status)
    {
        Magazine magazine = new Magazine(Title, Id, Category, ISSN, Publisher, language, status);
        this.addItem((T)magazine);
    }
    public LibraryItem getItem(int Id) throws ItemNotFoundException
    {
        LibraryItem requestedItem = libraryItems.stream().filter(item -> item.Id == Id).findFirst().orElse(null);
        if (requestedItem == null) throw new ItemNotFoundException("Item " + Id + " not found.");
        return requestedItem;
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
        Client requestedClient = clients.stream().filter(client -> client.Id == Id).findFirst().orElse(null);
        if (requestedClient == null) throw new ClientNotFoundException("Client " + Id + " not found.");
        return requestedClient;

    }
    public void displayClients() 
    {
        for(Client client : clients)
        {
            String message = client.getClientDetails();
            System.out.println(message);
        }
    }
    public boolean ItemIsFound(int Id)
    {
        //LibraryItem item = null;
        for (LibraryItem item : libraryItems)
        {
            if (item.Id == Id) return true;
        }
    
        return false;
    }
    public boolean ClientIsFound(int Id)
    {
        for (Client client : clients)
        {
            if (client.Id == Id) return true;
        }
        return false;
    }
    public void BorrowOrReturnItem(int ItemId)
    {
        for (LibraryItem item : libraryItems)
        {
            if (item.Id == ItemId)
            {
                item.changeItemSatus();
            }
        }
    }
    //public void UpdateItem
   /* public LibraryItem getBorrowedItem(int ItemId)
    {
        LibraryItem borrowedItem = null;
        for (LibraryItem item : libraryItems)
        {
            if (item.Id == ItemId)
            {
                borrowedItem = item;
            }
        }
        return borrowedItem;
    }*/
   /**
    *String Title; @DONEE
    Integer Id;
    String Category; @DONEE
    String Publisher; @DONEE
    Language language;  @DONEE
    Status status;  @DONEE
    */
    public void UpdateItemTitleById(int ItemId, String Title) throws ItemNotFoundException
    {
        //if(cho)
        LibraryItem ItemToBeUpdated = getItem(ItemId);
        ItemToBeUpdated.setItemTitle(Title);

    }
    public void UpdateItemCategoryById(int ItemId, String Category) throws ItemNotFoundException
    {
        //if(cho)
        LibraryItem ItemToBeUpdated = getItem(ItemId);
        ItemToBeUpdated.setItemCategory(Category);

    }
    public void UpdateItemPublisherById(int ItemId, String Publisher) throws ItemNotFoundException
    {
        //if(cho)
        LibraryItem ItemToBeUpdated = getItem(ItemId);
        ItemToBeUpdated.setItemPublisher(Publisher);

    }
    public void UpdateItemLanguageById(int ItemId, Language language) throws ItemNotFoundException
    {
        //if(cho)
        LibraryItem ItemToBeUpdated = getItem(ItemId);
        ItemToBeUpdated.setItemLanguage(language);

    }
    public void UpdateClientNameById(int ClientId, String name) throws ClientNotFoundException
    {
        //if(cho)
        Client ClientToBeUpdated = getClient(ClientId);
        ClientToBeUpdated.setName(name);

    }
    public void UpdateClientEmailById(int ClientId, String Email) throws ClientNotFoundException
    {
        //if(cho)
        Client ClientToBeUpdated = getClient(ClientId);
        ClientToBeUpdated.setEmail(Email);

    }
    public void UpdateItemStatusById(int ItemId, Status status) throws ItemNotFoundException
    {
        //if(cho)
        LibraryItem ItemToBeUpdated = getItem(ItemId);
        ItemToBeUpdated.setItemStatus(status);

    }
    public void addItemToClientBorrowedItems(int ClientId, int ItemId) throws ItemNotFoundException
    {
        LibraryItem borrowedItem = getItem(ItemId);
        //if (ChosenItem == null) throw new ItemNotFoundException("Item with ID " + Id + " not found.");
        for (Client client : clients)
        {
            if (client.Id == ClientId)
            {
                client.borrowItem(borrowedItem);
            } 
        }
    }
    public void removeItemFromClientBorrowedItems(int ClientId, int ItemId) throws ItemNotFoundException
    {
        LibraryItem borrowedItem = getItem(ItemId);
        //if (ChosenItem == null) throw new ItemNotFoundException("Item with ID " + Id + " not found.");
        for (Client client : clients)
        {
            if (client.Id == ClientId)
            {
                client.ReturnItem(borrowedItem);
            } 
        }
    }

}