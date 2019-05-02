import java.io.*;
import java.net.*;
public class Server {


	public static void main(String[] args) {
		int portNum = 1234;
		System.out.println("Program is running");
		SocketServer s = new SocketServer();
		s.runServer();
		
	}
}
