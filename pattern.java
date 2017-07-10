import java.io.*;
class pattern 
{
public static void main(String args[])
{
int i;
for(i=0;i<11;i++)
{
System.out.println(+i);


if(i==10)
{
System.out.println("\t");
i=2;
for(i=2;i<11;i++)
{
System.out.println(+i);


}
i++;

}
}
}
}



