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
		
		if(message.contains("sad"))
			return "sad mood";
		else
			return "HAPPY";
	}
}