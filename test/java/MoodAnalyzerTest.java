         import org.junit.Assert;
         import org.junit.Rule;
         import org.junit.Test;
         import org.junit.rules.ExpectedException;

 public class MoodAnalyzerTest {

     @Rule
     public ExpectedException exceptionRule=ExpectedException.none();

     @Test
     public void testSadMood() throws MoodAnalyzerException {
         MoodAnalyser moodAnalyser = new MoodAnalyser("Iam in Sad Mood");
         String mood=moodAnalyser.analyseMood();
         Assert.assertEquals("SAD",mood);
     }

     @Test
     public void testHappyMood() throws MoodAnalyzerException {
         MoodAnalyser moodAnalyser = new MoodAnalyser("Iam in Happy Mood");
         String mood=moodAnalyser.analyseMood();
         Assert.assertEquals("HAPPY",mood);
     }

     @Test
     public void givenNullMood_Should_Throw_Exception() throws MoodAnalyzerException {
         MoodAnalyser moodAnalyser = new MoodAnalyser(null);
         try {
             moodAnalyser.analyseMood();
         } catch (MoodAnalyzerException e) {
             Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL,e.type);
         }
     }

     @Test
     public void givenEmpty_Should_Throw_Exception() throws MoodAnalyzerException {
         MoodAnalyser moodAnalyser = new MoodAnalyser("");
         try {
             moodAnalyser.analyseMood();
         } catch (MoodAnalyzerException e) {
             Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY,e.type);
         }
     }
 }








