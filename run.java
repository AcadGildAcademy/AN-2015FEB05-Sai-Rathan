import java.io.*;
import java.util.*;
public interface Shape
{
double getArea();
void draw();
}
class Square implements Shape
{
int side;
Square(int a)
{
side=a;
}
double getArea()
{
return (side*side);
}
void draw()
{
System.out.println("Square drawn\n");
}
}
class Rectangle implements Shape
{
int l,b;
Rectangle(int a,int y)
{
l=a;
b=y;
}
double getArea()
{
return (l*b);
}
void draw()
{
System.out.println("Rectangle drawn\n");
}
}
class Circle implements Shape
{
int r;
Circle(int r)
{
this.r=r;
}
double getArea()
{
return (3.14*r*r);
}
void draw()
{
System.out.println("Circle drawn\n");
}
}
class Run
{
public static void main(String args[]) throws IOException
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter side of square\n");
int i=sc.nextInt();
Square s=new Square(i);
s.draw();
System.out.println("The area of square is "+s.getArea());
System.out.println("Enter the length and bredth of rectangle");
int l=sc.nextInt();
int b=sc.nextInt();
Rectangle r=new Rectangle(l,b);
r.draw();
System.out.println("The area of rectangle is "+r.getArea());
System.out.println("Enter the radius of the circle\n");
int r=sc.nextInt();
Circle c=new circle(r);
c.draw();
System.out.println("The area of the circle is"+c.getArea());
}
}