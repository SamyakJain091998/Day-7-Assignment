package Exception.Handling.Assignment;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class UC3 {

	@Ignore
	@Test
	public void sad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("sad");
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
		}
		Assert.assertEquals("sad", mood);
	}
	
	@Ignore
	@Test
	public void happy() {
		MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am happy");
		String mood1 = null;
		try {
			mood1 = moodAnalyser1.analyseMood();
		} catch (MoodAnalyserException e) {
		}
		Assert.assertEquals("happy", mood1);
	}
	
	//@Ignore
	@Test
	public void null_message_Case() {
		MoodAnalyser moodAnalyserNull = new MoodAnalyser(null);
		try {
			moodAnalyserNull.analyseMood(null);
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
		}
		
	}
	
	//@Ignore
	@Test
	public void empty_Message_Case() {
		String mood1 = "";
		MoodAnalyser moodAnalyserNull = new MoodAnalyser(mood1);
		try {
			moodAnalyserNull.analyseMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}
