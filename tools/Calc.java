package tools;

public class Calc {
    
    private int num1;
    private int num2;

    public Calc(){
        this(1,1);
    }

    public Calc(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add(){
        return this.num1 + this.num2;
    }
}
