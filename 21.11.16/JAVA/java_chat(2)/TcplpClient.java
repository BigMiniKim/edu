package java_chat;

import java.net.Socket;

public class TcplpClient {
	public static void main(String[] args) {
		
		String serverIp ="192.168.0.9";
		Socket socket = null;
		
		try {//192.168.0.9

			
			
			//��ٸ� �ʿ䰡 ���� ������ ip �ѷ�����
			
			//������ �����Ͽ� ������ ��û�Ѵ�.
			//Socket socket = new Socket("192.168.0.9", 7777);
			socket = new Socket(serverIp, 7777);
			//��ȭ�ɷ����� ��Ʈ��ȣ �������� 7777 
			
			System.out.println("������ ����Ǿ����ϴ�.");
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();

	
		    } catch(Exception e) {
		        e.printStackTrace();  
		    }  
	
		
		
	}
}
