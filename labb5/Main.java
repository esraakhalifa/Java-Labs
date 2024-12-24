import lab5.*;
class Main
{
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            Greetings greetings= new Greetings();
            String Name2 = null;
            greetings.getMorningMessage(Name2);
            String Name = "Monalisa";
            
            greetings.getHelloMessage(Name);

            String Name3 = "";
            greetings.getNightMessage(Name3);
        }
        catch (InvalidNameException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
        catch (NullPointerException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
        catch (NumberFormatException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
        finally
        {
            System.out.println("Program has ended.");
        }
    }
}