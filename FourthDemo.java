


class FourthDemo{



public static void main(String[] args){
   

int n = 5;

int temp = n;

int s= 0;
int r =0;

while(n > 0) {
r = n % 10;

s = (s*10) + r;
n = n/10;


}
 
System.out.println("My formulated no is " + s);


if ( s == temp) {

System.out.println("Pelnd.  no ");
}

}



}
