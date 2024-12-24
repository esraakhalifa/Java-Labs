package lab5;
public class Greetings
{
	private String createHelloMessage(String Name) throws InvalidNameException
	{
		String message;
		if (Name != "Esraa Khalifa") throw new InvalidNameException("Name is not Esraa Khalifa.");
		//else if (Name == null) throw new NullPointerException("Name should not be null. Try again.");
		else 
		{
			message = "Hello, " + Name + ".";
		}
		return message;
		
	}
	private String createMorningMessage(String Name) 
	{
		String message;
		
		//if (Name != "Esraa Khalifa") throw new InvalidNameException("Name is not Esraa Khalifa. Try again");
		if (Name==null)
		{
			throw new NullPointerException("Name cannot be null");
		} 
		else 
		{
			message="Good morning, " + Name + ".";
		}
		return message;
		
	}
	private String createNightMessage(String Name) throws NumberFormatException, InvalidNameException
	{
		String message;
		System.out.println("Good Morning, " + Name.length());
		if (Name != "Esraa Khalifa") throw new InvalidNameException("Name is not Esraa Khalifa.");
		//else if (Name == null) throw new NullPointerException("Name should not be null. Try again.");
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
	public String getMorningMessage(String Name) throws NullPointerException
	{
		String message = createMorningMessage(Name);
		return message;
		
	}
	
	public String getNightMessage(String Name) throws NumberFormatException, InvalidNameException
	{
		String message = createNightMessage(Name);
		return message;
		
	}
}