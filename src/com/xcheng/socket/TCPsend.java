package com.xcheng.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPsend {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("127.0.0.1", 6666);
		InputStream ins = s.getInputStream();
		OutputStream ots = s.getOutputStream();
		byte[] data = new byte[1024];
		int len = ins.read(data);
		System.out.println(new String(data, 0, len));
	}
}
