package Task_5;

import java.util.ArrayList;

public class Palindromes {
    public static ArrayList<Integer> GetPalindromes(int N){
        ArrayList<Integer> palindromes = new ArrayList<>();
        if(N<10){
            for(int i=0;i<N;i++){
                palindromes.add(i);
            }
            return palindromes;
        }
        for (int i=0;i<10;i++){
            palindromes.add(i);
        }
        for (int i=11;i<=N;i+=11){
            palindromes.add(i);
        }
        return palindromes;
    }
}
