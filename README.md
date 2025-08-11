# Name: Ethan Joshua Camingao
## Exploring Methods and Encapsulation

---

### Exercise 1: Designing Methods

**Code to run:**
```
public class Car {

    public void startEngine() {
        System.out.println("Engine has started.");
    }

    public String drive(int speed) {
        return "The car is moving at " + speed + " mph.";
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        String status = myCar.drive(60);
        System.out.println(status);
    }
}
```
**Predicted Output:**
```
// A
Engine has started.
The car is moving at 60 mph.
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex1.png"/>

**Explanation:**

The correct output is A. 

In the main method, an object of the Car class named myCar is created. 

First, the startEngine() method is called on myCar, which prints "Engine has started.". 

Next, the drive(60) method is called. This method receives the integer 60 as its speed parameter and returns the String "The car is moving at 60 mph.". 

This returned string is stored in the status variable and then printed to the console.

### Mini Challenge 1

Inside the Car class, add a new method named turnOffEngine. This method should not return any value and should print the message "Engine has been turned off." to the console. Modify the main method to call turnOffEngine after the car's status has been printed.

**Desired Output**
```
Engine has started.
The car is moving at 60 mph.
Engine has been turned off.
```

**Code to Add**
```
class Car {

    public void startEngine() {
        System.out.println("Engine has started.");
    }

    public String drive(int speed) {
        return "The car is moving at " + speed + " mph.";
    }

    //mini-challenge
    public void turnOffEngine(){
        System.out.println("Engine has been turned off.")
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        String status = myCar.drive(60);
        System.out.println(status);
        myCar.turnOffEngine(); // mini challenge
    }
}
```

**New Output**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex1-Challenge.png"/>

---

### Exercise 2: Passing Parameters: Primitives vs. Objects

**Code to run:**
```
public class ParameterPassing {

    public static void modifyValue(int value) {
        value = 100;
        System.out.println("Inside method: " + value);
    }

    public static void main(String[] args) {
        int originalValue = 50;
        System.out.println("Before method call: " + originalValue);
        modifyValue(originalValue);
        System.out.println("After method call: " + originalValue);
    }
}
```
**Predicted Output:**
```
// B
Before method call: 50
Inside method: 100
After method call: 50
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex2.png"/>

**Explanation:**

D) The code will not compile.

The correct output is B. When modifyValue(originalValue) is called, a copy of originalValue's data (the number 50) is passed into the value parameter of the method. 

Inside modifyValue, only this copy is changed to 100. 

The originalValue variable in the main method is in a different scope and remains completely unaffected by the change made within the other method.

### Mini Challenge 2

Create a Student class with a single instance variable, name (a String). In a separate Main class, write a main method where you create a Student object. Also in the Main class, create a method changeStudentName(Student student, String newName) that takes a Student object and a new name, and changes the student's name using the object reference. In main, call this method and print the student's name before and after the call to prove that the original object was modified.

**Desired Output**
```
Name before change: Alex
Name after change: Jordan
```

**Code**
```
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Main.java
public class Main {
    public static void changeStudentName(Student student, String newName) {
        student.setName(newName);
    }

    public static void main(String[] args) {
        Student student = new Student("Alice");

        System.out.println("Name before change: " + student.getName());
        changeStudentName(student, "Bob");
        System.out.println("Name after change: " + student.getName());
    }
}
```

**New Output**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex2-Challenge.png"/>

