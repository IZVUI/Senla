package Task_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    private  String sentence;

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public Sentence(String sentence){
        this.sentence=sentence;
    }

    public int AmountOfTheWord(String word){
        String sentence = this.sentence.toLowerCase();
        Pattern pattern= Pattern.compile("\\b"+word+"\\b");
        Matcher matcher=pattern.matcher(sentence);
        int amount=0;
        while (matcher.find()) amount++;
        return amount;
    }
}
