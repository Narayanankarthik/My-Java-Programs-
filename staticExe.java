package exeprograms;

class staticExe
{
	static int a=0;
	int b;
	static 
	{
		System.out.println("static 2 block executed");
		
	}
	static 
	{
		System.out.println("static block executed");
		
	}
	
	public staticExe()
	{
		a=2;
	}
	
	public static void main(String args[])
	{
		
		String s="hello";
		s.concat("ww");
		staticExe obj = new staticExe();
		obj.b=1;
		System.out.println("a is : "+a+" S : "+s);
		
	}
	
}
