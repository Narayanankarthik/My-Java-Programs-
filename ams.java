class ams{
 
public static int armstrong(int b){
int temp=b;
int sum=0;

while(temp > 0)
{
int u=temp%10;
sum=sum +(u*u*u);
temp=temp/10;

}

if(sum==b){
System.out.println("the entered no is armstrong  number");
}
else{
System.out.println("not a armstrong number"); }
return 1000;
}
public static void main(String[] args){
armstrong(3710);
}}