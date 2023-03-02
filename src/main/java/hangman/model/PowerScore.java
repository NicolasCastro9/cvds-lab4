package hangman.model;

public class PowerScore implements GameScore {


    /**
    @pre Se inicia el juego con 0 puntos
	@pos Por cada letra incorrecta se penalizaran 8 puntos, la i-esima letra correcta se bonificara con 5^i
    @pos Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
	@param int correctCount respuestas correctas
	@param int incorrectCount respuestaas incorrectas
	@throws ModelException.Numero_Negativo cuando el puntaje sea menor a 0
	@return puntaje **/

    @Override
    public int calculateScore(int correctCount, int incorrectCount)throws ModelException{
        if(correctCount < 0 || incorrectCount < 0){
            throw new ModelException(" Numero de incorrectas o correctas menor a 0 ");
        }
        else{
            int puntaje = 0;
            for(int i=0; i<correctCount;i++){
                puntaje += Math.pow(5,i+1);
            }
            puntaje -= incorrectCount * 8;
            if(puntaje < 0){
                return 0;
            }
            else if(puntaje > 500){
                return 500;
            }
            else{
                return puntaje;
            }
        }
    }
}
