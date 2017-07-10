class Sar{
Sar A1(Sar 5)
{
system.out.println(s);
return(s);
}
Sar A2(int a,Sar s){
system.out.println(a);
return s;
}
public static void main(String[] arg){
Sar A=new Sar();
A.A1(A);
A.A2(5,A);
}
}
