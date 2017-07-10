class Actor1{
int a=10;
class Rajini extends Actor1{
public void m1(){
System.out.println("Iam the Super star!!");}
}
class Simbu extends Rajini{
public void m2(){
System.out.println("iam the little super star");
}}
public static void main(String ar[]){
Simbu s=new Simbu();
s.m1();
s.m2();
System.out.println(s.a);
}}