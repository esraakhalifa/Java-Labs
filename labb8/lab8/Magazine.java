package lab8;

class Magazine extends LibraryItem
{
    String ISSN;
    Magazine(String Title, Integer Id, String Category, String ISSN, String Publisher, Language language, Status status)
    {
        this.Title = Title;
        this.Id = Id;
        this.Category = Category;
        this.ISSN = ISSN;
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
        ", ISSN: " + this.getISSN() +
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
    String getISSN()
    {
        return ISSN;
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