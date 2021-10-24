package com.multithreading;

public class InterviewLock {
	private String interviewRound;
	private String interviewPlace;
	private String interviewBatch;
	
	public String getInterviewRound() {
		return interviewRound;
	}

	public void setInterviewRound(String interviewRound) {
		this.interviewRound = interviewRound;
	}

	public String getInterviewPlace() {
		return interviewPlace;
	}

	public void setInterviewPlace(String interviewPlace) {
		this.interviewPlace = interviewPlace;
	}

	public String getInterviewBatch() {
		return interviewBatch;
	}

	public void setInterviewBatch(String interviewBatch) {
		this.interviewBatch = interviewBatch;
	}

	public InterviewLock(String interviewRound, String interviewPlace, String interviewBatch) {
		super();
		this.interviewRound = interviewRound;
		this.interviewPlace = interviewPlace;
		this.interviewBatch = interviewBatch;
	}

	public void giveInterview(String candidateName)
	{
			synchronized(candidateName) {
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
