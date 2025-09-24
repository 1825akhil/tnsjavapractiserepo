package com.tns.septtwentyfour;

public class WaitMethod{
	private int data;
	private boolean hasData;
	public synchronized void produce(int value) {
		while(hasData) {
			try {
				wait();
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}			
		}
		data=value;
		hasData=true;
		System.out.print("Produced: "+value);
		notify();
	}
	public synchronized int consume() {
		while(!hasData) {
			try {
				wait();
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}			
		}
		
		hasData=false;
		System.out.print("Consumed: "+data);
		notify();
		return data;
	}
}
