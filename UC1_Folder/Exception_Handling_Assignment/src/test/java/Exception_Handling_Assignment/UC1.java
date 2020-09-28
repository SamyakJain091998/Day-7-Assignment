package Exception_Handling_Assignment;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;



public class UC1 {

	@Test
	public void returns_happyMood_when_input_happy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("happy");
		String result = moodAnalyzer.AnalyzeMood();
		Assert.assertEquals("happy mood", result);
		
		}
	
	@Test
	public void returns_sadMood_when_input_sad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("sad");
		String result = moodAnalyzer.AnalyzeMood();
		Assert.assertEquals("sad mood", result);
	}

}
