package lab10;

public class IsAlphabetic
{
    boolean isAlpha(String str)
    {
        boolean flag = true;
        for (int i = 0; i < str.length(); i++)
        {
            if (!(Character.isLetter(str.charAt(i)))) return false;
        }
        return flag;
    }
    public static void main(String[] args) {

        IsAlphabetic isAlphabetic = new IsAlphabetic();
        String str1 = "agewluwa";
        String str2 = "5667733";
        String str3 = "hsgi7c4w3";
        String [] strings = {str1, str2, str3};
        for (String str : strings)
        {
            if (isAlphabetic.isAlpha(str)) System.out.println("String contains only alphabet.");
            else System.out.println("String does not only contain alphabet.");
        }
    }
}