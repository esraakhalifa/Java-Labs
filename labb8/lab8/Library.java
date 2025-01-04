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
    public void borrowItem(int ItemId) throws ItemIsBorrowedException
    {

        for (LibraryItem item : libraryItems)
        {
            if (item.Id == ItemId)
            {
                if(item.status == Status.AVAILBLE) item.changeItemSatus();
                else 
                {
                    throw new ItemIsBorrowedException("Item is already borrowed.");
                }
            }
        }
    }
    public void returnItem(int ItemId)
    {
        
        for (LibraryItem item : libraryItems)
        {
            if (item.Id == ItemId)
            {
                if(item.status == Status.BORROWED) item.changeItemSatus();
                else return;
            }
        }
    }

    public void UpdateItemTitleById(int ItemId, String Title) throws ItemNotFoundException
    {

        LibraryItem ItemToBeUpdated = getItem(ItemId);
        ItemToBeUpdated.setItemTitle(Title);

    }
    public void UpdateItemCategoryById(int ItemId, String Category) throws ItemNotFoundException
    {

        LibraryItem ItemToBeUpdated = getItem(ItemId);
        ItemToBeUpdated.setItemCategory(Category);

    }
    public void UpdateItemPublisherById(int ItemId, String Publisher) throws ItemNotFoundException
    {

        LibraryItem ItemToBeUpdated = getItem(ItemId);
        ItemToBeUpdated.setItemPublisher(Publisher);

    }
    public void UpdateItemLanguageById(int ItemId, Language language) throws ItemNotFoundException
    {

        LibraryItem ItemToBeUpdated = getItem(ItemId);
        ItemToBeUpdated.setItemLanguage(language);

    }
    public void UpdateClientNameById(int ClientId, String name) throws ClientNotFoundException
    {

        Client ClientToBeUpdated = getClient(ClientId);
        ClientToBeUpdated.setName(name);

    }
    public void UpdateClientEmailById(int ClientId, String Email) throws ClientNotFoundException
    {

        Client ClientToBeUpdated = getClient(ClientId);
        ClientToBeUpdated.setEmail(Email);

    }
    public void UpdateItemStatusById(int ItemId, Status status) throws ItemNotFoundException
    {

        LibraryItem ItemToBeUpdated = getItem(ItemId);
        ItemToBeUpdated.setItemStatus(status);

    }
    public void UpdateBookISBNById(int BookId, String ISBN) throws ItemNotFoundException
    {

        LibraryItem ItemToBeUpdated = getItem(BookId);
        Book BookToBeUpdated = (Book) ItemToBeUpdated;
        BookToBeUpdated.setItemISBN(ISBN);

    }
    public void UpdateMagazineISSNById(int MagazineId, String ISSN) throws ItemNotFoundException
    {

        LibraryItem ItemToBeUpdated = getItem(MagazineId);
        Magazine MagazineToBeUpdated = (Magazine) ItemToBeUpdated;
        MagazineToBeUpdated.setItemISSN(ISSN);

    }
    public void addItemToClientBorrowedItems(int ClientId, int ItemId) throws ItemNotFoundException, ClientNotFoundException
    {
        LibraryItem borrowedItem = getItem(ItemId);
        for (Client client : clients)
        {
            if (client.Id == ClientId)
            {
                client.ClientBorrowItem(borrowedItem);
            } 
            else throw new ClientNotFoundException("Client is not found.");
        }
    }
    public boolean IsBorrowedByClient(int ClientId, int ItemId) throws ClientNotFoundException
    {
        Client client = getClient(ClientId);
        LibraryItem TargetItem  = client.borrowedItems.stream().
        filter(borrowedItem -> borrowedItem.Id == ItemId)
        .findFirst().orElse(null);
        if (TargetItem != null)
        {
            return true;
        }
        return false;
    }
    public void removeItemFromClientBorrowedItems(int ClientId, int ItemId) throws ItemNotFoundException
    {
        LibraryItem borrowedItem = getItem(ItemId);

        for (Client client : clients)
        {
            if (client.Id == ClientId)
            {
                client.ClientReturnItem(borrowedItem);
            } 
        }
    }

}