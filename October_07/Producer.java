package com.multithreading;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<Integer> blockingQueue;

	public Producer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				blockingQueue.put(i);
				System.out.println("Produced " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
