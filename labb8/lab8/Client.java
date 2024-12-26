package lab8;
import java.util.ArrayList;
import java.util.List;
public class Client
{
    int Id;
    String Name;
    String Email;
    List<LibraryItem> borrowedItems = new ArrayList<>(); 

    Client(int Id, String Name, String Email)
    {
        this.Id = Id;
        this.Name = Name;
        this.Email = Email;
    }

    

    private int getId() {return Id;}
    private String getName() {return Name;}
    private String getEmail() {return Email;}
    public String getClientDetails()
    {
        String clientDetails = "Client ID: " + this.getId() + ", Client Name: " + this.getName() + ", Client Email: " + this.getEmail();
        return clientDetails;
    } 
    public void borrowItem(LibraryItem libraryItem)
    {
        borrowedItems.add(libraryItem);
    } 
    public void ReturnItem(LibraryItem libraryItem)
    {
        borrowedItems.remove(libraryItem);
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
    public void setEmail(String Email)
    {
        this.Email = Email;
    }


}
//borrowItem(userId, itemId): Allows a client to borrow an item.

//returnItem(itemId, userId): Allows a client to return an item.

// l libraryitem teb2a unique ==> 
// lamma l user yeb2a 3ayez y-retrieve 
// status for ==> l item teb2a ma3 client wa7ed bas at a time
// l client ye3raf y-update l item details, y-update ay 7aga ella l id