


class Seventh{


{
int i =10;
System.out.println("I am in instance block" + i);

}

static{
int i =10;
System.out.println("I am in static block" + i);

}
public Seventh(){

System.out.println("I am in const.");

}


public static void main(String[] args){

 System.out.println("I am in main method");
Seventh s = new Seventh();
Seventh s1 = new Seventh();


}



}
