
public class StringHandling {

	public String StringHandling()
	{
		String str = new String("Constructor");
		return str;
	}
	static 
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) 
	{
		Sample s = new Sample();
		System.out.println("From Constructor ::-<>"+s.Sample());
		String s1 = new String();
		
		String s2="Hello";
		String s3= new String("Hello");
		if(s2==s3)
		{
			System.out.println("if");
		}
		else
		{
			System.out.println("else");
		}
	}

}
