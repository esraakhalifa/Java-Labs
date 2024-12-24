package lab8;

class Book extends LibraryItem
{
    String ISBN;
    Book(String Title, Integer Id, String Category, String ISBN, String Publisher, Language language)
    {
        this.Title = Title;
        this.Id = Id;
        this.Category = Category;
        this.ISBN = ISBN;
        this.Publisher = Publisher;
        this.language = language;
    }
    @Override
    public String getItemDetails()
    {
        String itemDetails;
        itemDetails = "Title: " + this.getItemTitle() + 
        ", Category: " + this.getItemCategory() + 
        ", ISBN: " + this.getISBN() + 
        ", Publisher: " + this.getItemPublisher() + 
        ", Language: " + this.getItemLanguage();
        return itemDetails;
    }
    @Override
    String getItemTitle()
    {
        return Title;
    }
    @Override
    String getItemCategory()
    {
        return Category;
    }

    String getISBN()
    {
        return ISBN;
    }
    @Override
    String getItemPublisher()
    {
        return Publisher;
    }
    @Override
    Language getItemLanguage()
    {
        return language;
    }

}