import java.net.*;
import java.io.*;
public class PO3Client
{
public static void main(String[] argc)
{
Socket soc=new Socket();
PrintStream output;
DataInputStream input;
String response;
try
{
input=new DataInputStream(new BufferedInputStream(soc.getInputStream()));
output=new PrintStream(new BufferedOutputStream(soc.getOutputStream()),true);
System.out.println("Client Establishing Connection with server");
response=input.readLine();
System.out.println("From Server..."+response);
output.println("USER xyz");
response=input.readLine();
System.out.println("From Server...."+response);
output.println("PASS blabla");
response=input.readLine();
System.out.println("From Server..."+response);
output.println("LIST 1");
response=input.readLine();
System.out.println("From Server..."+response);
output.println("RETR 1");
response=input.readLine();
System.out.println("From Server..."+response);
output.println("quit");
response=input.readLine();
System.out.println("From Server..."+response);
soc.close();
System.out.println("Client Closing Connection with server");
}
catch(Exception e)
{
System.out.println("Error in Connecting to Port");
}
}
}
