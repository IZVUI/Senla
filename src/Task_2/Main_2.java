package Task_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_2 {

    public static void main(String[] args){
        String firstNumber,secondNumber;
        Scanner in = new Scanner(System.in);
        while (true){

            System.out.println("Введите первое целое число(-1 - выход): ");

            firstNumber=in.next();
            if(firstNumber=="-1")break;
            if(!IsCorrectNumber(firstNumber)) return;
            System.out.println("Введите второе целое число(-1 - выход): ");
            secondNumber=in.next();
            if(secondNumber=="-1")break;
            if(!IsCorrectNumber(secondNumber)) return;
            int nok=NOK.Result(Integer.parseInt(firstNumber),Integer.parseInt(secondNumber));
            System.out.println("НОК: "+nok);
            System.out.println("НОД: "+ NOD.Result(nok,Integer.parseInt(firstNumber),Integer.parseInt(secondNumber)));
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
