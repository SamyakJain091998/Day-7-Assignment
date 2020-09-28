package Exception.Handling.Assignment;


public class MoodAnalyser {

	private String message;
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood(String message) throws MoodAnalyserException {
		this.message = message;
		return analyseMood();
	}
	
	public MoodAnalyser() {
		
	}
	
	public String analyseMood() throws MoodAnalyserException{
		try{
			if(message.length() == 0) {
				System.out.println("This is an empty message exception..Please enter a valid input!");
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter a valid input.");
			}
			else if(message.contains("sad")) 
				return "sad";
			else
				return "happy";
		}
		catch(NullPointerException e) 
			{	
				System.out.println("This is a null pointer exception...Enter a valid input please!");
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL, "Please enter a valid input.");
			}
	}	
}

