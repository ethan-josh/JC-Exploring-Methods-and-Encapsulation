package org.example;

// Exercise 1 **********
// class Car {

//     public void startEngine() {
//         System.out.println("Engine has started.");
//     }

//     public String drive(int speed) {
//         return "The car is moving at " + speed + " mph.";
//     }

//     //mini-challenge
//     public void turnOffEngine(){
//         System.out.println("Engine has been turned off.");
//     }

//     public static void main(String[] args) {
//         Car myCar = new Car();
//         myCar.startEngine();
//         String status = myCar.drive(60);
//         System.out.println(status);
//         myCar.turnOffEngine(); // mini challenge
//     }
// }
// *********************

// Exercise 2 **********
// class ParameterPassing {

//     public static void modifyValue(int value) {
//         value = 100;
//         System.out.println("Inside method: " + value);
//     }

//     public static void main(String[] args) {
//         int originalValue = 50;
//         System.out.println("Before method call: " + originalValue);
//         modifyValue(originalValue);
//         System.out.println("After method call: " + originalValue);
//     }
// }
// Student.java
// class Student {
//     private String name;

//     public Student(String name) {
//         this.name = name;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }
// }

// // Main.java
// public class Main {
//     public static void changeStudentName(Student student, String newName) {
//         student.setName(newName);
//     }

//     public static void main(String[] args) {
//         Student student = new Student("Alice");

//         System.out.println("Name before change: " + student.getName());
//         changeStudentName(student, "Bob");
//         System.out.println("Name after change: " + student.getName());
//     }
// }
// *********************

// Exercise 3 **********
// class VarargsExample {

//     public static void printMessages(String... messages) {
//         System.out.println("Number of messages: " + messages.length);
//         for (String msg : messages) {
//             System.out.print(msg + " ");
//         }
//         System.out.println("\n");
//     }
//     public static int findLargest(int... numbers){
        
//         if(numbers.length == 0){
//             //System.out.println("Largest with no numbers is: " + Integer.MIN_VALUE);
//             return Integer.MIN_VALUE;
//         }else{
//             int largest =0;
//             for (int x : numbers){
//                 if(x > largest){
//                     largest = x;
//                 }
//             }
//             //System.out.println("Largest in " + Arrays.toString(numbers) + " is: " + largest);
//             return largest;
//         }
        
//     }
//     public static void main(String[] args) {
//         // printMessages("Hello", "World");
//         // printMessages("Testing", "Varargs", "Here");
//         // printMessages();

//         System.out.println("Largest in (10, 5, 25, 15) is: " + findLargest(10,5,25,15));
//         System.out.println("Largest in (-5, -1, -10) is: " + findLargest(-5, -1, -10));
//         System.out.println("Largest with no numbers is: " + findLargest());
//     }
// }
// *********************

// Exercise 4 **********
// In a file named Account.java
// class Account {
//     private String owner = "Alice";
//     private double balance = 1200.50;

//     private String getDetails() {
//         return owner + " has a balance of $" + balance;
//     }

//     public void displayAccountDetails() {
//         // We can call the private method from within the class
//         System.out.println(getDetails());
//     }
// }

// // In a file named Bank.java
// class Bank {
//     public static void main(String[] args) {
//         Account myAccount = new Account();
//         myAccount.displayAccountDetails();

//         // The following line would cause a compile-time error if uncommented
//         // System.out.println(myAccount.balance);
//     }
// }
// class SmartDoor{
//     private boolean isLocked = false;

//     public void lockDoor(){
//         isLocked = true;
//         System.out.println("Locking the door...");
//     }

//     public void unlockDoor(){
//         isLocked = false;
//         System.out.println("Unlocking the door...");
//     }

//     public void isLocked(){
//         if (isLocked){
//             System.out.println("Is the door locked? true");
//         }else{
//             System.out.println("Is the door locked? false");
//         }
//     }

//     public static void main(String[] args){
//         SmartDoor smartDoor = new SmartDoor();
//         smartDoor.isLocked();
//         smartDoor.lockDoor();
//         smartDoor.isLocked();
//         smartDoor.unlockDoor();
//         smartDoor.isLocked();
//     }
// }

// *********************

// Exercise 5 **********
// class Utility {

//     public static String getAppName() {
//         return "My Awesome App";
//     }

//     public String getInstanceId() {
//         return "ID-12345";
//     }

//     public static void main(String[] args) {
//         System.out.println("App Name: " + Utility.getAppName());

//         // The following line would cause a compile-time error
//         // System.out.println("Instance ID: " + Utility.getInstanceId());

//         Utility utilInstance = new Utility();
//         System.out.println("Instance ID: " + utilInstance.getInstanceId());
//     }
// }
// class Converter {
//     public static double celsiusToFahrenheit(double celsius){
//         return (celsius * 9.0/5.0) + 32;
//     }

//     public static void main(String[] args){
//         System.out.println("25.0 degrees C is " + celsiusToFahrenheit(25.0) + " degrees F.");
        
//     }
// }
// *********************

// Exercise 6 **********
// class Display {

//     public void show(String message) {
//         System.out.println("Message: " + message);
//     }

//     public void show(String message, int times) {
//         System.out.println("Repeating Message:");
//         for (int i = 0; i < times; i++) {
//             System.out.println(message);
//         }
//     }

//     public void show(int number) {
//         System.out.println("Number: " + number);
//     }

//     public static void main(String[] args) {
//         Display d = new Display();
//         d.show(42);
//         d.show("Hello");
//         d.show("Goodbye", 3);
//     }
// }

// class Converter {
//     public static double celsiusToFahrenheit(float celsius){
//         return (celsius * 9.0/5.0) + 32;
//     }

//     public static double fahrenheitToCelsius(double fahrenheit){
//         return (fahrenheit - 32) * 5.0/9.0;
//     }

//     public static void main(String[] args){
//         System.out.println("25.0 degrees C is " + celsiusToFahrenheit(25.0f) + " degrees F.");
//         System.out.println("77.0 degrees F is " + fahrenheitToCelsius(77.0) + " degrees C.");
//     }
// }
// *********************

// Exercise 7 **********
// class Pizza {
//     private String toppings;
//     private int size; // in inches

//     public Pizza() {
//         this.toppings = "Cheese";
//         this.size = 12;
//         System.out.println("Default pizza created.");
//     }

//     public Pizza(String toppings) {
//         this(); // Calls the no-argument constructor first
//         this.toppings = toppings;
//         System.out.println("Pizza with custom toppings created.");
//     }

//     public Pizza(String toppings, int size) {
//         this.toppings = toppings;
//         this.size = size;
//         System.out.println("Fully custom pizza created.");
//     }

//     public void display() {
//         System.out.println("Size: " + size + " inches, Toppings: " + toppings);
//     }

//     public static void main(String[] args) {
//         Pizza pizza1 = new Pizza();
//         pizza1.display();

//         Pizza pizza2 = new Pizza("Pepperoni");
//         pizza2.display();

//         Pizza pizza3 = new Pizza("Mushroom and Onion", 16);
//         pizza3.display();
//     }
// }
// class Computer {
//     String brand;
//     int ramInGB;

//     public Computer() {
//         this("Generic", 8);
//     }

//     public Computer(String brand) {
//         this(brand, 8);
//     }

//     public Computer(String brand, int ramInGB) {
//         this.brand = brand;
//         this.ramInGB = ramInGB;
//     }

//     public void displayDetails() {
//         System.out.println("Brand = " + brand + ", RAM = " + ramInGB + "GB");
//     }

//     public static void main(String[] args) {
//         System.out.print("Computer 1: ");
//         Computer computer1 = new Computer();
//         computer1.displayDetails();

//         System.out.print("Computer 2: ");
//         Computer computer2 = new Computer("Dell");
//         computer2.displayDetails();

//         System.out.print("Computer 3: ");
//         Computer computer3 = new Computer("Apple", 16);
//         computer3.displayDetails();
//     }
// }
// *********************

// Exercise 8 **********
// class Thermostat {
//     private double temperatureCelsius;

//     public Thermostat(double temp) {
//         // Use the setter in the constructor to enforce rules from the start
//         setTemperatureCelsius(temp);
//     }

//     public double getTemperatureCelsius() {
//         return this.temperatureCelsius;
//     }

//     public void setTemperatureCelsius(double temp) {
//         if (temp >= 10.0 && temp <= 30.0) {
//             this.temperatureCelsius = temp;
//         } else {
//             System.out.println("Error: Temperature must be between 10.0 and 30.0 Celsius.");
//         }
//     }

//     public static void main(String[] args) {
//         Thermostat stat = new Thermostat(22.5);
//         System.out.println("Initial temp: " + stat.getTemperatureCelsius());

//         stat.setTemperatureCelsius(5.0); // Try to set an invalid temp
//         System.out.println("Temp after invalid change: " + stat.getTemperatureCelsius());

//         stat.setTemperatureCelsius(25.0); // Set a valid temp
//         System.out.println("Temp after valid change: " + stat.getTemperatureCelsius());
//     }
// }

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
// *********************