import java.util.Set;

public class ScrabbleHelperTest {
	
	public static void main(String args[]) {
		ScrabbleHelper sh = new ScrabbleHelper();
		Set<String> wordlist = sh.getHundredWords();
		int i = 0;
		for (String h : wordlist) {
			System.out.println(i + ": " + h + " [" + sh.getWordValue(h) + "]");
			i++;
		}
	}
}
