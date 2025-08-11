package org.example;

class Car {

    public void startEngine() {
        System.out.println("Engine has started.");
    }

    public String drive(int speed) {
        return "The car is moving at " + speed + " mph.";
    }

    //mini-challenge
    public void turnOffEngine(){
        System.out.println("Engine has been turned off.");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        String status = myCar.drive(60);
        System.out.println(status);
        myCar.turnOffEngine(); // mini challenge
    }
}