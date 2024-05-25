import java.util.Scanner;
public class Square {

    public static void SQ(){
        int side, Area, Perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the side: ");
        side = sc.nextInt();
        Area = side*side;
        Perimeter = 4*side;
        System.out.println("The Area and Perimeter of square with the side "+ side + " cm is: " + Area +"cm², "+Perimeter+" cm.");
    }

    static int SQ(int s){
        int Area1 = s*s;
        int Perimeter1= 4*s;
        System.out.println("The Area and Perimeter of square with the side "+ s + " cm is: " + Area1 +"cm², "+Perimeter1+" cm.");
        return 0;
        
    }
    public static void main(String[] args) {
        SQ();
        SQ(4);
    }
}
