package hangman.model;
import org.junit.Assert;
import org.junit.Test;
public class GameScoreTest{


    /** CASO_1 ORIGINALSCORE: 
     1	                               C < 0		                      Incorrecto
     2		                           I < 0	                          Incorrecto
     3	                      C >= 0	&&    I = 0	                            100
     4	                      C >= 0	&&    I > 0 && LI <= 10	       100 - (10 * I)
     5	                      C > 0	    &&    I > 10	                        0
     */

    @Test
    public void ShouldCalculateOriginal1() throws ModelException {
        GameScore puntaje= new OriginalScore();
        int score= puntaje.calculateScore(2,8);
        Assert.assertEquals(score,20);
    }
    @Test
    public void ShouldCalculateOriginal12() throws ModelException {
        GameScore puntaje= new OriginalScore();
        int score= puntaje.calculateScore(4,3);
        Assert.assertEquals(score,70);
    }
    @Test
    public void ShouldCalculateOriginal3() throws ModelException {
        GameScore puntaje= new OriginalScore();
        int score= puntaje.calculateScore(6,10);
        Assert.assertEquals(score,0);
    }
    @Test
    public void ShouldCalculateOriginal4() throws ModelException {
        GameScore puntaje= new OriginalScore();
        int score= puntaje.calculateScore(9,0);
        Assert.assertEquals(score,100);
    }


    /** CASO_2 BONUSCORE
    1	                             C < 0 		                         Incorrecto
    2		                         I < 0 	                             Incorrecto
    3	                         C >= 0  && I = 0	                         LC * 10
    4	                         C > 0  && I < LC 	                     (LC* 10) - (LI * 5)
    5	                         LC > 0 &&	LI >= LC * 2 	                  0
    */



    @Test
    public void ShouldCalculateBonus1() throws ModelException {
        GameScore game = new BonusScore();
        int score = game.calculateScore(5,2);
        Assert.assertEquals(score,40);
    }
    @Test
    public void ShouldCalculateBonus2() throws ModelException {
        GameScore game = new BonusScore();
        int score = game.calculateScore(10,10);
        Assert.assertEquals(score,50);
    }
    @Test
    public void ShouldCalculateBonus3() throws ModelException {
        GameScore game = new BonusScore();
        int score = game.calculateScore(20,0);
        Assert.assertEquals(score,200);
    }
    @Test
    public void ShouldCalculateBonus4() throws ModelException {
        GameScore game = new BonusScore();
        int score = game.calculateScore(10,20);
        Assert.assertEquals(score,0);
    }


    /** CASO_3 POWERSCORE
    1	                              C< 0 		                        Incorrecto
    2		                          I< 0	                            Incorrecto
    3	                       C > 0 && I = 0	                         5^i
    4	                       C = 0 && I > 0 	                         0
    5	                       C >= 4 && I = 0	                        500
    6	                       C > 1 && I > 1 	                    5^i - 8*LI 
    */


    @Test
    public void ShouldCalculatePower1() throws ModelException {
        GameScore game = new PowerScore();
        int score = game.calculateScore(3,0);
        Assert.assertEquals(score,155);
    }
    @Test
    public void ShouldCalculatePower2() throws ModelException {
        GameScore game = new PowerScore();
        int score = game.calculateScore(4,2);
        Assert.assertEquals(score,500);
    }
    @Test
    public void ShouldCalculatePower3() throws ModelException {
        GameScore game = new PowerScore();
        int score = game.calculateScore(0,10);
        Assert.assertEquals(score,0);
    }
    @Test
    public void ShouldCalculatePower4() throws ModelException {
        GameScore game = new PowerScore();
        int score = game.calculateScore(2,3);
        Assert.assertEquals(score,6);
    }




}