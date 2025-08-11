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
// *********************

// Exercise 4 **********

// *********************