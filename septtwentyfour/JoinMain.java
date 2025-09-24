package com.tns.septtwentyfour;

public class JoinMain {

	public static void main(String[] args) {
		for(int i =0;i<3;i++) {
		JoinMethod obj = new JoinMethod(i);
		Thread myThread = new Thread(obj);
		myThread.start();
		try {
			myThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}

}
