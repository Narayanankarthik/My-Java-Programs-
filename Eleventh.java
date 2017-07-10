class Bank{

public void rule(){
System.out.println("invoking rule method");
}

int rateInt(){
int  a =8;
System.out.println("int method invoked");
return a;
}


}

class Eleventh extends Bank{


/*protected  int rateInt(){
int  a =9;
System.out.println("int method invoked");
return a;
}*/

public static void main(String as[]){
Bank e = new Eleventh();
//Eleventh e = new Bank(); wrong 

e.rule();
int k = e.rateInt();

System.out.println("Int rate is " + k);
}






}
