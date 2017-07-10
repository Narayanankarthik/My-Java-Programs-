import java.io.*;
import java.net.Socket;

public class SMTPClient 
{

public static void main(String[] args) throws Exception { String results = send("localhost",
25,

"sender@somewhere.com",

"localhost/localdomain", "Test Email",

"<b>You got mail!</b>"); System.out.println(results);

}


public static String send(String host,int port,String from,String to,String subject, String message) throws Exception

{

StringBuffer buffer = new StringBuffer(); try {

Socket smtpSocket = new Socket(host, port); DataOutputStream output = new

DataOutputStream(smtpSocket.getOutputStream());

BufferedReader input =new BufferedReader(new InputStreamReader( new

DataInputStream(smtpSocket.getInputStream()))); try {

read(input, buffer);

send(output, "HELO localhost.localdomain\r\n", buffer); read(input, buffer);



send(output, "MAIL FROM: " + from + "\r\n", buffer); read(input, buffer);

send(output, "RCPT to: " + to + "\r\n", buffer); read(input, buffer);

send(output, "DATA\r\n", buffer); read(input, buffer);

send(output, "Subject: " + subject + "\r\n", buffer); send(output, message, buffer);

send(output, "\r\n.\r\n", buffer);

read(input, buffer);

smtpSocket.close();

}

catch (IOException e) {

System.out.println("Cannot send email as an error occurred.");
}

}

catch (Exception e) 
{ System.out.println("Host unknown");

}










