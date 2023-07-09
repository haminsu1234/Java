package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 날짜 :2023/07/06
 * 이름 : 하민수
 * 예제 : 채팅 프로그램 실습하기
 */
public class ThreadSender extends Thread {

	private Socket socket;
	
	public ThreadSender(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());

			while(true) {
				
				String msg = br.readLine();
				
				if(msg.equals("bye")) {
					break;
				}
				
				writer.println(msg);
				writer.flush();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
