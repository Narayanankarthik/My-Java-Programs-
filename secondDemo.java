


class secondDemo{


int j=10;

int k=20;
  
  
static int p = 20;

public static void main(String[] args){
   
System.out.println("P values is " + p); 

secondDemo sd = new secondDemo();
sd.myMethod();
sd.myMethod();
System.out.println("using object J values is " + sd.j);

System.out.println("class variable p value " + secondDemo.p);

secondDemo.myStaticMethod();
}
 

public void myMethod() {
j=30;
k=40;
System.out.println("J values is " + j);
System.out.println("K values is " + k);

int l=10;
System.out.println("l values is " + l);
l=20;
System.out.println("P values is " + p);

int m=9;
System.out.println("m values is " + m);


}
public static  void myStaticMethod() {
System.out.println("I am in static method");
}


}
