package lab8;


abstract class LibraryItem
{
    String Title;
    Integer Id;
    String Category;
    String Publisher;
    Language language;

    public abstract String getItemDetails();
    abstract String getItemTitle();
    abstract String getItemCategory();
    abstract String getItemPublisher();
    abstract Language getItemLanguage();
}
/** 
 *     String Title, Integer Id, String Category, String ISSN_or_ISBN, String Publisher, Language language;
*/