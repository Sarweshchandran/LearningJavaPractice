import java.util.Scanner;
//Class declaration for Trailing Zero Factorial
public class trailingFact {
    public static void TrailingZero(int N){
        int res =1 ;
        if(N==0 || N==1){
            System.out.println("The value of  " + N + "! is: "+res);
        }
        else{
            for (int i = 2; i <= N; i++) {
                res = res*i;
            }
            System.out.println("The value of  " + N + "! is: "+res);
        }
        int result = 0;
        while(res%10==0){
            result ++;
            res = res/10;
        }
        System.out.println("The number of trailing zero's for the factorial of the given number is: "+ result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Enter the Number N: ");
        N = sc.nextInt();
        TrailingZero(N);
        sc.close();
    }
}
