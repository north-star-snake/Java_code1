package Homework3_9;

public class Circle {
    float x;
    float y;
    float r;
    Circle(float a,float b,float c){
        x = a;
        y = b;
        r = c;
    }
    public double Perm(){
        return 2*3.14*r;
    }

    public double Area(){
        return 3.14*r*r;
    }
}
