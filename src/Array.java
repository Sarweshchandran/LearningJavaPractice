import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        n = sc.nextInt();
        int[] Arr = new int[n];
        System.out.println("Enter the Elements of the Array");
        for(int i =0;i<Arr.length;i++){
            System.out.println("Enter the " + i + " th value of Array:");
            Arr[i] = sc.nextInt();
        }

        System.out.println("The final Array with the size of " + n + " is: ");
        for(int i= 0; i<n; i++){
            System.out.print(Arr[i] + ",");
        }
        sc.close();
    }
}