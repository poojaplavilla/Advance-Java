package socketprogramming;
import java.util.*;
import java.net.*;
import java.io.*;

public class ChatClient {
	Socket connection; //client object
	DataInputStream dis; //to get msg from server
	DataOutputStream dos; //to send msg to server
	Scanner sc; //user input

	public ChatClient() throws Exception {
		connection = new Socket(InetAddress.getLocalHost(),1400); //IPAddress,port no.
		System.out.println("Request sent...!!!");	
	}
	
	public void talk() {
	try {
	dis=new DataInputStream(connection.getInputStream());
	dos=new DataOutputStream(connection.getOutputStream());
	sc =new Scanner(System.in);
	
	while(true)
	{
		dos.writeUTF(sc.nextLine());
		System.out.println("Server: " + dis.readUTF());
	}
	}
	catch(Exception e) {
	
	}
}
	public static void main(String[] args) {
		try {
			ChatClient cc = new ChatClient();
			cc.talk();
		}
		catch(Exception e) {
			
		}
		}
}
	





