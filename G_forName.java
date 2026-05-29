class Mobile {
    String name;
    int price;

    static String company;
    
    static {
        company = "Samsung";  // Initialization logic
        System.out.println("IMP 1 : Static block executed ONCE FIRST without irrespective of orders of execution.");
        System.out.println("IMP 2 : If object is not created then static block also not executed because static block is executed when class is loaded into memory.");
        System.out.println("IMP 3 : Static block is executed when class is loaded into memory, not when object is created.");
    }
}



public class G_forName {
    public static void main(String a[]) throws ClassNotFoundException{
        Class.forName("Mobile");
    }
    
}
