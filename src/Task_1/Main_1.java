package Task_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_1 {

    public static void main(String[] args){
        String numberStr;
        Scanner in = new Scanner(System.in);
        while(true){

            System.out.println("Введите целое число(-1 - выход): ");

            numberStr=in.next();
            if(numberStr=="-1")break;
            if(!IsCorrectNumber(numberStr)) continue;
            Number number = new Number(Integer.parseInt(numberStr));
            System.out.println("Чётное/Нечётное: "+(number.IsEven()?"Чётное":"Нечётное"));
            System.out.println("Простое/Составное: "+(number.getNumber()!=0?(number.IsPrime()?"Простое":"Составное"):"0 не простое и не составное"));
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
