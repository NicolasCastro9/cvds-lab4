package hangman.model;

public class PowerScore implements GameScore {

    public int calculateScore(int correctCount, int incorrectCount)throws ModelException{
        if(correctCount < 0 || incorrectCount < 0)throw new ModelException(ModelException.NUMERO_NEGATIVO)
        return incorrectCount;

    }
    
}
