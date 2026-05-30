# Java Development Course — Practice Repository

A hands-on practice repository following the **Complete Java Development: Spring Boot, Microservices, Spring AI** course. Each file covers a core Java concept with working examples and inline notes.

---

## Topics Covered

| File | Topic |
|------|-------|
| `A_HelloWorld.java` | Hello World, `while` loop basics |
| `B_OOPs.java` | OOP intro — Classes, Objects, Methods |
| `C_Array.java` | Arrays, enhanced for loop, jagged arrays |
| `D_StudentDatabaseAndStrings.java` | Object arrays, Strings, String constant pool, immutability |
| `E_WhatisEncapsulation.java` | Encapsulation, getters/setters, `this` keyword, constructors |
| `F_WhatisStatic.java` | `static` variables, methods, static blocks |
| `G_forName.java` | `Class.forName()` — loading class without creating object |
| `H_AnonymousObject.java` | Anonymous objects |
| `I_InhertanceAndPackage.java` | Inheritance, packages, `import` statements |
| `J_AccessModifier.java` | Access modifiers (`public`, `private`, `protected`, default) |
| `K_Polymorphism.java` | Runtime polymorphism — method overriding |
| `L_finalKeyword.java` | `final` variable, method, and class |
| `M_ObjectClass.java` | `Object` class — overriding `toString()`, `equals()`, `hashCode()` |
| `N_TypeCasting.java` | Upcasting and downcasting |
| `O_WapperClass.java` | Wrapper classes, autoboxing, unboxing, `Integer.parseInt()` |
| `P_AbtrackKeyword.java` | Abstract classes and abstract methods |
| `Q_InnerClass.java` | Inner classes — non-static inner class, accessing outer members |
| `QA_InnerClassWithStatic.java` | Static inner class — `static` with inner class, `A.B` instantiation |
| `QB_AnonymousInnerClass.java` | Anonymous inner class — overriding methods inline |
| `QC_AnonymousInnerClassWithAbstract.java` | Anonymous inner class with abstract class |
| `R_Interface.java` | Interfaces — `interface`, `implements`, constants (`public static final`), interface variables |
| `RA_Interfaceplus.java` | Interface advanced — multiple interface implementation, `interface extends interface` |
| `S_Enumeration.java` | Enumerations — `enum` keyword |
| `SA_EnumerationWithSwitch.java` | Enum with `switch` statement, `ordinal()`, superclass via `getClass().getSuperclass()` |
| `SB_EnumerationWithClassConstructor.java` | Enum with constructor and fields — private field, constructor, getter method |
| `T_FunctionalInterface.java` | Functional interface — `@FunctionalInterface`, anonymous class implementation |
| `TA_FunctionalInterfaceWithLambaExpression.java` | Functional interface with lambda expression — lambda syntax, parameter passing |
| `U_Exceptions.java` | Exception handling basics — `try`, `catch`, `finally`, `Exception` class |
| `UA_MultiExceptions.java` | Multiple catch blocks — `ArithmeticException`, `ArrayIndexOutOfBoundsException`, parent exception ordering |
| `UB_ThrowInException.java` | `throw` keyword — manually throwing exceptions with custom message, custom condition-based throw |
| `UC_CustomException.java` | Custom exceptions — extending `Exception`, custom exception class with constructor |
| `V_UserInput.java` | User input — `Scanner`, `nextInt()`, reading from `System.in` |
| `W_threading.java` | Multithreading — `Thread` class, `extends Thread`, `run()`, `start()`, concurrent execution |
| `WA_PriorityThreading.java` | Thread priority — `getPriority()`, `setPriority()`, `Thread.MAX_PRIORITY`, `Thread.sleep()` |
| `WB_RunnableVSThreading.java` | `Runnable` interface — `implements Runnable`, passing `Runnable` to `Thread`, allows class to extend other classes |
| `WC_RaceCondition.java` | Race condition — `synchronized` keyword, thread-safe `increment()`, `join()`, shared state with multiple threads |

### Inheritance Package (`Inheritance/`)

| File | Topic |
|------|-------|
| `Calc.java` | Base calculator class |
| `AdvCalc.java` | Method overriding — extended calculator |
| `VeryAdvCalc.java` | Multi-level inheritance |
| `ConstructorwithParameters.java` | `super()`, `this()` in constructors |
| `ContructorinInheritance.java` | Constructor chaining in inheritance |
| `00_Interview_Q.txt` | Key interview points on inheritance |

### Access Modifier Package (`AccessModifier/`)

| File | Topic |
|------|-------|
| `A.java` | `public` access modifier — accessible from any package |

### Notes & Reference Files

| File | Topic |
|------|-------|
| `JB.java` | Default (package-private) access modifier demo |
| `00_CasinginJAVA.txt` | Java naming conventions — camelCase for variables/methods, PascalCase for classes, UPPER_SNAKE_CASE for constants |
| `01_Interview_Q.txt` | Interview Q&A — polymorphism (overloading vs overriding), abstract class rules, default imports |
| `Inheritance/00_Interview_Q.txt` | Interview Q&A — multiple inheritance, constructor chaining, `super()`, `this()`, `Object` class |

---

## Key Concepts & Notes

**OOP Pillars practiced:**
- Encapsulation — private fields with getters/setters
- Inheritance — single and multi-level, `super` keyword
- Polymorphism — method overloading (compile-time) and overriding (runtime)
- Abstraction — abstract classes with abstract and concrete methods

**Important interview points covered:**
- Java does not support multiple inheritance due to ambiguity
- Every class in Java implicitly extends `Object`
- `super()` is implicitly called in every child constructor
- `final` prevents variable reassignment, method overriding, and class inheritance
- Abstract class can have both abstract and non-abstract methods
- Cannot instantiate an abstract class, but can hold a reference to it

---

## How to Run

```bash
# Compile
javac FileName.java

# Run
java FileName
```

For files using packages (e.g., `I_InhertanceAndPackage.java`):

```bash
# From the root directory
javac -d . Inheritance/Calc.java Inheritance/AdvCalc.java Inheritance/VeryAdvCalc.java
javac I_InhertanceAndPackage.java
java I_InhertanceAndPackage
```

---

## Prerequisites

- Java JDK 8+
- Any IDE (VS Code, IntelliJ IDEA, Eclipse) or terminal

---

## Course

**Complete Java Development: Spring Boot, Microservices, Spring AI**  
Topics ahead: Collections, Generics, Threads, Spring Boot, Microservices, Spring AI
