class Bank{

public void rule(){
System.out.println("invoking rule method");
}

protected  static int rateInt(){
int  a =8;
System.out.println("int method invoked");
return a;
}


}

class T12th extends Bank{


protected static int rateInt(){
int  a =9;
System.out.println("int method invoked");
return a;
}

public static void main(String as[]){
Bank e = new T12th ();


e.rule();
int k = e.rateInt();

System.out.println("Int rate is " + k);
}






}
