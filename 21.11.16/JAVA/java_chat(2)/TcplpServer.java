package java_chat;
//�׳� �ϱ���

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



//3���� ����
class Receiver extends Thread {// �ݵ�� �������

	Socket socket;
	DataInputStream in;

	Receiver(Socket socket) {
		this.socket = socket;

		try {

			in = new DataInputStream(socket.getInputStream());
			//��Ĺ�ȿ� ���� �־�

		} catch (Exception e) {

		}

	}

	public void run() {
		while (in != null) {
			try {
				System.out.println(in.readUTF());
				//���������δ� ������ ���°� while���� ��ٸ��� �־�
				//������ �� ġ�� enter ġ�� �װ� �� �޾Ƽ� �ѷ�����
			} catch (Exception e) {

			}
		} // run
	}
}

// 2���� ����
class Sender extends Thread {// �ݵ�� �������
	// ��ȭ�� �޾ƿ;��ϴϱ�
	Socket socket;
	DataOutputStream out;
	BufferedOutputStream bout;
	String name;

	Sender(Socket socket) {
		this.socket = socket;
		try {
			bout = new BufferedOutputStream(socket.getOutputStream());
			out = new DataOutputStream(bout);
			
			//���� �������µ� ���밡 socket�ȿ� ����
			//out = new DataOutputStream(socket.getOutputStream());
			
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
		} catch (Exception e) {

		}
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);

		while (out != null) {
		//������ ������ ����. ������ ���ư�
			try {
				out.writeUTF(name + scanner.nextLine());
				//��ĳ�������� ������� �Ѿ�� ä���� ġ�� 
				//out writeUTF�� �� ���ư� �׷��� while�� ��� ���ư�
				//������ start()�� �ƴϰ� �� run()�̸� ���ѷ����� ��
				//���濡�� ������ ���� receiver�� ĳġ�� ����
				//�׷��� ������� ���� �� ����. while������ �����ϱ� 
				//������� ���ÿ� ���α׷����� �����Ű�� ��
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}


}

//1���� ����
public class TcplpServer {
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(7777);
			//������Ĺ ��ü�����ҋ� ��ȣ �ȿ� ��Ʈ��ȣ ����
			// 7777�� ��Ʈ ��ȣ=���α׷���ȣ ������ ����� ������ ��
			// 7777���� ��ٸ��ڴ�.

			socket = serverSocket.accept();
			//��ٸ��� �ҽ�
			//�������� ġ�� ������ SOCKET(��ȭ��)�� ���� ������

			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);

			sender.start(); // start�ΰ� ���ϱ� ������
			receiver.start();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
