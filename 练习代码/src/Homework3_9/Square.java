package Homework3_9;

public class Square {
    float x,y,l;
    Square(float a,float b,float c){
        x = a;
        y = b;
        l = c;
    }
    double Perm(){
        return 4*l;
    }

    double Area(){
        return l*l;
    }
}
