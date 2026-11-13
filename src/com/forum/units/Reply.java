package com.forum.units;

public class Reply extends AbstractEntity {

	private String message;
	private User user;
	private Question question;
	private static Long lastEntry = 0L;

	@Override
	public void autoGenerateId() {
		lastEntry = lastEntry + 1L;
		setId(lastEntry);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
}
