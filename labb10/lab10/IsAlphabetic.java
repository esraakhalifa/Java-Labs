package lab10;

public class IsAlphabetic
{
    static boolean isAlpha(String str) // OneStrinOperation
    {
        boolean flag = true;
        for (int i = 0; i < str.length(); i++)
        {
            if (!(Character.isLetter(str.charAt(i)))) return false;
        }
        return flag;
    }
    public static void main(String[] args) {

        OneStrinOperation isAlphabeticOperation = IsAlphabetic::isAlpha;

        String str1 = "agewluwa";
        String str2 = "5667733";
        String str3 = "hsgi7c4w3";
        String [] strings = {str1, str2, str3};
        for (String str : strings)
        {
            if (isAlphabeticOperation.operate(str)) System.out.println("String contains only alphabet.");
            else System.out.println("String does not only contain alphabet.");
        }
    }
}