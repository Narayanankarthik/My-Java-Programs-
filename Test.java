class Native
{ 
	Static 
	{ 
		System.LoadLibrary(“Native library path”); 
	} 
	public native void m();
class Test 
{ 
	public static void main(String[] args) 
	{ 
		Native n = new Native(); 
		n.m(); 
	} 
} 
