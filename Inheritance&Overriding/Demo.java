package Practice;

public class Demo extends Calculator{

    public int power(int n1, int n2){
        return ((int)Math.pow(n1, n2));
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        int r1 = obj.add(4,5);
        int r2 = obj.add(4, 5, 6);
        int r3 = obj.sub(7,3);
        int r4 = obj.sub(7, 3, 2);
        int r5 = obj.multiply(7, 4);
        int r6 = obj.multiply(7, 4, 5);
        int r7 = obj.divide(30, 6);
        int r8 = obj.power(4, 2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 + " " + r6 + " " + r7 + " " + r8);
    }
}