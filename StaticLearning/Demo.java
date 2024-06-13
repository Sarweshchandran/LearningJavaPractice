package Learning;
class Mobile
{
    //instance variables
    String brand;
    int price;
    //static variable
    static String name;//the variable is made common
    
    public Mobile()
    {
        brand = "";
        price = 200;
        System.out.println("In Constructor");
    }
//it will be called only once
    static 
    {
        name = "Phone";
        System.out.println("In static block");
    }
    
    public void show()
    {
        System.out.println(brand + ":" + price + ":" + name);
    }

    public static void show1(Mobile obj)
    {
        //System.out.println(brand + ":" + price + ":" + name);//throws an error as the brand and the price is non-static access 
        //The above can be resolved by providing the objects as the parameter and assigning it wiht the help of the dot operator
        System.out.println(obj.brand + ":" + obj.price + ":" + name);
    }
}
public class Demo 
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        //Class.forName("Mobile");
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1400;
        obj.show();
        obj1.show();
        System.out.println("Now using the static method");
        Mobile.show1(obj);
        Mobile.show1(obj1);
    }    
}
