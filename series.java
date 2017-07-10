import java.io.*;
class numbers
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
System.out.println("The values is"+b);
}
}
}
class series extends numbers
{
public static void main(String args[])
{
void series()
{
int i,a,b=1;
int n=100;

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
numbers num=new numbers();
num.series();
 
}
}

