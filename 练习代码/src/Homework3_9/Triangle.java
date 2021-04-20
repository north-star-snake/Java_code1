package Homework3_9;
import java.lang.Math;

public class Triangle {
    float ax, ay, bx, by, cx, cy;

    Triangle(float a1, float a2, float b1, float b2, float c1, float c2) {
        ax = a1;
        ay = a2;
        bx = b1;
        by = b2;
        cx = c1;
        cy = c2;
    }

    public double Perm() {
        return Math.sqrt((ax - bx) * (ax - bx) + (ay - by) * (ay - by)) + Math.sqrt((ax - cx) * (ax - cx) + (ay - cy) * (ay - cy)) + Math.sqrt((bx - cx) * (bx - cx) + (by - cy) * (by - cy));
    }

    public double Area() {
        double a = Math.sqrt((ax - bx) * (ax - bx) + (ay - by) * (ay - by));
        double b = Math.sqrt((ax - cx) * (ax - cx) + (ay - cy) * (ay - cy));
        double c = Math.sqrt((bx - cx) * (bx - cx) + (by - cy) * (by - cy));
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}