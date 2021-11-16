package java_chat;

import java.net.Socket;

public class TcplpClient {
	public static void main(String[] args) {
		
		String serverIp ="192.168.0.9";
		Socket socket = null;
		
		try {//192.168.0.9

			
			
			//기다릴 필요가 없기 때문에 ip 뿌려버려
			
			//소켓을 생성하여 연결을 요청한다.
			//Socket socket = new Socket("192.168.0.9", 7777);
			socket = new Socket(serverIp, 7777);
			//전화걸렸으면 포트번호 떄려버려 7777 
			
			System.out.println("서버에 연결되었습니다.");
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();

	
		    } catch(Exception e) {
		        e.printStackTrace();  
		    }  
	
		
		
	}
}
