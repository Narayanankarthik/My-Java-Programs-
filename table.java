class tables
{
int i;
void tables()
{
System.out.println("Tables program,");
for(i=0;i<16;i++)
{
System.out.println(i*1+i*2+i*3);
System.out.println(i*2);
System.out.println(i*3);
System.out.println(i*4);

}
}
}
class table
{
public static void main(String args[])
{
tables obj=new tables();
obj.tables();
}
}


 