package camelToSnake;

public class CamelToSnake {

	public static void main(String[] args) {
        
		String regex = "([a-z])([A-Z]+)";
        String replacement = "$1_$2";
		String[] words = {"myAwsomePhrase", "iLoveJustinBieber", "captainJackSparrow"};
		
		for (int i = 0; i < words.length; i++) {
			
			words[i] = words[i].replaceAll(regex, replacement).toLowerCase();
			System.out.println(words[i]);
		}

	}

}
