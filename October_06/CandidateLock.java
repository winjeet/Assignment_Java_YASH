package com.multithreading;

import java.util.concurrent.locks.Lock;

public class CandidateLock implements Runnable {

	private String candiateName;
	private InterviewLock interviewLock;
	Lock lock;

	public CandidateLock(String candiateName, InterviewLock interviewLock, Lock lock) {
		super();
		this.candiateName = candiateName;
		this.interviewLock = interviewLock;
		this.lock = lock;
	}

	@Override
	public void run() {
		System.out.println(candiateName + " is waiting in the queue");
		synchronized (interviewLock) {
			lock.lock();
			interviewLock.giveInterview(candiateName);
			lock.unlock();
		}
	}

}
