import java.io.*;
import java.net.*;
public class HTTP_Request
{
public static void main(String args[])
{
try
{
String Request="www..com";
Socket client_Socket=new Socket(Request,80);
System.out.println("The client is\n"+client_Socket);
Get_Web_Page(client_Socket);
}
catch(UnknownHostException e)
{
System.err.println("UnknownHostException:"+e.getMessage());
}



catch(IOException e)
{
System.err.println("IOExecption:"+e.getMessage());
}
}
public static void Get_Web_Page(Socket client_Socket)
{
try
{
DataOutputStream output=new DataOutputStream(client_Socket.getOutputStream());
DataInputStream input=new DataInputStream(client_Socket.getInputStream());
output.writeBytes("GET/HTTP/1.0\r\n\r\n");
String input_txt;
while((input_txt=input.readLine())!=null)
{
System.out.println(input_txt);
if(input_txt.indexOf("</HTML>")!=-1)
break;
}
output.close();
input.close();
client_Socket.close();
}
catch(Exception e)
{
System.err.println("Exception:"+e.getMessage());
}
}
}




