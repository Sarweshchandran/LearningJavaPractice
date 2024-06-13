package Practice;

class A {
    public A()
    {
        super();
        System.out.println("In A");
    }

    
    public A(int n)
    {
        super();
        System.out.println("In A int");
    }

}

class B extends A {
    public B()
    {
        super();
        System.out.println("In B");
    }

    //creating the paramaterized constructor
    public B(int n)
    {
        //super(n);
        this();
        System.out.println("in B int");
    }
}
public class Demo {
    public static void main(String[] args){
        //B obj = new B();
        B obj = new B(4);
    }
}
