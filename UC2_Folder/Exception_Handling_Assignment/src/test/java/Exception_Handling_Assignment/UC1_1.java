//UC1.1.java

package Exception_Handling_Assignment;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;



public class UC1_1 {
	@Ignore
	@Test
	public void returns_happyMood_when_input_happy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("happy");
		String result = moodAnalyzer.AnalyzeMood();
		Assert.assertEquals("happy mood", result);
		
		}
	@Ignore
	@Test
	public void returns_sadMood_when_input_sad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("sad");
		String result = moodAnalyzer.AnalyzeMood();
		Assert.assertEquals("sad mood", result);
	}
	
	@Test
	public void returns_SAD_when_input_I_am_in_Sad_Mood() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		String result = moodAnalyzer.AnalyzeMood();
		Assert.assertEquals("SAD", result);
		
		}

}
