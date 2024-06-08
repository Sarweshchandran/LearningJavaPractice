//package Encapsulation;

abstract class Main {
    public String fame = "Sarwesh";
    public int age = 21;
    public abstract void study(); //Only declaring function no function body in abstract method
}

//creating the subclass(Inheriting the Main class)

class Student extends Main {
    public int graduationYear = 2026;
    public void study(){
        //The body of the abstract method is defined here
        System.out.println("Studying all all long!");
    }
}