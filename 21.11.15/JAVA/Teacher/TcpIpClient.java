import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class TcpIpClient {

	public static void main(String[] args) {
		
		String serverIP = "192.168.0.17";
		
		Socket socket = null;
		try {
			
			socket = new Socket(serverIP,7777);
			
			System.out.println("서버에 연결되었습니다.");				
			
			Sender   sender   = new Sender(socket);
	        Receiver receiver = new Receiver(socket);

	        sender.start();
	        receiver.start();		
			
			
		} catch (Exception e) {
			
		}

	}

}
