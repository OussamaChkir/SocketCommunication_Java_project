import java.io.*;
import java.net.*;
public class socketClass {

	public static void main(String[] args) {
		try {
		ServerSocket ss = new ServerSocket(1234);
		System.out.println("waiting for connexion");
		Socket s =ss.accept();
		System.out.println("am connected to  a client");
		InputStream is = s.getInputStream();
		OutputStream os= s.getOutputStream();
		
		System.out.println("waiting for a number ");
		int nb = is.read();
		System.out.println("i multiply by 5 ");
		int rep = nb*5;
		System.out.println("am sending the response ");
		os.write(rep);
		s.close();
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
}
