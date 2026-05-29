class student{
    int rollno;
    String name;
    int marks;
}

public class D_StudentDatabase {
    public static void main(String[] args) {
        student student1 = new student();
        student1.rollno = 1;
        student1.name = "John";
        student1.marks = 85;

        student student2 = new student();
        student2.rollno = 2;    
        student2.name = "Jane";
        student2.marks = 90;

        student student3 = new student();
        student3.rollno = 3;
        student3.name = "Doe";
        student3.marks = 95;

        student students [] = new student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        // for (int i=0; i<students.length; i++){
        //     System.out.println("Roll No: " + students[i].rollno);
        //     System.out.println("Name: " + students[i].name);
        //     System.out.println("Marks: " + students[i].marks);
        //     System.out.println();
        // }

        //by enchanced for loop
        for (student s : students){
            System.out.println("Roll No: " + s.rollno);
            System.out.println("Name: " + s.name);
            System.out.println("Marks: " + s.marks);
            System.out.println();
        }

        System.out.println(student1==student2); // false, because they are different objects in memory
        System.out.println(student1==student1); // true, because they are the same object
    
        // in Strings
        // string constant pool
        // immutable nature of strings
        // if we want muttable strings, we can use StringBuilder or StringBuffer classes in Java.

    String name = "indra";
    name = name + " kumar"; // this will create a new string object in memory, and name will now point to that new object, the old string "indra" will be garbage collected by the JVM.
    System.out.println(name);

    String name1 = "indra";
    String name2 = "indra";
    System.out.println(name1==name2); // true, because string literals are interned by the JVM, and both name1 and name2 will point to the same string object in memory.
    }
}


//we can do this in C by using struct, but in Java we use class to achieve the same thing. Class is a blueprint for creating objects, and objects are instances of a class. In this example, we have created a class called student, which has three variables: rollno, name, and marks. We have then created three objects of the student class, and stored
// #include <stdio.h>
// #include <string.h>

// struct Student {
//     int rollno;
//     char name[20];
//     int marks;
// };

// int main() {
//     struct Student students[3];

//     students[0].rollno = 1;
//     strcpy(students[0].name, "John");
//     students[0].marks = 85;

//     students[1].rollno = 2;
//     strcpy(students[1].name, "Jane");
//     students[1].marks = 90;

//     students[2].rollno = 3;
//     strcpy(students[2].name, "Doe");
//     students[2].marks = 95;

//     for (int i = 0; i < 3; i++) {
//         printf("%d %s %d\n",
//                students[i].rollno,
//                students[i].name,
//                students[i].marks);
//     }

//     return 0;
// }