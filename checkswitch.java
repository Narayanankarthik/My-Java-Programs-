import java.lang.*;
import java.io.*;
import java.math.*;
 
class Checkswitch
{
public void series()
{
int i,a,b=1,n=100;
for(i=3;i<=n;i++)
{
if(i==3)
{
System.out.println("The value of b is: 1 ");
}
b=b+i;
System.out.println("The values is"+b);
}
}
public void overload()
{
int i,a,b=1,n=100;
for(i=3;i<=n;i++)
{
if(i==3)
{
System.out.println("The value of b is: 1 ");
}
b=b+i;
System.out.println("The values is"+b);
}
}

public void ternary()
{
int a,b;
a=10;
b=(a==1)?20:30;
System.out.println("value of b is :"+b);
b=(a==10)?20:30;
System.out.println("value of b is :"+b);
}
public void unaryop()
{
double x,y,a,b;
a=10;
b=12;
x=-a / -b;
y=-b * -a;
System.out.println("The x value is:"+x);
System.out.println("The x value is:"+x);
}

}




class  checkswitch
{

public static void main(String args[])
{
int i;
Checkswitch chk=new Checkswitch();
System.out.println("implementation of switch case:");
for(i=0;i<5;i++)
{
switch (i)
{
case 1: chk.series();
case 2: chk.overload();
case 3: chk.ternary();
case 4: chk.unaryop();
case 5: System.out.println("No i value");

}
}
}

 }
 