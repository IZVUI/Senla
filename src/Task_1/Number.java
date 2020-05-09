package Task_1;

public class Number {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Number(int number)
    {
        this.setNumber(number);
    }

    public boolean IsEven(){
        return number%2==0;
    }

    public boolean IsOdd(){
        return !this.IsEven();
    }

    public boolean IsPrime(){
        if(number<1) return false;
        for (int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0)return false;
        }
        return true;
    }

    public boolean IsComposite(){
        return number>1?!IsPrime():false;
    }
}
