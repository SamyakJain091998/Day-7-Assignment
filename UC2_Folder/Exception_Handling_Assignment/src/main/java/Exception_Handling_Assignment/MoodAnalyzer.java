//MoodAnalyzer.java

package Exception_Handling_Assignment;

public class MoodAnalyzer {
	
	private String message;
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	public MoodAnalyzer() {
		
	}
	
	public String AnalyzeMood() {
		if(message.contains("happy")) 
			return "happy mood";
		else if(message.contains("sad"))
			return "sad mood";
		else if(message.contains("I am in Sad Mood"))
			return "SAD";
		else
			return "nothing";
	}
}
