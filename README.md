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

---

### Exercise 3: Using Varargs

**Code to run:**
```
public class VarargsExample {

    public static void printMessages(String... messages) {
        System.out.println("Number of messages: " + messages.length);
        for (String msg : messages) {
            System.out.print(msg + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        printMessages("Hello", "World");
        printMessages("Testing", "Varargs", "Here");
        printMessages();
    }
}
```
**Predicted Output:**
```
// A
Number of messages: 2
Hello World 

Number of messages: 3
Testing Varargs Here 

Number of messages: 0


```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex3.png"/>

**Explanation:**

The correct output is A. The String... messages syntax allows the printMessages method to be called with any number of String arguments. 

Internally, the messages parameter is treated as an array of strings. 

The length property gives the count of arguments passed. The third call, printMessages(), is valid; it passes an empty array, resulting in a length of 0, and the for loop is simply skipped.

### Mini Challenge 3

Create a method named findLargest that takes a variable number of integers (int... numbers) and returns the largest integer from the list. If no numbers are provided, it should return Integer.MIN_VALUE. Test this method in main by calling it with different sets of numbers, including an empty call.

**Desired Output**
```
Largest in (10, 5, 25, 15) is: 25
Largest in (-5, -1, -10) is: -1
Largest with no numbers is: -2147483648
```

**Code to Add**
```
class VarargsExample {

    public static void printMessages(String... messages) {
        System.out.println("Number of messages: " + messages.length);
        for (String msg : messages) {
            System.out.print(msg + " ");
        }
        System.out.println("\n");
    }
    public static int findLargest(int... numbers){
        
        if(numbers.length == 0){
            //System.out.println("Largest with no numbers is: " + Integer.MIN_VALUE);
            return Integer.MIN_VALUE;
        }else{
            int largest =0;
            for (int x : numbers){
                if(x > largest){
                    largest = x;
                }
            }
            //System.out.println("Largest in " + Arrays.toString(numbers) + " is: " + largest);
            return largest;
        }
        
    }
    public static void main(String[] args) {
        // printMessages("Hello", "World");
        // printMessages("Testing", "Varargs", "Here");
        // printMessages();

        System.out.println("Largest in (10, 5, 25, 15) is: " + findLargest(10,5,25,15));
        System.out.println("Largest in (-5, -1, -10) is: " + findLargest(-5, -1, -10));
        System.out.println("Largest with no numbers is: " + findLargest());
    }
}
```

**New Output**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex3-Challenge.png"/>

---


### Exercise 4: Access Specifiers

**Code to run:**
```
// In a file named Account.java
public class Account {
    private String owner = "Alice";
    private double balance = 1200.50;

    private String getDetails() {
        return owner + " has a balance of $" + balance;
    }

    public void displayAccountDetails() {
        // We can call the private method from within the class
        System.out.println(getDetails());
    }
}

// In a file named Bank.java
public class Bank {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.displayAccountDetails();

        // The following line would cause a compile-time error if uncommented
        // System.out.println(myAccount.balance);
    }
}
```
**Predicted Output:**
```
Alice has a balance of $1200.50
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex4.png"/>

**Explanation:**

The correct output is A. 

The owner and balance fields in the Account class are private, meaning they cannot be accessed directly from the Bank class. 

However, the public method displayAccountDetails can be called from Bank. 

This method, being part of the Account class, has permission to call its own private method, getDetails, which in turn accesses the private fields. 

This is a classic example of encapsulation.

### Mini Challenge 4

Create a SmartDoor class. It should have a private boolean instance variable isLocked. It should also have three public methods: lockDoor(), unlockDoor(), and isLocked(). The first two methods should change the state of the isLocked variable, and the third should return its current state.

**Desired Output**
```
Is the door locked? false
Locking the door...
Is the door locked? true
Unlocking the door...
Is the door locked? false
```

**Code to Add**
```
class SmartDoor{
    private boolean isLocked = false;

    public void lockDoor(){
        isLocked = true;
        System.out.println("Locking the door...");
    }

    public void unlockDoor(){
        isLocked = false;
        System.out.println("Unlocking the door...");
    }

    public void isLocked(){
        if (isLocked){
            System.out.println("Is the door locked? true");
        }else{
            System.out.println("Is the door locked? false");
        }
    }

    public static void main(String[] args){
        SmartDoor smartDoor = new SmartDoor();
        smartDoor.isLocked();
        smartDoor.lockDoor();
        smartDoor.isLocked();
        smartDoor.unlockDoor();
        smartDoor.isLocked();
    }
}
```

**New Output**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex4-Challenge.png"/>