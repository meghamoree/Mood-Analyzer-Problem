 import org.junit.Assert;
import org.junit.Test;

 public class MoodAnalyzerTest {
     @Test
 public void testSadMood(){
     MoodAnalyser moodAnalyser = new MoodAnalyser("Iam in Sad Mood");
     String mood=moodAnalyser.analyseMood();
     Assert.assertEquals("SAD",mood);
 }
 @Test
     public void testHappyMood() {
         MoodAnalyser moodAnalyser = new MoodAnalyser("Iam in Happy Mood");
         String mood=moodAnalyser.analyseMood();
         Assert.assertEquals("HAPPY",mood);
     }

 }






