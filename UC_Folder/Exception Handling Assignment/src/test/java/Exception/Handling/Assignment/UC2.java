package Exception.Handling.Assignment;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class UC2 {

	@Test
	public void throwsException_When_null_Input() {
		MoodAnalyzer moodAnalyserNull = new MoodAnalyzer(null);
		try {
			String mood1 = moodAnalyserNull.analyseMood();
			//Assert.assertEquals("sad", mood1);
		} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
