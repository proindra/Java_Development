class Human{
    private String name = "indra";
    private int age = 19;

    // it is used for default standard initialization of the object, it is called when we create an object of the class, and it is used to set the default values for the instance variables of the class.
    
    // default constructor
    // public Human(){ 
        
    //     age = 20;
    //     name = "iamindra";
    // }

    // parameterized constructor
    public Human(String n, int a){
        name = n;
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    // public void setName(String m) {
    //     name = m;
    // }

    public void setName(String m) {
        this.name = m; // this keyword is used to refer to the current object, it is used to differentiate between the instance variable and the local variable when they have the same name.
        // like m = m; // this will not work, because it will assign the value of m to itself, and the instance variable name will remain unchanged.
    }
}

public class E_WhatisEncapsulation {
    public static void main(String[] args) {
        Human obj = new Human("hi", 20);
        // obj.name = "John";
        // obj.age = 25;
        obj.setAge(21);
        obj.setName("proindra");

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        
    }
}
