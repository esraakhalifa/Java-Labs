import java.util.regex.*;
class Main {
    public static int countOccurrencesUsingSplit(String str, String word) 
    {
       
        String a[] = str.split("[ .]");

        int count = 0;
        for (int i = 0; i < a.length; i++) 
        {

        if (word.equals(a[i]))
            count++;
        }
     
        return count;
    }
    public static int countOccurrencesUsingIndexOf(String str, String word) 
    {
        int i = 0;
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }
        return count;
    }
	public static int countOccurrencesUsingRegex(String str, String word) {

		Pattern pattern = Pattern.compile("\\b" + Pattern.quote(word) + "\\b");
		Matcher matcher = pattern.matcher(str);

		int count = 0;
		while (matcher.find()) {
			count++;
		}

		return count;
	}

    public static void main(String[] args) {
        String sentence = "This sentence contains the word Java Java Java Java Java.";
        String word = "Java";


        System.out.println("Number of occurrences using indexOf(): " + countOccurrencesUsingIndexOf(sentence, word));
        System.out.println("Number of occurrences using split(): " + countOccurrencesUsingSplit(sentence, word));
        System.out.println("Number of occurrences using regex: " + countOccurrencesUsingRegex(sentence, word));
        
    } 
        
    }