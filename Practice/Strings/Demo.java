package Practice;
public class Demo {
    public static void main(String[] args) {
        
        String name1 = new String("sarwesh");
        System.out.println("Hello, "+name1);
        //System.out.println(name1.charAt(1));
        //System.out.println(name1.concat("waran R S"));
        //System.out.println(name1.hashCode());

        String s1 = "Sarwesh";
        String s2 = "Sarwesh";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == name1);
        System.out.println(s1==s2);

        //Working witht the StirngBuffer class
        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        StringBuffer sb1 = new StringBuffer("Sarwesh");
        sb1.append("waran R S");
        System.out.println(sb1);
        // sb1.deleteCharAt(0);
        // System.out.println(sb1);
        // System.out.println(sb1.capacity());
        // System.out.println(sb1.length());
        //to assign the stringBuffer to string we can use the toString method

    }
}
