package com.serhio.java.homeworks.homework2;

public class PointList {
    private Point[] points;
    private int size = 0;
    private int pointAmount = 0;

    public PointList() {
        points = new Point[pointAmount];
    }

    public int size(){
        return points.length;  //return elements amount
    }

    Point getIndex(int index) {
        return points[index];
    }

    public void addPoint(Point point) {

        Point[] newPoints = new Point[points.length + 1];
        for (int i = 0; i < points.length; i++) {
            newPoints[i] = points[i];
        }
        points = newPoints;
        points[points.length - 1] = point;
    }
}
