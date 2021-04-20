package Homework3_9;

public class Main {
    public static void main(String[] args){
        Circle a = new Circle(1,1,4);
        Pentagon b=new Pentagon(1,1,3);
        Square c=new Square(1,1,2);
        Triangle d=new  Triangle(1,2,1,3,2,3);
        System.out.println("圆的周长为"+a.Perm()+"圆的面积为"+a.Area());
        System.out.println("正五边形的周长为"+b.Perm()+"正五边形的面积为"+b.Area());
        System.out.println("正方形的周长为"+c.Perm()+"正方形的面积为"+c.Area());
        System.out.println("三角形的周长为"+d.Perm()+"三角形的面积为"+d.Area());
    }
}
