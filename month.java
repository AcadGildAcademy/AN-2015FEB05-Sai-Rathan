import java.io.*;
import java.util.*;
class month
{
public static void main(String args[])throws IOException
{
String str,str1,a="y";
System.out.println("enter the month\n");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
str=br.readLine();
switch(str)
{
case "january":
case "march":
case "may":
case "july":
case "august":
case "october":
case "december":
System.out.println("This month has 31 days");
break;
case "april":
case "june":
case "september":
case "november":
System.out.println("This month has 30 days");
break;
case "february":
System.out.println("If it is a leap year press 'y' else press 'n'\n");
str1=br.readLine();
System.out.println(str1);
if(str1.equals("y"))
System.out.println("This month has 29 days");
else
System.out.println("This month has 28 days");
break;
}
}
}