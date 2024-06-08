import java.io.*;
import java.util.Scanner;

public class weirdNotweird {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);        

        System.out.println("Enter the value of N: ");

        int N = sc.nextInt();

        if(N%2==0 && N<=5)
        {
            System.out.println("Not Weird");
        }
        else if(N%2==0 && N==6 && N<=20)
        {
            System.out.println("Weird");
        }
        else if(N%2==0 && N>20)
        {
            System.out.println("Not Weird");
        }
        else
        {
            System.out.println("Weird");
        }

        sc.close();
    }
}
