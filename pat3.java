import  java.io.*;
class pat3
{
public static void main(String args[])
{
int c,c1;
for(c=10;c<=50;c++)
{
for(c1=50;c1>=c;c1--)
{
System.out.print(+c1);
}
System.out.println();
}
} }