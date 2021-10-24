package com.multithreading;

public class Interview {
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

	public Interview(String interviewName, String interviewPlace, String interviewBatch) {
		super();
		this.interviewRound = interviewName;
		this.interviewPlace = interviewPlace;
		this.interviewBatch = interviewBatch;
	}
}
