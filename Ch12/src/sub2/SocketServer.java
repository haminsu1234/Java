package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 날짜 :2023/07/06
 * 이름 : 하민수
 * 예제 : 소켓 프로그래밍 실습하기
 */

public class SocketServer {

	public static void main(String[] args) {
		
		System.out.println("[Server]"); 
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			
			System.out.println("연결대기...");
			Socket socket =serverSocket.accept();
			
			System.out.println("연결수립...");
			//데이터 송신(Server -> Client 데이터 송신)
			OutputStream os = socket.getOutputStream();
			String msg ="Hello Client!";
		
			byte[] msgBytes = msg.getBytes();
			os.write(msgBytes);
			os.flush();
			
			System.out.println("데이터 송신완료...");
			
			//데이터 수신(Client -> Server 데이터송신)
			InputStream is =socket.getInputStream();
			byte[] bytes =new byte[100];
			int readBytes =is.read(bytes);	
			
			String result = new String(bytes,0, readBytes, "UTF-8");
			System.out.println(result);
			
			System.out.println("데이터 수신 완료...");
			
			os.close();
			is.close();
			socket.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
		
		System.out.println("Server서버종료...."); 
		
	}
	
}
