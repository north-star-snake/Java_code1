package Homework3_9;

public class Pentagon {
    float x,y,l;
    Pentagon(float a,float b,float c)
    {
        x=a;
        y=b;
        l=c;
    }
    public double Perm() {
        return 5*l;
    }
    public double Area(){
        return 1.72*l*l;
    }
}
