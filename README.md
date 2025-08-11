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

**Mini Challenge**

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

