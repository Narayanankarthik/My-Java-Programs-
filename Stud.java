import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.*;


class Stud{
static int a=4127;
int no;

public void details1(int a)throws Exception{
String numberDetails = null;
System.out.println("tagore engineering college");
System.out.println("enter your dept");
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
no=Integer.parseInt(br.readLine());
if(no % 2 == 0 ){
numberDetails = "Even";
}else{
numberDetails = "Odd";
}
System.out.println("you selected the " +no  +  "  and this no is " + numberDetails );

for (int i =1 ; i<=20 ; i++) {
if(i % 2 != 0 ){
System.out.println("this is odd no "+ i );
}
}

}

public boolean primeNo(int p){

for ( int i=2; i< p ; i ++ ){
if (p%i==0){
System.out.println("This no has devided by 2 - " + i);
  return false;
}
}
return true;
}

public static void main(String[] args)throws Exception{
Stud st=new Stud();
System.out.println("displaying college code: ");
System.out.println(a);
int c = 10;
st.details1(c);

boolean b = st.primeNo(10) ;

System.out.println("This is prime "+ b);

}}