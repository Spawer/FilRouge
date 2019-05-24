package fr.vaelia.questionnaire;

public class AnswerMCQ extends Answer{

	private PropositionMCQ propositionSelected; // mettre une classe fille ex: PropositionMCQ
	
	public AnswerMCQ(Questionnaire questionnaire, Question question, PropositionMCQ proposition) {
		super(questionnaire, question);
		this.propositionSelected=proposition;
	}


	public String getAnswer() {
		return propositionSelected.getStatement();
	}

	public void setAnswer(PropositionMCQ answer) {
		this.propositionSelected = answer;
	}

}
