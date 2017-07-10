import java.io.*;
class forvalue
{
int i;
void check()
{
for(i=0;i<100;i++)
{
System.out.println("The value is :"+i);
}
}
}

class checkinstance extends forvalue
{
public static void main(String args
{
int a,b;
a=10;
b=(a==1)?20:30;
System.out.println("value of b is :"+b);
b=(a==10)?20:30;
System.out.println("value of b is :"+b);
forvalue f=new checkinstance();
boolean value= f instanceof checkinstance;
f.check();
System.out.println("the value is "+value);

}
}

