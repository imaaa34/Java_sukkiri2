package chapter11;

import java.net.ServerSocket;
import java.net.Socket;

public class Mail {
	public static void main(String[] args) throws Exception {
		ServerSocket svSock = new ServerSocket(60025);
		Socket sock = svSock.accept();
	}
}
