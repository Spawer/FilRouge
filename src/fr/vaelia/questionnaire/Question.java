package fr.vaelia.questionnaire;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Question to create the questions for the questionnaires and their
 * manegement.
 * 
 * @author Isabel and Adrian
 * @version 1.0
 * 
 */
public class Question {

	// Defining an enum for classificating the kind of questions.
	public static enum QuestionType {
		MCQ, OPEN, PROGRAMMING
	}

	String statement;
	private QuestionType type;
	private int timer;
	// List propositions keeps all the possible answers to the question.
	private List<Proposition> propositions = new ArrayList<Proposition>();

	/**
	 * Constructor of class Question.
	 * 
	 * @param statement The {@code String} represents the question text that it will be asked to the
	 *                  candidate.
	 * @param timer  	The {@code int} is a variable that permets to control the answer time for each
	 *                  question.
	 * @param type      The {@code QuestionType} of questions that it is posible to generate.
	 */
	public Question(String statement, int timer, QuestionType type) {
		this.statement = statement;
		this.type = type;
		this.timer = timer;
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

	public Proposition getProposition(int index) {
		return propositions.get(index);
	}

	/**
	 * Adds an existing proposition of answer on the question.
	 * @param proposition The {@code Proposition} to add.
	 */
	public void addProposition(Proposition proposition) {
		propositions.add(proposition);
	}

	/**
	 * Removes the proposition at the specified index. 
	 * @param index the index of the {@code Proposition} value. 
	 */
	public void removePropositionByIndex(int index) {
		propositions.remove(index);
	}

	/**
	 * Removes the first occurence of proposition in the list of question's propositions.
	 * @param proposition The {@code Proposition} to be remove.
	 */
	public void removePropositionByQuestion(Proposition proposition) {
		propositions.remove(proposition);
	}

	public QuestionType getType() {
		return type;
	}

	public void setType(QuestionType type) {
		this.type = type;
	}

	/**
	 * Creates a new proposition and its statement.
	 * @param statement the {@code String} represents the answer statement.
	 * @return the new proposition created.
	 */
	public Proposition createProposition(String statement) {
		Proposition p = new Proposition(statement);
		propositions.add(p);
		return p;
	}

	/**
	 * Creates a new Multi Choice Questions (MCQ) proposition, its statements and if the proposition is right. 
 	 * @param statement the {@code String} represents the answer statement.
	 * @param isRight the {@code boolean} define if the proposition is true or false.
	 * @return the new MCQ proposition created.
	 */
	public PropositionMCQ createProposition(String statement, boolean isRight) {
		PropositionMCQ p = new PropositionMCQ(statement, isRight);
		propositions.add(p);
		return p;
	}
}
