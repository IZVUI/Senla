package Task_2;

public class NOK {
    public static int Result(int number1,int number2)
    {
        int NOK;
        if(number2>number1)
        {
            int buf = number1;
            number1 = number2;
            number2 = buf;
        }
        if(number1%number2==0)
        {
            return number1;
        }
        NOK = 2*number1;
        while (NOK%number2!=0)
        {
            NOK+=number1;
        }
        return NOK;
    }
}
