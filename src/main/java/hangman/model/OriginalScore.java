package hangman.model;

public class OriginalScore implements GameScore {
    public OriginalScore(){}

    public int calculateScore(int correctCount, int incorrectCount) throws ModelException {
        if(correctCount < 0 || incorrectCount < 0){
            throw new ModelException(" Numero de incorrectas o correctas menor a 0");
        }
        return Math.max(100 - (incorrectCount * 10),0);
    }
}
