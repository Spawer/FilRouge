package fr.vaelia.questionnaire;

public class PropositionMCQ extends Proposition{
	
	private boolean isRight;
	
	public PropositionMCQ(String statement, boolean isRight) {
		super(statement);
		this.isRight=isRight;
	}

	public boolean isRight() {
		return isRight;
	}
	public void setRight(boolean isRight) {
		this.isRight = isRight;
	}
}
