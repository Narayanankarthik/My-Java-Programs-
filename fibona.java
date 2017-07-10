class fibona
{
public static void main(String args[])
{
int i,next,frst=0,scnd=1;
int terms=10;
for(i=0;i<terms;i++)
{
if(i<=1)
{
next=i;
}
else
{
next=frst+scnd;
frst=scnd;
scnd=next;
}
System.out.println(next);
}
}
}


