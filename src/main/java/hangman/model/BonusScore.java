package hangman.model;

public class BonusScore implements GameScore{
    /**
    @pre Se inicia el juego con 0 puntos
	@pos Por cada letra incorrecta se penalizaran 5 puntos, Por cada letra correcta se bonificaran 10 puntos
	@param int correctCount respuestas correctas
	@param int incorrectCount respuestaas incorrectas
	@throws ModelException.Numero_Negativo cuando el puntaje sea menor a 0
	@return puntaje **/



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