package hangman.model;

public class OriginalScore implements GameScore {

/**
    @pre Se inicia el juego con 100 puntos, puntaje minimo 0
	@pos No se bonifican las letras correctas
    @pos Por cada letra incorrecta se penalizan 10 puntos
	@param int correctCount respuestas correctas
	@param int incorrectCount respuestaas incorrectas
	@throws ModelException.Numero_Negativo cuando el puntaje sea menor a 0
	@return puntaje **/

    public int calculateScore(int correctCount, int incorrectCount) throws ModelException {
        if(correctCount < 0 || incorrectCount < 0){
            throw new ModelException(" Numero de incorrectas o correctas menor a 0");
        }
        return Math.max(100 - (incorrectCount * 10),0);
    }
}
