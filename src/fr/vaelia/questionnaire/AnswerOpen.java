package fr.vaelia.questionnaire;

public class AnswerOpen extends Answer{

	String answer;

	public AnswerOpen(Questionnaire questionnaire, Question question) {
		super(questionnaire, question);
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
