package hangman.model;

public class BonusScore implements GameScore{
    private int score;
    public BonusScore(){
        score = 0;
    }

    public int calculateScore(int correctCount, int incorrectCount)throws ModelException {
        if(correctCount < 0 || incorrectCount < 0){
            throw new ModelException(" Numero de incorrectas o correctas menor a 0 ");
        }
        return Math.max(score + correctCount * 10 -incorrectCount * 5, 0);
    }
}