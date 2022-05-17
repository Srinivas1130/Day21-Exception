package com.bridgelabz.day21;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void sadTest() {
		try {
			Moodanalysis moodanalysis = new Moodanalysis();
			String sadmsg = moodanalysis.analysemood();
			Assert.assertEquals("SAD", sadmsg);
		}catch(Exception e){
			//System.out.println("Exception Handled");
		}
	}

	@Test
	public void happyTest() {
		try {
			Moodanalysis moodanalysis = new Moodanalysis("This is a Happy message");
			String happymsg = moodanalysis.analysemood();
			Assert.assertEquals("HAPPY", happymsg);
		}catch(Exception e){
			//System.out.println("Exception Handled");
		}
	}

	@Test
	public void Analysemoodexception() {
		try {
			Moodanalysis moodanalysis = new Moodanalysis();
			String happymsg = moodanalysis.analysemoodexception();
			Assert.assertEquals("Sad", happymsg);
		}catch(MoodAnalysisException e){
			//System.out.println("Exception Handled");
		}
	}
}