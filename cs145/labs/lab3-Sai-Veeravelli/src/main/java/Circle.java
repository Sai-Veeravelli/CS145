import java.util.*;

//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {
    // add your instances here
    private static double x;
    private static double y;
    private static double radius;
    // constructors
    // default constructor 
    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 5;
    }

    // customized constructor 
    public Circle(double xV, double yV, double radiusV) {
        x = xV;
        y = yV;
        radius = radiusV;
    }
    
    //--------------------------------------------------------
    // toString - return a String representation of
    //            this circle in the following format:
    //            center:(x,y)
    //            radius: r
    //--------------------------------------------------------
    public String toString() {
        return "center: ("+x+","+y+")\nradius: "+radius;
    }

    //----------------------------------------------
    // getX - returns the value of x
    //----------------------------------------------
    public double getX() {
        return x;

    }
    

    //----------------------------------------------
    // getY - returns the value of y
    //----------------------------------------------
    public double getY() {
        return y;
    }
    
    //----------------------------------------------
    // getRadius - returns the value of radius
    //----------------------------------------------
    public double getRadius() {
        return radius;
    }

    //----------------------------------------------
    // setX - assigns a new value to x
    //----------------------------------------------
    public void setX(double xV) {
        x = xV;
    }
    

    //----------------------------------------------
    // setY - assigns a new value to y
    //----------------------------------------------
    public void setY(double yV) {
        y = yV;
    }   
    
    
    //----------------------------------------------
    // setRadius - assigns a new value to radius
    //----------------------------------------------
    public void setRadius(double radiusV) {
        radius = radiusV;
    }
    
    //--------------------------------------------------------
    // diameter - calculates the diameter of the circle
    //--------------------------------------------------------
    public double diameter() {
        return 2*radius;
    }
    

    //--------------------------------------------------------
    // area - returns the area of the circle
    //--------------------------------------------------------
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    //--------------------------------------------------------
    // perimeter - returns the perimeter of the circle
    //--------------------------------------------------------
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    //--------------------------------------------------------
    // isUnitCircle - return true if the radius of this circle
    //                is 1 and its center is (0,0) and false
    //                otherwise.
    //--------------------------------------------------------
    public boolean isUnitCircle() {
        return (raidus == 1 && x == 0 && y == 0);
    }

    public boolean equals(Circle anotherCircle) {
        return (this.x == anotherCircle.getX() && this.y == anotherCircle.getY() && this.radius == anotherCircle.getRadius());
    }

    public boolean isConcentric(Circle anotherCircle) {
        return (this.x == anotherCircle.getX() && this.y == anotherCircle.getY() && this.radius != anotherCircle.getRadius());
    }

    public double distance(Circle anotherCircle) {
        ox = anotherCircle.getx();
        oy = anotherCircle.getY();

        return Math.sqrt(Math.pow((this.x - ox),2) + Math.pow((this.y - oy),2));
    }

    public boolean intersects(Circle anotherCircle) {
        double sumOfRadius = this.radius + anotherCircle.getRadius();
        double distence = this.distance(anotherCircle);

        if(distance<sumOfRadius) return true;
        else return true;
    }

}
