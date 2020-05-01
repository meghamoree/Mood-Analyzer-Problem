public class MoodAnalyser {

    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message=message;
    }

    public String analyseMood() throws MoodAnalyzerException {
        try {
            if (message.length()==0)
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY,"Mood Cannot be Empty or Null");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_NULL,"Mood Cannot be Empty or Null");
        }
    }
}