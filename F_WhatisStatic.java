class Mobile{
    String name;
    int price;
    static String company = "Apple"; // static variable, it is shared among all the objects of the class, it is not tied to any specific object, it is tied to the class itself, it is also called class variable.  

    
    public Mobile(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public void show(){
        System.out.println(name + " " + price + " " + company); // we can access static variable company directly, without using object name.
    }
}

public class F_WhatisStatic {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("iPhone 13", 999);
        Mobile mobile2 = new Mobile("iPhone 14", 1099);

        // mobile1.company = "Samsung"; 

        // we should call it with class name like Mobile.company = "Samsung"; but it is also possible to call it with object name, but it is not recommended, because it can lead to confusion, and it can also lead to bugs in the code, because if we call it with object name, it will change the value of the static variable for all the objects of the class, not just for that specific object.
        
        Mobile.company = "Apple";

        mobile1.show(); // iPhone 13 999 Apple
        mobile2.show(); // iPhone 14 1099 Apple
    }
}
