------Section A--------

1. Which OOP concept should be used? State one reason.

Answer: Encapsulation

Encapsulation is the process of combining data and methods into a single class. It protects the data from direct access or modification outside the class. In Java, encapsulation is achieved using the private access modifier and public getter and setter methods.

2. Identify the OOP concept and write the basic Java inheritance syntax.

Answer: Inheritance

Inheritance is an OOP concept in which one class acquires the properties and methods of another class. It helps to reuse existing code and reduces code duplication. In Java, inheritance is achieved using the extends keyword.

Syntax:
class Parent {
      }

class Child extends Parent {
     }


3. Identify the concept demonstrated by the Calculator class.

Answer: Method Overloading

Method overloading is the process of defining multiple methods with the same name but different parameters in the same class. The methods may differ in the number or type of parameters. It is an example of compile-time polymorphism.

4. What is it called when a child class provides its own implementation of a parent class method?

Answer: Method Overriding

Method overriding occurs when a child class provides its own implementation of a method already defined in the parent class. Both methods must have the same method name and parameters. It is an example of runtime polymorphism.

5. Which OOP concept hides implementation details and exposes only essential operations? Name one Java feature.

Answer: Abstraction

Abstraction is the process of hiding internal implementation details and showing only essential features to the user. It reduces complexity and improves security. In Java, abstraction is achieved using abstract classes and interfaces.

-----Section B -------

6. Differentiate between method overloading and method overriding. Give one Java example for each.

Answer:

Method overloading means defining multiple methods with the same name but different parameters within the same class. Method overriding means redefining a parent class method in its child class with the same method signature. Overloading is compile-time polymorphism, whereas overriding is runtime polymorphism.

Example:

// Method Overloading
void add(int a, int b)
void add(int a, int b, int c)

// Method Overriding
class Parent {
    void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child");
    }
}


7. What is the difference between an abstract class and an interface? Write any three points.

Answer:

*An abstract class is a class declared using the abstract keyword. 
*It can contain both abstract methods and normal methods, and a class can extend only one abstract class.
*An interface is declared using the interface keyword and defines a contract for implementing classes. A class can implement multiple interfaces.

8. Explain the four main OOP principles: encapsulation, inheritance, polymorphism, and abstraction.

Answer:

 *Encapsulation is the process of combining data and methods into a single class and protecting data from direct access.
 *Inheritance allows one class to acquire the properties and methods of another class. 
 *Polymorphism means one method can perform different actions through overloading and overriding.
 *Abstraction hides implementation details and displays only essential features to the user.

9. Can a private method of a parent class be overridden by a child class? Explain your answer with a small code example or reason.

Answer: No.

A private method of a parent class cannot be overridden by a child class because private methods are accessible only within their own class. The child class cannot directly access or inherit the private method. If the child class creates a method with the same name, it is considered a separate method, not an overridden method.

Example:
class Parent {
    private void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child");
    }
}