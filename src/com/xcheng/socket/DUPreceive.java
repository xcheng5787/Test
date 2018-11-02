package com.xcheng.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DUPreceive {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(6676);
		DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
		ds.receive(dp);
		byte[] data = dp.getData();
		int len = dp.getLength();
		String str = new String(data, 0, len);
		System.out.println(str);
	}
}
