package com.multithreading;

public class Candidate implements Runnable {

	private String candidateName;
	private Interview interview;

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public Interview getInterview() {
		return interview;
	}

	public void setInterview(Interview interview) {
		this.interview = interview;
	}

	public Candidate(String candidateName, Interview interview) {
		super();
		this.candidateName = candidateName;
		this.interview = interview;
	}

	@Override
	public void run() {
		System.out.println(candidateName + " is waiting in the queue.");
		synchronized (interview) {
			System.out.println(candidateName + " entered into the room.");
			System.out.println(candidateName + " interview is going on.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(candidateName + " has done with their interview.");
		}

	}

}
