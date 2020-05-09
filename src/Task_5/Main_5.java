package Task_5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_5 {

    public static void main(String[] args){
        System.out.println("Введите N(не больше 100): ");
        Scanner in = new Scanner(System.in);
        String Nt=in.next();
        if(!IsCorrectNumber(Nt)) return;
        if(Nt.length()>=3&&!Nt.equals("100")){
            System.out.println("Число больше 100");
            return;
        }
        int N=Integer.parseInt(Nt);
        for (int number:Palindromes.GetPalindromes(N)
        ) {
            System.out.println(number);
        }
    }

    private static boolean IsCorrectNumber(String number){
        Pattern pattern = Pattern.compile("\\D");
        Matcher matcher = pattern.matcher(number);
        if(matcher.find()){
            System.out.println("Введено не число");
            return false;
        }
        if(number.contains(".")||number.contains(",")){
            System.out.println("Введено не целое число");
            return false;
        }
        return true;
    }
}
