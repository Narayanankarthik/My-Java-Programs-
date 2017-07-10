class Singlein{

public  int shopping(int a , int b){

int c = a+b;
return c;
}
}


class Singlein1 extends Singlein{
public static void fruits(){
System.out.println("iam the child class");}
public static void main(String[] args){
Singlein1 s=new Singlein1();
s.fruits();
int ss = s.shopping(10,21);
if(ss%2==0){
System.out.println("even no " +ss);

}
}
}