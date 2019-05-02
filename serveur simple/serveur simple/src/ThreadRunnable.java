import java.io.*;
import java.net.*;

public class ThreadRunnable implements Runnable{
	protected Socket clientSoc = null;
	public ThreadRunnable(Socket clientSoc) {
		this.clientSoc =  clientSoc;
	}
	public void run() {
		
		try {
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSoc.getInputStream()));
		PrintWriter out = new PrintWriter(clientSoc.getOutputStream(),true);
		String text;
		text = in.readLine();
		System.out.println("client says: " + text);
		out.println("thanks for the message!");
		
		}catch(IOException e) {
			e.printStackTrace();
		} 
		
		
	}
}

