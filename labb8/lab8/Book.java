package lab8;

class Book extends LibraryItem
{
    String ISBN;
    Book(String Title, Integer Id, String Category, String ISBN, String Publisher, Language language, Status status)
    {
        this.Title = Title;
        this.Id = Id;
        this.Category = Category;
        this.ISBN = ISBN;
        this.Publisher = Publisher;
        this.language = language;
        this.status = status;
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
    @Override
    Status getItemStatus()
    {
        return status;
    }
    @Override
    void changeItemSatus()
    {
        if (status == Status.AVAILBLE) status = Status.BORROWED;
        else status = Status.AVAILBLE;
    }
    @Override
    public void setItemTitle(String Title)
    {
        this.Title = Title;
    }
    @Override
    public void setItemCategory(String Category)
    {
        this.Category = Category;
    }
    @Override
    public void setItemPublisher(String Publisher)
    {
        this.Publisher = Publisher;
    }
    @Override
    public void setItemLanguage(Language language)
    {
        this.language = language;
    }
    @Override
    public void setItemStatus(Status status)
    {
        this.status = status;
    }

}