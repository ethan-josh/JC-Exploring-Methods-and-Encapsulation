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

---

### Exercise 5: Static Methods and Variables

**Code to run:**
```
public class Utility {

    public static String getAppName() {
        return "My Awesome App";
    }

    public String getInstanceId() {
        return "ID-12345";
    }

    public static void main(String[] args) {
        System.out.println("App Name: " + Utility.getAppName());

        // The following line would cause a compile-time error
        // System.out.println("Instance ID: " + Utility.getInstanceId());

        Utility utilInstance = new Utility();
        System.out.println("Instance ID: " + utilInstance.getInstanceId());
    }
}
```
**Predicted Output:**
```
//A
App Name: My Awesome App
Instance ID: ID-12345
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex5.png"/>

**Explanation:**

The correct output is A. 

The getAppName method is static, so it is correctly called directly on the class (Utility.getAppName()). 

The getInstanceId method is non-static (an instance method), so it must be called on an object of the class. The code first creates an instance (utilInstance) and then correctly calls the instance method on it.

### Mini Challenge 5

Create a Converter class. It should have a static method celsiusToFahrenheit(double celsius) that takes a temperature in Celsius and returns the equivalent in Fahrenheit. The formula is (celsius * 9.0/5.0) + 32. In the main method, call this static method without creating an instance of Converter and print the result. (Note: use 9.0/5.0 to ensure floating-point division).

**Desired Output**
```
25.0 degrees C is 77.0 degrees F.
```

**Code to Add**
```
class Converter {
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9.0/5.0) + 32;
    }

    public static void main(String[] args){
        System.out.println("25.0 degrees C is " + celsiusToFahrenheit(25.0) + " degrees F.");
        
    }
}
```

**New Output**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex5-Challenge.png"/>

---

### Exercise 6: Method Overloading

**Code to run:**
```
public class Display {

    public void show(String message) {
        System.out.println("Message: " + message);
    }

    public void show(String message, int times) {
        System.out.println("Repeating Message:");
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    public void show(int number) {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        Display d = new Display();
        d.show(42);
        d.show("Hello");
        d.show("Goodbye", 3);
    }
}
```
**Predicted Output:**
```
//A
Number: 42
Message: Hello
Repeating Message:
Goodbye
Goodbye
Goodbye
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex6.png"/>

**Explanation:**

The correct output is A). The Java compiler determines which version of the show method to invoke based on the arguments provided at the call site.

d.show(42) matches show(int number).
d.show("Hello") matches show(String message).
d.show("Goodbye", 3) matches show(String message, int times).

Each call correctly executes the logic of its corresponding overloaded method.

### Mini Challenge 6

In the Converter class from the previous challenge, overload the conversion method. Create a second static method, fahrenheitToCelsius(double fahrenheit), that converts a temperature from Fahrenheit to Celsius. The formula is (fahrenheit - 32) * 5.0/9.0. Test both methods in main.

**Desired Output**
```
25.0 degrees C is 77.0 degrees F.
77.0 degrees F is 25.0 degrees C.
```

**Code to Add**
```
class Converter {
    public static double celsiusToFahrenheit(float celsius){
        return (celsius * 9.0/5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5.0/9.0;
    }

    public static void main(String[] args){
        System.out.println("25.0 degrees C is " + celsiusToFahrenheit(25.0f) + " degrees F.");
        System.out.println("77.0 degrees F is " + fahrenheitToCelsius(77.0) + " degrees C.");
    }
}
```

**New Output**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex6-Challenge.png"/>

---

### Exercise 7: Constructors and Constructor Overloading

**Code to run:**
```
public class Pizza {
    private String toppings;
    private int size; // in inches

    public Pizza() {
        this.toppings = "Cheese";
        this.size = 12;
        System.out.println("Default pizza created.");
    }

    public Pizza(String toppings) {
        this(); // Calls the no-argument constructor first
        this.toppings = toppings;
        System.out.println("Pizza with custom toppings created.");
    }

    public Pizza(String toppings, int size) {
        this.toppings = toppings;
        this.size = size;
        System.out.println("Fully custom pizza created.");
    }

    public void display() {
        System.out.println("Size: " + size + " inches, Toppings: " + toppings);
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.display();

        Pizza pizza2 = new Pizza("Pepperoni");
        pizza2.display();

        Pizza pizza3 = new Pizza("Mushroom and Onion", 16);
        pizza3.display();
    }
}
```
**Predicted Output:**
```
//A
Default pizza created.
Size: 12 inches, Toppings: Cheese
Default pizza created.
Pizza with custom toppings created.
Size: 12 inches, Toppings: Pepperoni
Fully custom pizza created.
Size: 16 inches, Toppings: Mushroom and Onion
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex7.png"/>

**Explanation:**

The correct output is A).

new Pizza() calls the no-argument constructor.

new Pizza("Pepperoni") calls the one-argument constructor. Inside this constructor, this() invokes the no-argument constructor first, which sets the size to 12 and prints "Default pizza created.". Then, the one-argument constructor continues, overwriting the toppings and printing its own message.

new Pizza("Mushroom and Onion", 16) calls the two-argument constructor directly.

This technique, called constructor chaining, is useful for reducing code duplication.

### Mini Challenge 7

Create a Computer class with brand (String) and ramInGB (int) as instance variables. Create three constructors:

A default constructor setting brand to "Generic" and ramInGB to 8.
A constructor that only takes a brand and uses the default RAM.
A constructor that takes both brand and ramInGB.
Use constructor chaining (this()) to avoid repeating code. In main, create an object using each constructor and print its details.

**Desired Output**
```
Computer 1: Brand = Generic, RAM = 8GB
Computer 2: Brand = Dell, RAM = 8GB
Computer 3: Brand = Apple, RAM = 16GB
```

**Code to Add**
```
class Computer {
    String brand;
    int ramInGB;

    public Computer() {
        this("Generic", 8);
    }

    public Computer(String brand) {
        this(brand, 8);
    }

    public Computer(String brand, int ramInGB) {
        this.brand = brand;
        this.ramInGB = ramInGB;
    }

    public void displayDetails() {
        System.out.println("Brand = " + brand + ", RAM = " + ramInGB + "GB");
    }

    public static void main(String[] args) {
        System.out.print("Computer 1: ");
        Computer computer1 = new Computer();
        computer1.displayDetails();

        System.out.print("Computer 2: ");
        Computer computer2 = new Computer("Dell");
        computer2.displayDetails();

        System.out.print("Computer 3: ");
        Computer computer3 = new Computer("Apple", 16);
        computer3.displayDetails();
    }
}
```

**New Output**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex7-Challenge.png"/>

---

### Exercise 8: Constructors and Constructor Overloading

**Code to run:**
```
public class Thermostat {
    private double temperatureCelsius;

    public Thermostat(double temp) {
        // Use the setter in the constructor to enforce rules from the start
        setTemperatureCelsius(temp);
    }

    public double getTemperatureCelsius() {
        return this.temperatureCelsius;
    }

    public void setTemperatureCelsius(double temp) {
        if (temp >= 10.0 && temp <= 30.0) {
            this.temperatureCelsius = temp;
        } else {
            System.out.println("Error: Temperature must be between 10.0 and 30.0 Celsius.");
        }
    }

    public static void main(String[] args) {
        Thermostat stat = new Thermostat(22.5);
        System.out.println("Initial temp: " + stat.getTemperatureCelsius());

        stat.setTemperatureCelsius(5.0); // Try to set an invalid temp
        System.out.println("Temp after invalid change: " + stat.getTemperatureCelsius());

        stat.setTemperatureCelsius(25.0); // Set a valid temp
        System.out.println("Temp after valid change: " + stat.getTemperatureCelsius());
    }
}
```
**Predicted Output:**
```
//B
Initial temp: 22.5
Error: Temperature must be between 10.0 and 30.0 Celsius.
Temp after invalid change: 22.5
Temp after valid change: 25.0
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex8.png"/>

**Explanation:**

The correct output is B). The private variable temperatureCelsius is protected by the public setter method.

The thermostat is initialized to a valid 22.5.
stat.setTemperatureCelsius(5.0) is called. The if condition in the setter fails because 5.0 is not within the valid range. The error message is printed, and crucially, the temperatureCelsius variable is not updated.

When getTemperatureCelsius is called again, it still holds the original value of 22.5.

The final call with 25.0 is valid, and the temperature is successfully updated.

This demonstrates how encapsulation maintains the integrity of an object's state.

### Mini Challenge 8

Create a User class with a private instance variable for a password (String).

Provide a public getter, getPassword(), that returns a masked password (e.g., "********").
Provide a public setter, setPassword(String password), that only sets the new password if it is at least 8 characters long. If it's too short, print an error message and do not change the password.
Create a constructor that initializes the password using the setter.
In main, test your class by creating a user, trying to set a short password, then a valid one, and printing the masked password each time.

**Desired Output**
```
Error: Password must be at least 8 characters long.
Current masked password: ********
Attempting to set short password 'pass'...
Error: Password must be at least 8 characters long.
Current masked password: ********
Attempting to set valid password 'secure_password_123'...
Current masked password: *******************```
```

**Code to Add**
```
class User{
    private String password = "12345678";

    public void getPassword(){
        int length = password.length();
        System.out.print("Current masked password: ");
        while(length > 0){
            System.out.print("*");
            length--;
        }
        System.out.println();
    }

    public void setPassword(String userInput){
        if (userInput.length() >= 8){
            System.out.println("Attempting to set valid password '" + userInput + "'...");
            this.password = userInput;
        }else{
            System.out.println("Attempting to set short password '" + userInput + "'...");
            System.out.println("Error: Password must be at least 8 characters long.");
        }
    }

    public User(String userInput) {
        setPassword(userInput);
    }

    public static void main(String[] args){
        User user = new User("short");
        user.getPassword();
        user.setPassword("pass");
        user.getPassword();
        user.setPassword("secure_password_123");
        user.getPassword();
    }

}
```

**New Output**

<img src="https://github.com/ethan-josh/JC-Exploring-Methods-and-Encapsulation/blob/main/images/Ex8-Challenge.png"/>
