package fr.vaelia.questionnaire;

import java.util.ArrayList;
import java.util.List;

public class QuestionnaireAnswer {
	private Questionnaire questionnaire;
	private List<Answer> answers = new ArrayList<>();
	
	
	
	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}
	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}
	
	public Answer  getQuestion(int index) {
		return answers.get(index);
	}

	public void addQuestion(Answer  answer) {
		answers.add(answer);
	}
	
	public void removeQuestionByIndex(int index) {
		answers.remove(index);
	}
	
	public void removeQuestionByQuestion(Answer answer) {
		answers.remove(answer);
	}
	
	
}
