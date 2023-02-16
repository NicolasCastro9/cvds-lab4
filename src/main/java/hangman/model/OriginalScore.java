package hangman.model;

public class OriginalScore implements GameScore {
    public OriginalScore(){}

    public int calculateScore(int correctCount, int incorrectCount) throws ModelException {
        if(correctCount < 0 || incorrectCount < 0){
            throw new ModelException(" Numer ");
        }
        return 100 - (incorrectCount * 10);
    }
}
