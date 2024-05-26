import java.util.*;

public class factorial {
    static void Factorial(int N) {
        double res = 1;
        if (N == 0 || N == 1) {
            System.out.println("The factorial of the number " + N + "! is:"+ res);
        } else {
            for (double i = 2; i <= N; i++) {
                //System.out.println("Value of the i: " + i);
                res = res*i;
                //res1=res;
                //System.out.println(res + "*" + i + "= " + res);
                //res1 = res * i;
            }
            
            System.out.println("The value of  " + N + "! is: "+res);
           // return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N;
        N = sc.nextInt();
        Factorial(N);
        sc.close();
    }
}
