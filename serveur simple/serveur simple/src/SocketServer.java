import java.io.IOException;
import java.net.*;

public class SocketServer {
	ServerSocket serverSocket =null;
	static int nbrclient = 0;
	public void runServer() {
		try {
		serverSocket = new ServerSocket(1234);
		System.out.println("server is running");
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (true) {
			try {
				Socket clientSocket = serverSocket.accept();
				ThreadRunnable tr = new ThreadRunnable(clientSocket);
				new Thread(tr).start();
		        System.out.println("Le client numéro "+nbrclient+ " est connecté !");
		        nbrclient++;
		       
		        Thread.sleep(1000);
		        
			} catch (IOException e) {
				e.printStackTrace();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}