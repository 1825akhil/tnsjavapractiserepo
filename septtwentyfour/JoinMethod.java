package com.tns.septtwentyfour;

public class JoinMethod implements Runnable{
	private int threadNumber;
	public JoinMethod(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	@Override
	public void run() {
		for(int i=1; i<=5;i++)
		System.out.println(i + " from thread Number" + threadNumber);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
