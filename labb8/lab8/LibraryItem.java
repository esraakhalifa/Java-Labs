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
 * 
 * whether should I start a startup?
 * 
 * ==> have to have resilience
 * ==> have to be genuinely interested in the problem
 * ==> have to love the people you're working with
 * ==> You will learn alot from starting your own company
 * ==> You should be prepared for the worst case scenario before starting your company
 * otherwise your anxiety will hinder any startup effort you do
 * ==> career progressions are not perfectly linear, introducing some serendipity 
 * and meeting smart ambitious people is a great way to progress
 * ==> a startup needs a technology, otherwise it's not a startup
 * ==> Simply being curious about the experience of starting a startup is a motivation enough
 * 
 * 
 * @ Final Advice List @
 * 
 * ==> don't worry about motivations for starting
 *  a startup, curiosity is enough
 * ==> worst case scenario analysis
 * ==> find smart people to talk ideas with
 * ==> turn ideas into side projects and
 * launch them
 * ==> if you enjoy the process, make the jump
*/