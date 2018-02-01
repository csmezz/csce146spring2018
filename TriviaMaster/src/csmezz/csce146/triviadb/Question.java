package csmezz.csce146.triviadb;
public interface Question {
	
	public String getQuestionText();
	public boolean setQuestionText(String new_text);
	public String getAnswerText();
	public boolean setAnswerText(String new_text);
	public String getCategoryText();
	public boolean setCategoryText(String new_text);
	public int getValue();
	public boolean setValue(int new_value);
}
