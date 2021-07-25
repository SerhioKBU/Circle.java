package com.serhio.java.homeworks.homework2;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    boolean containsPoint(Point point) {
        double distance = center.distanceToPoint(point);
        return distance <= radius;
    }
}