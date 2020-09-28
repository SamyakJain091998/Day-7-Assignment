//Uc2.java

package Exception.Handling.Assignment;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class UC2_1 {

	@Test
	public void returns_happy_When_null_Input() {
		MoodAnalyzer moodAnalyserNull = new MoodAnalyzer(null);
		String mood1 = moodAnalyserNull.analyseMood();
		Assert.assertEquals("happy", mood1);	
	}
}
