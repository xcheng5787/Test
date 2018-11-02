package com.xcheng.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DUPsend {
	public static void main(String[] args) throws Exception {
		String str = "约吗?";
		DatagramSocket ds = new DatagramSocket();
		DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length,
				InetAddress.getByName("127.0.0.1"), 6676);
		ds.send(dp);
		ds.close();
	}

}
