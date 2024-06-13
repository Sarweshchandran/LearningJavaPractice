package Practice;
class Calc 
{
    public int add(int n1, int n2)
    {
        return (n1+n2);
    }
    /* 
    public void config()
    {
        System.out.println("In a config.");
    }
    */
}

class AdvCalc extends Calc
{
    //Over riding
    public int add(int n1, int n2)
    {
        return(n1+n2+1);
    }
}
public class DemoO {
    public static void main(String[] args) 
    {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(5,5);
        System.out.println(r1);
    }
}
