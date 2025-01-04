import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

class SimpleDictionary
{
    Map<Character, Set<String>> simpleDictionary = new HashMap<>();
    
    public void setSimpleDictionary(Map<Character, Set<String>> simpleDictionary) {
        this.simpleDictionary = simpleDictionary;
    }

    public void printDictionary()
    {
        simpleDictionary.forEach((key,value)-> System.out.println(key +": " + value));
        
    }
    public void printLetterWords(char letter)
    {
        System.out.println(letter + ": " + simpleDictionary.get(letter));
    }

    public static void main (String[] args)
    {
        SimpleDictionary simpleDictionary = new SimpleDictionary();
        for (char letter = 'a'; letter <= 'z'; letter++)
        {
            simpleDictionary.simpleDictionary.put(letter,null);
        }
        Set<String> LetterAWords = new HashSet<String>();
        LetterAWords.add("apple");
        LetterAWords.add("arrogant");
        LetterAWords.add("absorb");
        LetterAWords.add("annotate");
        LetterAWords.add("allocate");
        LetterAWords.add("attend");
        LetterAWords.add("append");
        LetterAWords.add("anticipate");
        LetterAWords.add("alligator");
        simpleDictionary.simpleDictionary.put('a', LetterAWords);

        Set<String> LetterBWords = new HashSet<String>();
        LetterBWords.add("ball");
        LetterBWords.add("breeze");
        LetterBWords.add("balance");
        LetterBWords.add("bargain");
        LetterBWords.add("bubble");
        simpleDictionary.simpleDictionary.put('b', LetterBWords);
        
        Set<String> LetterCWords = new HashSet<String>();
        LetterCWords.add("cat");
        LetterCWords.add("charm");
        LetterCWords.add("calculate");
        LetterCWords.add("compare");
        LetterCWords.add("conquer");
        simpleDictionary.simpleDictionary.put('c', LetterCWords);

        Set<String> LetterDWords = new HashSet<String>();
        LetterDWords.add("dance");
        LetterDWords.add("deliver");
        LetterDWords.add("demand");
        LetterDWords.add("devote");
        LetterDWords.add("define");
        simpleDictionary.simpleDictionary.put('d', LetterDWords);

        Set<String> LetterEWords = new HashSet<String>();
        LetterEWords.add("eagle");
        LetterEWords.add("embrace");
        LetterEWords.add("enrich");
        LetterEWords.add("expand");
        LetterEWords.add("explore");
        simpleDictionary.simpleDictionary.put('e', LetterEWords);

        Set<String> LetterFWords = new HashSet<String>();
        LetterFWords.add("fabric");
        LetterFWords.add("fascinate");
        LetterFWords.add("feature");
        LetterFWords.add("focus");
        LetterFWords.add("fulfill");
        simpleDictionary.simpleDictionary.put('f', LetterFWords);

        Set<String> LetterGWords = new HashSet<String>();
        LetterGWords.add("gather");
        LetterGWords.add("generate");
        LetterGWords.add("glimmer");
        LetterGWords.add("govern");
        LetterGWords.add("guide");
        simpleDictionary.simpleDictionary.put('g', LetterGWords);

        Set<String> LetterHWords = new HashSet<String>();
        LetterHWords.add("harmony");
        LetterHWords.add("hasten");
        LetterHWords.add("highlight");
        LetterHWords.add("honor");
        LetterHWords.add("humble");
        simpleDictionary.simpleDictionary.put('h', LetterHWords);

        Set<String> LetterIWords = new HashSet<String>();
        LetterIWords.add("ignite");
        LetterIWords.add("illustrate");
        LetterIWords.add("imagine");
        LetterIWords.add("improve");
        LetterIWords.add("inspire");
        simpleDictionary.simpleDictionary.put('i', LetterIWords);
         
        Set<String> LetterJWords = new HashSet<>();
        LetterJWords.add("jacket");
        LetterJWords.add("juggle");
        LetterJWords.add("jungle");
        LetterJWords.add("justify");
        LetterJWords.add("jump");
        simpleDictionary.simpleDictionary.put('j', LetterJWords);

      
        Set<String> LetterKWords = new HashSet<>();
        LetterKWords.add("kite");
        LetterKWords.add("king");
        LetterKWords.add("kindle");
        LetterKWords.add("kneel");
        LetterKWords.add("knock");
        simpleDictionary.simpleDictionary.put('k', LetterKWords);

        Set<String> LetterLWords = new HashSet<>();
        LetterLWords.add("lamp");
        LetterLWords.add("language");
        LetterLWords.add("launch");
        LetterLWords.add("leap");
        LetterLWords.add("logic");
        simpleDictionary.simpleDictionary.put('l', LetterLWords);

      
        Set<String> LetterMWords = new HashSet<>();
        LetterMWords.add("magic");
        LetterMWords.add("manage");
        LetterMWords.add("marvel");
        LetterMWords.add("merge");
        LetterMWords.add("motion");
        simpleDictionary.simpleDictionary.put('m', LetterMWords);

     
        Set<String> LetterNWords = new HashSet<>();
        LetterNWords.add("narrow");
        LetterNWords.add("navigate");
        LetterNWords.add("negotiate");
        LetterNWords.add("nurture");
        LetterNWords.add("notice");
        simpleDictionary.simpleDictionary.put('n', LetterNWords);

     
        Set<String> LetterOWords = new HashSet<>();
        LetterOWords.add("observe");
        LetterOWords.add("obtain");
        LetterOWords.add("occupy");
        LetterOWords.add("offer");
        LetterOWords.add("optimize");
        simpleDictionary.simpleDictionary.put('o', LetterOWords);

      
        Set<String> LetterPWords = new HashSet<>();
        LetterPWords.add("paint");
        LetterPWords.add("perform");
        LetterPWords.add("pioneer");
        LetterPWords.add("plan");
        LetterPWords.add("protect");
        simpleDictionary.simpleDictionary.put('p', LetterPWords);

      
        Set<String> LetterQWords = new HashSet<>();
        LetterQWords.add("quality");
        LetterQWords.add("quantify");
        LetterQWords.add("question");
        LetterQWords.add("queue");
        LetterQWords.add("quote");
        simpleDictionary.simpleDictionary.put('q', LetterQWords);

        
        Set<String> LetterRWords = new HashSet<>();
        LetterRWords.add("rapid");
        LetterRWords.add("rebuild");
        LetterRWords.add("reflect");
        LetterRWords.add("reveal");
        LetterRWords.add("rise");
        simpleDictionary.simpleDictionary.put('r', LetterRWords);

      
        Set<String> LetterSWords = new HashSet<>();
        LetterSWords.add("satisfy");
        LetterSWords.add("scatter");
        LetterSWords.add("secure");
        LetterSWords.add("simplify");
        LetterSWords.add("spark");
        simpleDictionary.simpleDictionary.put('s', LetterSWords);

        
        Set<String> LetterTWords = new HashSet<>();
        LetterTWords.add("target");
        LetterTWords.add("teach");
        LetterTWords.add("transform");
        LetterTWords.add("trust");
        LetterTWords.add("turn");
        simpleDictionary.simpleDictionary.put('t', LetterTWords);

    
        Set<String> LetterUWords = new HashSet<>();
        LetterUWords.add("understand");
        LetterUWords.add("unite");
        LetterUWords.add("update");
        LetterUWords.add("uplift");
        LetterUWords.add("utilize");
        simpleDictionary.simpleDictionary.put('u', LetterUWords);

        Set<String> LetterVWords = new HashSet<>();
        LetterVWords.add("validate");
        LetterVWords.add("value");
        LetterVWords.add("venture");
        LetterVWords.add("vibrate");
        LetterVWords.add("vision");
        simpleDictionary.simpleDictionary.put('v', LetterVWords);

      
        Set<String> LetterWWords = new HashSet<>();
        LetterWWords.add("wander");
        LetterWWords.add("warmth");
        LetterWWords.add("watch");
        LetterWWords.add("welcome");
        LetterWWords.add("wonder");
        simpleDictionary.simpleDictionary.put('w', LetterWWords);

        
        Set<String> LetterXWords = new HashSet<>();
        LetterXWords.add("xenon");
        LetterXWords.add("xerox");
        LetterXWords.add("xylophone");
        LetterXWords.add("xenophobia");
        LetterXWords.add("x-ray");
        simpleDictionary.simpleDictionary.put('x', LetterXWords);

        
        Set<String> LetterYWords = new HashSet<>();
        LetterYWords.add("yacht");
        LetterYWords.add("yearn");
        LetterYWords.add("yield");
        LetterYWords.add("youth");
        LetterYWords.add("yawn");
        simpleDictionary.simpleDictionary.put('y', LetterYWords);

        
        Set<String> LetterZWords = new HashSet<>();
        LetterZWords.add("zebra");
        LetterZWords.add("zinc");
        LetterZWords.add("zone");
        LetterZWords.add("zest");
        LetterZWords.add("zeal");
        simpleDictionary.simpleDictionary.put('z', LetterZWords);

        simpleDictionary.printDictionary();
        simpleDictionary.printLetterWords('z');
        simpleDictionary.printLetterWords('u');
        simpleDictionary.printLetterWords('f');

        
    }

}
