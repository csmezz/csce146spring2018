package csmezz.csce146.triviadb;

public class TriviaQuestion implements Question {
	private String question_text;
	private String answer_text;
	private String category_text;
	private int value;

	public TriviaQuestion() {
		question_text = new String();
		answer_text = new String();
		category_text = new String();
		value = 0;
	}

	public TriviaQuestion(String new_question_text, String new_answer_text, String new_category_text, int new_value) {
		question_text = new_question_text;
		answer_text = new_answer_text;
		category_text = new_category_text;
		value = new_value;
	}

	@Override
	public String getQuestionText() {
		return question_text;
	}

	@Override
	public boolean setQuestionText(String new_text) {
		question_text = new_text;
		return true;
	}

	@Override
	public String getAnswerText() {
		return answer_text;
	}

	@Override
	public boolean setAnswerText(String new_text) {
		answer_text = new_text;
		return true;
	}

	@Override
	public String getCategoryText() {
		return category_text;
	}

	@Override
	public boolean setCategoryText(String new_text) {
		category_text = new_text;
		return true;
	}

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public boolean setValue(int new_value) {
		value = new_value;
		return true;
	}
	
}
