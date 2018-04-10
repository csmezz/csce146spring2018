import java.io.*;
import java.util.*;

public class ScrabbleHelper {
	private Hashtable<String, Integer> values;
	private Set<String> dictionary;
	
	public ScrabbleHelper() {
		values = new Hashtable<String, Integer>();
		dictionary = new HashSet<String>();
		Scanner file;
		try {
			file = new Scanner(new File("src/dictionary.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		while(file.hasNext()) {
			dictionary.add(file.next().trim().toUpperCase());
		}
		values.put("E", 1);
		values.put("A", 1);
		values.put("I", 1);
		values.put("O", 1);
		values.put("N", 1);
		values.put("R", 1);
		values.put("T", 1);
		values.put("L", 1);
		values.put("S", 1);
		values.put("U", 1);
		values.put("D", 2);
		values.put("G", 2);
		values.put("B", 3);
		values.put("C", 3);
		values.put("M", 3);
		values.put("P", 3);
		values.put("F", 4);
		values.put("H", 4);
		values.put("V", 4);
		values.put("W", 4);
		values.put("Y", 4);
		values.put("K", 5);
		values.put("J", 8);
		values.put("X", 8);
		values.put("Q", 10);
		values.put("Z", 10);
	}
	
	// This returns true if the word is in the dictionary.
	public boolean checkWord(String w) {
		if (dictionary.contains(w)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// This will give you the value of a letter.
	public int getLetterValue(char c) {
		if (values.get(Character.toString(c)) != null) {
			return values.get(String.valueOf(c));
		}
		return 0;
	}
	
	// This will give you the value of a word.
	public int getWordValue(String w) {
		String word = w.toUpperCase();
		int val = 0;
		if (checkWord(word)) {
			for (char c : word.toCharArray()) {
				val += getLetterValue(c);
			}
		}
		return val;
	}
	
	// This will return a set of 500 random words from the dictionary.
	public Set<String> getWordSet() {
		Set<String> temp = new HashSet<String>();
		int size = dictionary.size();
		int item = new Random().nextInt(size);
		int i = 0;
		int set_count = 0;
		while (set_count <= 500) {
			for (String h : dictionary) {
				if (i == item) {
					temp.add(h);
					set_count++;
					item = new Random().nextInt(size);
					break;
				}
				i++;
			}
			i = 0;
		}
		return temp;
	}
}
