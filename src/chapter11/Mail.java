package chapter11;

import java.net.Socket;

import org.omg.CORBA.portable.OutputStream;

public class Mail {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("smtp.example.com", 60025);
		OutputStream os = sock.getOutputStream();
		os.write("GET /HELLO example.com HTTP/1.0¥r¥n".getBytes());
	}
}
