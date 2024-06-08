//package Encapsulation;

public class Second {
    public static void main(String[] args){
        //Create an objects of the student class (Which inherits the Main class methods)
        Student myObj = new Student();
        System.out.println("Name: " + myObj.fame);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study();//calling the abstract method
    }
}