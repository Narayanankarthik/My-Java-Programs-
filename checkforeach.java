import java.io.*;
import java.util.*;

class checkforeach
{
public static void main(String args[])
{

int nums[]={1,2,3,4,56,6,7,78,9};
int sum=0;
for(int x: nums)
{
System.out.println("value is :" +x);
sum += x;
}
System.out.println("value is :" +sum);
}
}




