package Practice;
public class Calculator 
{
    public int Add(int num1, int num2)
    {

        int result = num1 + num2;
        System.out.println("Result of adding two number "+ num1 +" and " + num2 + " is: "+ result );
        return 0;
    }
    //Method Overloading for 3 numbers
    public int Add(int num1, int num2, int num3)
    {
        int result = num1 + num2 + num3;
        System.out.println("Result of adding three number "+ num1 + ", "+ num2 + " and " + num3 + " is: "+ result);
        return 0;
    }
    //Method Overloading for float numbers
    public float Add(float num1, float num2)
    {
        float result = num1 + num2;
        System.out.println("Result of adding two number "+ num1 +" and " + num2 + " is: "+ result );
        return 0;
    }

    public int Sub(int num1, int num2)
    {
        int result = num1 - num2;
        System.out.println("Result of Subtracting two number " + num1 + " and " + num2 + " is: " + result);
        return 0;
    }

    public int Multiply(int num1, int num2)
    {
        int result = num1 * num2;
        System.out.println("Result of multiplying two number " + num1 + " and " + num2 + " is: " + result);
        return 0;
    }

    public int Divide(int num1, int num2)
    {
        int result = num1 / num2;
        System.out.println("Result of dividing two number " + num1 + " and " + num2 + " is: " + result);
        return 0;
    }
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 5;
        Calculator myObj = new Calculator();
        myObj.Add(num1,num2);
        myObj.Add(5.0f,7.0f);
        myObj.Add(5, 5, 5);
        myObj.Sub(num1, num2);
        myObj.Multiply(num1, num2);
        myObj.Divide(num1, num2);
    }
}