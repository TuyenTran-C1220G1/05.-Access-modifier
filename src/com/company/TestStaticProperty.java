package com.company;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", "Skyactive 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda", "Skyactive 6");
        System.out.println(Car.numberOfCars);
    }
}
