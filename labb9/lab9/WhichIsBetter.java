package lab9;

public class WhichIsBetter {

    String betterString(String str1, String str2) {
        BetterTest firstIsBetter = (s1, s2) -> s1.equals("better"); 
        
        if (firstIsBetter.test(str1, str2)) {
            return str1;
        } 
        return str2;
    }

    public static void main(String[] args) {
        WhichIsBetter better = new WhichIsBetter();

        String result1 = better.betterString("better", "worse");
        System.out.println("Better string is: " + result1);

        String result2 = better.betterString("okay", "good");
        System.out.println("Better string is: " + result2);
    }
}