 import org.junit.Assert;
import org.junit.Test;

 public class MoodAnalyzerTest {

     @Test
     public void testAnalyseMood() {
         MoodAnalyser moodAnalyser = new MoodAnalyser();
         String mood = moodAnalyser.analyseMood("This is a Sad Message");
         Assert.assertEquals("SAD", mood);

     }
     }


