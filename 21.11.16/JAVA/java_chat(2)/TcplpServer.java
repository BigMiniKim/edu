package java_chat;
//그냥 암기해

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



//3차로 생성
class Receiver extends Thread {// 반드시 스레드로

	Socket socket;
	DataInputStream in;

	Receiver(Socket socket) {
		this.socket = socket;

		try {

			in = new DataInputStream(socket.getInputStream());
			//소캣안에 빨대 있어

		} catch (Exception e) {

		}

	}

	public void run() {
		while (in != null) {
			try {
				System.out.println(in.readUTF());
				//내부적으로는 상대방이 오는거 while으로 기다리고 있어
				//상대방이 글 치고 enter 치면 그거 딱 받아서 뿌려버림
			} catch (Exception e) {

			}
		} // run
	}
}

// 2차로 생성
class Sender extends Thread {// 반드시 스레드로
	// 전화기 받아와야하니까
	Socket socket;
	DataOutputStream out;
	BufferedOutputStream bout;
	String name;

	Sender(Socket socket) {
		this.socket = socket;
		try {
			bout = new BufferedOutputStream(socket.getOutputStream());
			out = new DataOutputStream(bout);
			
			//빨대 가져오는데 빨대가 socket안에 있음
			//out = new DataOutputStream(socket.getOutputStream());
			
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
		} catch (Exception e) {

		}
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);

		while (out != null) {
		//끝내는 조건이 없음. 영원히 돌아감
			try {
				out.writeUTF(name + scanner.nextLine());
				//스캐너쪽으로 제어권이 넘어가고 채팅을 치면 
				//out writeUTF가 또 돌아감 그렇게 while문 계속 돌아가
				//스레드 start()가 아니고 걍 run()이면 무한루프가 됨
				//상대방에서 나한테 오는 receiver가 캐치를 못함
				//그래서 스레드로 안할 수 없음. while문으로 돌리니까 
				//스레드란 동시에 프로그래밍을 실행시키는 것
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}


}

//1차로 생성
public class TcplpServer {
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(7777);
			//서버소캣 객체생성할떄 괄호 안에 포트번호 넣음
			// 7777이 포트 번호=프로그램번호 개발자 맘대로 넣으면 됨
			// 7777에서 기다리겠다.

			socket = serverSocket.accept();
			//기다리는 소스
			//누군가가 치고 들어오면 SOCKET(전화기)를 스윽 꺼내줌

			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);

			sender.start(); // start인거 보니까 쓰레드
			receiver.start();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
