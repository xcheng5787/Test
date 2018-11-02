package com.xcheng.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPservice {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(6666);
		Socket s = server.accept();
		InputStream ins = s.getInputStream();
		OutputStream ots = s.getOutputStream();
		ots.write("何以解忧,唯有暴富".getBytes());
	}
}
