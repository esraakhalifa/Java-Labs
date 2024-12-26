package lab8;


abstract class LibraryItem
{
    String Title;
    Integer Id;
    String Category;
    String Publisher;
    Language language;
    Status status;

    public abstract String getItemDetails();
    abstract String getItemTitle();
    abstract String getItemCategory();
    abstract String getItemPublisher();
    abstract Language getItemLanguage();
    abstract Status getItemStatus();
    abstract void setItemTitle(String Title);
    abstract void setItemCategory(String Category);
    abstract void setItemPublisher(String Publisher);
    abstract void setItemLanguage(Language language);
    abstract void setItemStatus(Status status);
    abstract void changeItemSatus();
}

/** 
 * borrowItem(userId, itemId): Allows a client to borrow an item.
 * returnItem(itemId, userId): Allows a client to return an item.
 *     String Title, Integer Id, String Category, String ISSN_or_ISBN, String Publisher, Language language;
*/