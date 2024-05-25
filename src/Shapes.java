import java.util.*;

public class Shapes {

    static void Square(){
        int side,Area,Perimeter;
        System.out.println("Enter the side of the Square: ");
        Scanner sc1 = new Scanner(System.in);
        side = sc1.nextInt();
        //sc1.close();
        Area = side*side;
        Perimeter = 4*side;
        System.out.println("The Area and Perimeter for the provided Square with the side of "+ side +" cm is: "+ Area +" cm²,  and "+ Perimeter +" cm.");
    }

    static void Rectangle(){
        Scanner sc2 = new Scanner(System.in);
        int length, breadth, Area, Perimeter;
        System.out.println("Enter the length, breadth of the Reactangle: ");
        length = sc2.nextInt();
        breadth = sc2.nextInt();
        Area = length * breadth;
        Perimeter = 2*(length + breadth);
        System.out.println("The area and perimeter of the Rectangle with the length and breadth of "+ length + " cm, "+ breadth +" cm is: "+Area +" cm², "+Perimeter+" cm.");
        //sc2.close();
    }

    static void Triangle(){
        Scanner sc3 = new Scanner(System.in);
        int base, height, Area;
        System.out.println("Enter the value of base and height of the triangle: ");
        base = sc3.nextInt();
        height = sc3.nextInt();
        Area = (base*height)/2;
        System.out.println("The area of triangle is: "+ Area);
        //sc3.close();
    }

    static void Parallelogram(){
        Scanner sc4 = new Scanner(System.in);
        int a,b,h,Area, Perimeter;
        System.out.println("Enter the value of the a, b and h of Parallelogram: ");
        a = sc4.nextInt();
        b = sc4.nextInt();
        h = sc4.nextInt();
        Area = a*h;
        Perimeter = 2*(a+b);
        System.out.println("The Area and Perimeter of the Parallelogram is: "+ Area +" , "+ Perimeter);
    }


    static void Circle(){
        Scanner sc5 = new Scanner(System.in);
        int radius;
        double Area,Perimeter;
        System.out.println("Enter the radius of Cicle: ");
        radius = sc5.nextInt();
        Area = (Math.PI*radius*radius);
        Perimeter = (2*Math.PI*radius);
        System.out.println("The Area and Perimeter of Circle with the radius "+radius+" is: " +Area+" , "+Perimeter+".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Select the Shape you want:\n");
            System.out.println("1.Square,\n2.Rectangle,\n3.Triangle,\n4.Parallelogram\n5.Circle\n0.Exit\n");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    Square();
                    break;
                case 2:
                    Rectangle();
                    break;
                case 3:
                    Triangle();
                    break;
                case 4:
                    Parallelogram();
                    break;
                case 5:
                    Circle();
                    break;
                case 0:
                     System.out.println("...Exiting");
                     break;
                default:
                    System.out.println("In valid option! Please Try Agian:-)");
                    break;
            }
        } while(n!=0);
        sc.close();
    }
}