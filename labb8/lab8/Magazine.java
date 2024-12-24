package lab8;

class Magazine extends LibraryItem
{
    String ISSN;
    Magazine(String Title, Integer Id, String Category, String ISSN, String Publisher, Language language)
    {
        this.Title = Title;
        this.Id = Id;
        this.Category = Category;
        this.ISSN = ISSN;
        this.Publisher = Publisher;
        this.language = language;
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

}