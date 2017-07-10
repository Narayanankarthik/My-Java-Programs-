import java.io.*;
class method
{
void series()
{
int i,a,b=1,n=100;
for(i=3;i<=n;i++)
{
if(i==3)
{
System.out.println("The value of b is: 1 ");
}
b=b+i;
System.out.println("The value of b is:  "+b);

}

}
void series(int b,int n)
{
int i,a,c;

for(i=3;i<=n;i++)
{
if(i==3)
{
System.out.println("The value is :"+i);
System.out.println("The value of c is: 1 ");
}
c=b+i;
System.out.println("The value of c is:  "+c);
}
}
public static void main(String args[])
{
method ovrld=new method();
ovrld.series();
ovrld.series(1,100);

}

}





