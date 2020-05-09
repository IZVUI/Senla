package Task_4;



import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args){
        System.out.println("Введите предложение: ");
        Scanner in = new Scanner(System.in);
        Sentence sentence=new Sentence(in.nextLine());
        System.out.println("Введите слово: ");
        String word = in.next();
        System.out.println("Количество слов \""+word+"\" в предложении: "+sentence.AmountOfTheWord(word));
    }
}
