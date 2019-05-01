import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Socket s = new Socket("localhost",1234);
		InputStream is = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String temp;
		while ((temp=br.readLine())!=null) { //check null reference
		    if (temp.length() == 0)
		        Thread.sleep(100);
		    else
		        System.out.println(" Receiving from server: " + temp);
		}
		
		OutputStream os= s.getOutputStream();
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		System.out.println("read number from keyboard");
		Scanner clavier = new Scanner(System.in);
		int nb = clavier.nextInt();
		System.out.println("sending the number "+ nb +" to server:");
		os.write(nb);
		System.out.println("waiting for server response");
		int rep = is.read();
		System.out.println("the response is : "+rep);
		}catch (Exception e) {
			e.printStackTrace();
		}
	
		
		
		
		

	}

}
