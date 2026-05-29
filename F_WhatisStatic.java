class Mobile {

    // Instance variables (each object gets its own copy)
    String name;
    int price;

    // Static variable (shared by all Mobile objects)
    // static String company = "Apple";

    // Static block
    //A static block is used when initialization requires multiple statements or logic.
    static String company;
    
    static {
        company = "Samsung";  // Initialization logic
        System.out.println("IMP 1 : Static block executed ONCE FIRST without irrespective of orders of execution.");
        System.out.println("IMP 2 : If object is not created(comment all objects) then static block also not executed because static block is executed when class is loaded into memory.");
        System.out.println("IMP 3 : To solve this issue see G_forName.java file.");
    }
    

    // Constructor
    public Mobile(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("IMP : Constructor executed AFTE static block and executed for each object creation.");
    }

    // Instance method
    // Can directly access both instance and static variables
    public void show() {
        System.out.println(name + " " + price + " " + company);
    }

    // Static method
    // Belongs to the class, not to any specific object
    public static void show1(Mobile obj) {

        // Cannot directly use:
        // System.out.println(name);   // Compilation Error
        // because 'name' belongs to an object but we can use company because it's static.


        // We must use an object reference to access instance variables.
        System.out.println(obj.name + " " + obj.price + " " + company);
    }
}

public class F_WhatisStatic {

    public static void main(String a[]) {

        // Creating objects
        Mobile obj1 = new Mobile("iPhone 13", 999);
        Mobile obj2 = new Mobile("iPhone 14", 1099);

        /*
         * Static variables are shared by all objects.
         * Recommended way: access them using the class name.
         */
        Mobile.company = "Samsung";

        /*
         * Although this is allowed:
         * obj1.company = "Samsung";
         *
         * it is not recommended because company belongs to the class,
         * not to obj1 specifically.
         */

        // Calling instance methods using objects
        obj1.show();
        obj2.show();

        // Calling static method using class name
        Mobile.show1(obj1);

        /*
         * Output:
         *
         * iPhone 13 999 Apple
         * iPhone 14 1099 Apple
         * iPhone 13 999 Apple
         */
    }
}


