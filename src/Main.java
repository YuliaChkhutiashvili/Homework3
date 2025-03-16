public class Main {
    public static void main(String[] args) {
Mobile mobile=new Mobile(  "Adroid", "Pixel", 8,15,  256 );
System.out.println(mobile.whatPhoneAmIHave());

Mobile defaultColor = new Mobile ( "Black");
Mobile color = new Mobile ("Black");
 System.out.println("Mobile color is: "+ color.getColor());
    }
}