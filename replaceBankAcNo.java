package exeprograms;

public class replaceBankAcNo {

	public static void main(String args[])
	{
		StringBuilder s= new StringBuilder("5000030855");
		for(int i=0;i<(s.length()-5);i++)
		{
			s.setCharAt(i, 'X');
		}
		
		System.out.println("Bank Ac No :"+s);
		System.out.println("Reverse "+s.reverse());
		s.trimToSize();
		System.out.println(s);
		}
}
