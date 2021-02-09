package packcircle;

import java.lang.reflect.MalformedParameterizedTypeException;

public class Circle {
    private double radius = 5.0;
    private String color = "red";

    Circle() {

    }

    Circle(double r) {
        radius = r;
    }

    protected double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
