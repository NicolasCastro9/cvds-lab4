package hangman.model;
import org.junit.Assert;
import org.junit.Test;
public class GameScoreTest{


    /** 
     * CASO_1 ORIGINALSCORE: 
    **/
    
    @Test
    public void When_OriginalScore_has_correctCount_is_negative () throws ModelException {
        GameScore puntaje= new OriginalScore();
        try{
            int score= puntaje.calculateScore(-2,8);
        }     
        catch(Exception e){}
    }
    @Test
    public void When_OriginalScore_has_incorrectCount_is_negative () throws ModelException {
        GameScore puntaje= new OriginalScore();
        try{
            int score= puntaje.calculateScore(2,-8);
        }     
        catch(Exception e){}
    }
    @Test
    public void When_OriginalScore_has_incorrectCount_is_zero () throws ModelException {
        GameScore puntaje= new OriginalScore();
        int score= puntaje.calculateScore(3,0);
        Assert.assertEquals(score,100);
    }
    @Test
    public void When_OriginalScore_has_incorrectCount_is_between_one_and_ten () throws ModelException {
        GameScore puntaje= new OriginalScore();
        int score= puntaje.calculateScore(6,10);
        Assert.assertEquals(score,0);
    }
    @Test
    public void When_OriginalScore_has_incorrectCount_is_greater_than_ten () throws ModelException {
        GameScore puntaje= new OriginalScore();
        int score= puntaje.calculateScore(1,11);
        Assert.assertEquals(score,0);
    }



    /** 
     * CASO_2 BonusScore
    **/

    @Test
    public void When_BonusScore_has_correctCount_is_negative () throws ModelException {
        GameScore puntaje= new BonusScore();
        try{
            int score= puntaje.calculateScore(-2,8);
        }     
        catch(Exception e){}
    }
    @Test
    public void When_BonusScore_has_incorrectCount_is_negative () throws ModelException {
        GameScore puntaje= new BonusScore();
        try{
            int score= puntaje.calculateScore(2,-8);
        }     
        catch(Exception e){}
    }
    @Test
    public void When_BonusScore_has_incorrectCount_is_zero () throws ModelException {
        GameScore puntaje= new BonusScore();
        int score= puntaje.calculateScore(3,0);
        Assert.assertEquals(score,30);
    }
    @Test
    public void When_BonusScore_has_incorrectCount_is_between_one_and_ten () throws ModelException {
        GameScore puntaje= new BonusScore();
        int score= puntaje.calculateScore(3,5);
        Assert.assertEquals(score,5);
    }
    @Test
    public void When_BonusScore_has_incorrectCount_is_greater_than_ten () throws ModelException {
        GameScore puntaje= new BonusScore();
        int score= puntaje.calculateScore(1,11);
        Assert.assertEquals(score,0);
    }


    /** 
     * CASO_3 POWERSCORE
    **/


    @Test
    public void When_PowerScore_has_correctCount_is_negative () throws ModelException {
        GameScore puntaje= new PowerScore();
        try{
            int score= puntaje.calculateScore(-2,8);
        }     
        catch(Exception e){}
    }
    @Test
    public void When_PowerScore_has_incorrectCount_is_negative () throws ModelException {
        GameScore puntaje= new PowerScore();
        try{
            int score= puntaje.calculateScore(2,-8);
        }     
        catch(Exception e){}
    }
    @Test
    public void When_PowerScore_has_incorrectCount_is_zero_and_correctCount_is_greater_than_zero () throws ModelException {
        GameScore puntaje= new PowerScore();
        int score= puntaje.calculateScore(3,0);
        Assert.assertEquals(score,155);
    }
    @Test
    public void When_PowerScore_has_correctCount_is_zero_and_incorrectCount_is_greater_than_zero () throws ModelException {
        GameScore puntaje= new PowerScore();
        int score= puntaje.calculateScore(0,5);
        Assert.assertEquals(score,0);
    }
    @Test
    public void When_PowerScore_has_incorrectCount_is_zero_and_correctCount_is_greater_than_four () throws ModelException {
        GameScore puntaje= new PowerScore();
        int score= puntaje.calculateScore(4,0);
        Assert.assertEquals(score,500);
    }
    @Test
    public void When_PowerScore_has_incorrectCount_is_greater_than_one_and_correctCount_is_greater_than_one () throws ModelException {
        GameScore puntaje= new PowerScore();
        int score= puntaje.calculateScore(2,2);
        Assert.assertEquals(score,14);
    }
}