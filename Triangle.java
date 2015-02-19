import java.io.*;
class Rectangle
{
Rectangle(int x,int y)
{
}
}
class Triangle extends Rectangle
{
int l,b;
double area;
Triangle(int a,int b)
{
super(a,b);
l=a;
this.b=b;
}
double area(int i)
{
if(i==1)
area=l*b;
else
area=0.5*l*b;
return area;
}
public static void main(String args[]) throws IOException
{
String s;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1 for Rectangle area or 0 for triangle\n");
s=br.readLine();
int i=Integer.parseInt(s);
System.out.println("Enter the length and height\n");
s=br.readLine();
int a=Integer.parseInt(s);
s=br.readLine();
int b=Integer.parseInt(s);
Triangle t=new Triangle(a,b);
System.out.println("The area is "+t.area(i));
}
}