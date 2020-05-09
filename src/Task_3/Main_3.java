package Task_3;

import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args){
        System.out.println("Введите предложение: ");
        Scanner in = new Scanner(System.in);
        Sentence sentence = new Sentence(in.nextLine());
        System.out.println("Количество слов: "+sentence.WordsAmount());
        for (String word: sentence.getWords()
        ) {
            System.out.println(word);
        }
    }

}
