package fr.vaelia.questionnaire;

public abstract class Answer {
	private Question question;
	// à vérifier dans le déroulement de l'application si c'est pertinent de le laisser
	private Candidate candidate;
	private Questionnaire questionnaire;

	public Answer(Questionnaire questionnaire,Question question){
		this.question=question;
		this.questionnaire=questionnaire;
	}
	
	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}
	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}	
	
	public Question getQuestion(){
		return this.question;
	}
	public void setQuestion(Question question) {
		this.question=question;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	
	public String getAnswer() {
		// à définir dans les classe filles pour savoir comment on fait
		return "";
	}
	
	public void createProposition() {
		
	}
}
