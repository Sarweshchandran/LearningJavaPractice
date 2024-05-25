import java.util.Scanner;

public class Compare {
    public static void main(String args[]){
        int a,b,c,d;
        System.out.println("Enter the numbers: \n");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        if(a>b && a>c && a>d){
            System.out.println("The number " + a + " is Greatest number the given numbers."+ b +", "+c+", "+d);
        }
        else if(b>a && b>c && b>d){
            System.out.println("The number " + b + " is Greatest number the given numbers."+ a +", "+c+", "+d);
        }
        else if(c>a && c>b && c>d){
            System.out.println("The number " + c + " is Greatest number the given numbers."+ a +", "+b+", "+d);
        }
        else{
            System.out.println("The number " + d + " is Greatest number the given numbers."+ a +", "+b+", "+c);
        }
    }
}
