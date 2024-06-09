package Inheritance;

class Vehicle {
    protected String brandName = "Ford";
    public void honk(){
        System.out.println("Tuut Tuut!");
    }
}

public class Car extends Vehicle {
    private String modalName = "Mustang";
    public static void main(String[] args) {
        Car myCar = new Car();

        //Calling the mehtod from the Vehile class
        myCar.honk();

        //Displaying the Value of the brandName and the modalName
        System.out.println("Brand Name: " + myCar.brandName +" Modal Name: " + myCar.modalName);
    }
}