package Task_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;

public class Sentence {
    private ArrayList<String> words;
    private  String sentence;

    public ArrayList<String> getWords() {
        return words;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence; SplitOnWords();
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }

    public Sentence(String sentence){
        this.sentence=sentence;
        SplitOnWords();
    }

    private void SplitOnWords(){
        String[] words=sentence.split("[^\\wА-Яа-я]");
        this.words=new ArrayList<String>();
        for (String word:words
             ) {
                    if(word.length()==0) continue;
                    word=word.substring(0,1).toUpperCase()+word.substring(1);
                    this.words.add(word);
        }
        this.words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public int WordsAmount(){
        return getWords().size();
    }
}
