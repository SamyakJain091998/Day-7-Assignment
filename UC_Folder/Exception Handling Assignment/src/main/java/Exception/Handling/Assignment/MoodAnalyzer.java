//MoodAnalyzer.java

package Exception.Handling.Assignment;

public class MoodAnalyzer {

	private String message;
	public MoodAnalyzer() {
		// TODO Auto-generated constructor stub
	}
	
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	
	public String analyseMood(){
		try{
			if(message.contains("sad"))
				return "sad";
			else if(message.contains("happy"))
				return "happy";
			else
				return "happy";
		}
		catch(NullPointerException e) 
			{	
			System.out.println("There's a null pointer exception....");
			return "happy";
			}
	}
}
