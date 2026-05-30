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
| `Q_InnerClass.java` | Inner classes *(in progress)* |

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
| `A.java` | Access modifier demo across packages |

---

## Key Concepts & Notes

**OOP Pillars practiced:**
- Encapsulation — private fields with getters/setters
- Inheritance — single and multi-level, `super` keyword
- Polymorphism — method overloading (compile-time) and overriding (runtime)
- Abstraction — abstract classes with abstract and concrete methods

**Important interview points covered (`01_Interview_Q.txt`):**
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
Topics ahead: Inner Classes, Interfaces, Exception Handling, Collections, Generics, Spring Boot, Microservices, Spring AI
