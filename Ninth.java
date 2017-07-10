





class Ninth{


public int m1(long a, int b){
System.out.println("I am in 2-args - Long");
return 1;
}


public void m1(int a, int b){
System.out.println("I am in 2-args - Int");

}




public static void main(String as[]){
Ninth e = new Ninth();


e.m1(10,20);


}




}
