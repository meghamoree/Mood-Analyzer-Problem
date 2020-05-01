 import org.junit.Assert;
import org.junit.Test;

 public class MoodAnalyzerTest {
     @Test
 public void testSadMood(){
     MoodAnalyser moodAnalyser = new MoodAnalyser("Iam in Sad Mood");
     String mood=moodAnalyser.analyseMood();
     Assert.assertEquals("SAD",mood);
 }
}






