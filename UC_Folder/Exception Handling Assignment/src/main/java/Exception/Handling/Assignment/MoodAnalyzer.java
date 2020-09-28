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
			else
				return "happy";
		}
		catch(NullPointerException e) 
			{	
			System.out.println("Enter a valid input...");
			return "Enter a valid input";
			}
	}
}
