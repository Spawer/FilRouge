package fr.vaelia.questionnaire;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.vaelia.questionnaire.Question.QuestionType;

public class Candidate {
	private String firstName;
	private String lastName;
	private String email;
	//private List<QuestionnaireAnswer> questionnairesAnswered = new ArrayList<>();
	private Map<Questionnaire,List<Answer>> questionnairesAnswered = new HashMap();
	
	public Candidate() {
	}
	public Candidate(String firstName) {
		this.firstName=firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Answer> getQuestionnairesAnsweredFromQuestionnaire(Questionnaire questionnaire) {
		return questionnairesAnswered.get(questionnaire);
	}
	
	public Map<Questionnaire,List<Answer>> getQuestionnairesAnswered() {
		return questionnairesAnswered;
	}
	
	public void setQuestionnairesAnswered(Questionnaire questionnaire, List<Answer> answers) {
		questionnairesAnswered.put(questionnaire, answers);
	}
	
	public void removeQuestionnairesAnswered(Questionnaire questionnaire) {
		questionnairesAnswered.remove(questionnaire);
	}
	
	public void createAnswer(Questionnaire questionnaire, Question question, Proposition proposition) {
		Answer answer = new AnswerMCQ(questionnaire,question, (PropositionMCQ) proposition);
		addAnswer(answer, questionnaire);		
	}
	
	public void createAnswer(Questionnaire questionnaire, Question question) {
		Answer answer = new AnswerOpen(questionnaire,question);
		addAnswer(answer, questionnaire);
	}
	
	public void addAnswer(Answer answer, Questionnaire questionnaire) {
		if(questionnairesAnswered.containsValue(questionnaire)) {
			List<Answer> answers = questionnairesAnswered.get(questionnaire);
			answers.add(answer);
			questionnairesAnswered.remove(questionnaire);
			questionnairesAnswered.put(questionnaire, answers);
		}else {
			List<Answer> answers = new ArrayList<>();
			answers.add(answer);
			questionnairesAnswered.put(questionnaire, answers);
		}
	}
}
