import java.util.Scanner;

class Array3 {
    protected int[] Arr;
    protected int Sum;

    public void ArrayElements() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        n = sc.nextInt();
        Arr = new int[n];
        System.out.println("Enter the Elements of the Array");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Enter the " + i + " th value of Array:");
            Arr[i] = sc.nextInt();
        }

        System.out.println("The final Array with the size of " + n + " is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}

class Array2 extends Array3{


    public void SumOfArray() {
        Sum = 0;
        for(int i = 0; i < Arr.length; i++){
            Sum += Arr[i];
        }
        System.out.println("The Sum of the Array elements is the : " + Sum);
    }
}

public class ArMain extends Array2{

    public void ArgArr(){
        int avg;
        avg = Sum/Arr.length;
        System.out.println("The of the Array elements is: "+ avg);
    }
   
    public static void main(String[] args) {
        ArMain myObj = new ArMain();
        myObj.ArrayElements();
        myObj.SumOfArray();
        myObj.ArgArr();
    }
}
