import java.io.*;
class increment
{
public static void main(String args[])
{
int i,j,a=1,b=2,k;
for(i=0;i<16;i++)
{
j=++i*a;
System.out.println("j is "+j);
for(j=j;j<16;j++)
{
k=i++*b;
System.out.println("k is "+k);
}
}
}
}


