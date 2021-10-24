package com.multithreading;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> blockingQueue;
	int consume = -1;

	public Consumer(BlockingQueue<Integer> blockingQueue)
    {
        this.blockingQueue = blockingQueue;
    }

	@Override
	public void run() {
		while (consume != 10) {
			try {
				consume = blockingQueue.take();
				System.out.println("Consumed " + consume);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
