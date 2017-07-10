class Conversation{
public int m1(){
System.out.println("talk with confidence");
return 1000;
}
}
class Talk extends Conversation{
public void m2(){
System.out.println("interaction is very important");
}}
class Communication extends Conversation{
public void m3(){
System.out.println("communicate with others");}
public static void main(String[] args){
Communication co=new Communication();
co.m3();
co.m1();
Talk ta=new Talk();
ta.m2();
ta.m1();
}
} 