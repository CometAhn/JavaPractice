package Ch15_Network_Programming;

import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleServer extends Thread implements ActionListener {// Thread 클래스를 상복받고 ActionListener 인터페이스를 구현하는
																	// SimpleServer 클래스를 정의한다.
	Frame frame; // 필요한 변수를 정의한다.
	TextArea ta;
	TextField tf;
	ServerSocket s;
	Socket s1;
	DataOutputStream dos;
	DataInputStream dis;
	boolean stop;

	public SimpleServer() { // 생성자 안에서 launchFrame() 메소드와 service() 메소드를 호출한다.
		launchFrame();
		service();
	}

	private void launchFrame() { // 변수에 대한 객체를 생성한다.
		frame = new Frame("일대일 채팅실습");
		ta = new TextArea();
		tf = new TextField();
		frame.setBackground(Color.lightGray);
		ta.setEditable(false);

		frame.add(ta, BorderLayout.CENTER);
		frame.add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);

		frame.setSize(500, 300);
		frame.setVisible(true);
		tf.requestFocus();
	}

	private void service() {
		try {
			ta.append("서비스하기 위해 준비중..위해.\n");
			s = new ServerSocket(5430); // 5432 포트 번호를 가진 ServerSocket 클래스의 객체를 생성한다.
			ta.append("클라이언트 접속 대기중...");
			s1 = s.accept(); // accept()메소드를 이용해서 클라이언트의 요청을 기다린다.
			ta.append("클라이언트가 접속하였습니다. : " + s1.getInetAddress() + '\n');

			dos = new DataOutputStream(s1.getOutputStream());
			dis = new DataInputStream(s1.getInputStream());
			this.start(); // 스레드를 start() 메소드로 호출한다.
			dos.writeUTF("채팅 서버에 접속하신걸 환영합니다.!!");
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	public static void main(String args[]) {
		new SimpleServer();
	}

	public void actionPerformed(ActionEvent action) { // 텍스트 필드에 대한 이벤트 처리를 위해 actionPerformed() 메소드를 구현한다.
		try {
			String msg = tf.getText();
			ta.append(msg + '\n');
			if (msg.equals("exit")) {
				ta.append("bye");
				stop = true;
				dos.close();
				s1.close();
				System.exit(0);
			} else {
				dos.writeUTF("서버 : " + msg);
				tf.setText("");
			}
		} catch (IOException io) {
			ta.append(io.toString() + '\n');
		}
	}

	public void run() {
		try {
			while (!stop) { // stop 변수가 true가 될 때 까지 클라이언트에서 전송된 데이터를 입력받는다.
				ta.append(dis.readUTF() + '\n');
			}
			dis.close();
			s1.close();
		} catch (EOFException eof) {
			ta.append("클라이언트로부터 연결이 끊어졌습니다.\n");
		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}
