package com.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueProducerConsumer {
	public static void main(String[] args) {

		BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(4);

		Producer producer = new Producer(blockingQueue);
		Consumer consumer = new Consumer(blockingQueue);

		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);

		producerThread.start();
		consumerThread.start();
	}
}
