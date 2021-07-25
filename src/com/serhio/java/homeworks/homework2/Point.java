package com.serhio.java.homeworks.homework2;

public class Point {
    public static final Point ORIGIN = new Point(0,0);
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point["+x+","+y+"]";
    }

    double distanceToPoint(Point point) {
            double dx = point.getX() - this.x;
            double dy = point.getY() - this.y;
            return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
