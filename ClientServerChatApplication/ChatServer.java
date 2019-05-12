package socketprogramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatServer {
	ServerSocket server; //server object
	Socket connection; //client object
	DataInputStream dis; //to get msg from client
	DataOutputStream dos; //to send msg to client
	Scanner sc; //user input
	
	public ChatServer() {
		try {
			server = new ServerSocket(1400,1,InetAddress.getLocalHost()); //port no.,no. of instance,IPaddress of local machine...
			System.out.println("Server started...!!!");
			connection = server.accept(); //functn used to accept req from client
			System.out.println("Request received...!!!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void talk() throws IOException,UnknownHostException {
		
		dis=new DataInputStream(connection.getInputStream()); 
		dos=new DataOutputStream(connection.getOutputStream());
		sc =new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Client: " + dis.readUTF());
			dos.writeUTF(sc.nextLine());
		}
		
	}
	
	public static void main(String[] args) {
		try {
			ChatServer cs = new ChatServer();
			cs.talk();
		}
		catch(Exception e) {
			
		}
		}
}
