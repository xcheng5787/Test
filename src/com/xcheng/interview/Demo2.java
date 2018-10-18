package com.xcheng.interview;

import java.util.Timer;
import java.util.TimerTask;

public class Demo2 {
	public static void main(String[] args) {
		Timer tm = new Timer();
		tm.schedule(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("====设置要执行的任务=====");
			}
		}, 2000);
	}
}
