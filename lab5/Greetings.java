package lab5;
class Greetings
{
	private String createHelloMessage(String Name) throws InvalidNameException
	{
		String message;
		if (Name != "Esraa Khalifa") throw new InvalidNameException("Name is not Esraa Khalifa.");
		else 
		{
			message = "Hello, " + Name + ".";
		}
		return message;
		
	}
	private String createMorningMessage(String Name) throws InvalidNameException
	{
		String message;
		if (Name != "Esraa Khalifa") throw new InvalidNameException("Name is not Esraa Khalifa.");
		else 
		{
			message = "Good morning, " + Name + ".";
		}
		return message;
		
	}
	private String createNightMessage(String Name) throws InvalidNameException
	{
		String message;
		if (Name != "Esraa Khalifa") throw new InvalidNameException("Name is not Esraa Khalifa.");
		else 
		{
			message = "Good night, " + Name + ".";
		}
		return message;
		
	}
	public String getHelloMessage(String Name) throws InvalidNameException
	{
		
		String message = createHelloMessage(Name);
		return message;
		
	}
	public String getMorningMessage(String Name) throws InvalidNameException
	{
		String message = createMorningMessage(Name);
		return message;
		
	}
	public String getNightMessage(String Name) throws InvalidNameException
	{
		String message = createNightMessage(Name);
		return message;
		
	}
}