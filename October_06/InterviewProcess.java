package com.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class InterviewProcess {
	public static void main(String[] args) {
		InterviewLock interviewLock = new InterviewLock("Technical Interview", "Indore", "CSE/IT-21");
		Lock lock = new ReentrantLock(true);

		synchronized (interviewLock) {

			Thread candidate1 = new Thread(new CandidateLock("Rohit", interviewLock, lock));
			Thread candidate2 = new Thread(new CandidateLock("Priyansh", interviewLock, lock));
			Thread candidate3 = new Thread(new CandidateLock("Rahul", interviewLock, lock));
			Thread candidate4 = new Thread(new CandidateLock("Isha", interviewLock, lock));
			Thread candidate5 = new Thread(new CandidateLock("Anmol", interviewLock, lock));
			Thread candidate6 = new Thread(new CandidateLock("Jeet", interviewLock, lock));
			Thread candidate7 = new Thread(new CandidateLock("Raghav", interviewLock, lock));
			Thread candidate8 = new Thread(new CandidateLock("Rajiv", interviewLock, lock));
			Thread candidate9 = new Thread(new CandidateLock("Sonali", interviewLock, lock));
			Thread candidate10 = new Thread(new CandidateLock("Yash", interviewLock, lock));

			candidate1.start();
			candidate2.start();
			candidate3.start();
			candidate4.start();
			candidate5.start();
			candidate6.start();
			candidate7.start();
			candidate8.start();
			candidate9.start();
			candidate10.start();

		}
	}
}
