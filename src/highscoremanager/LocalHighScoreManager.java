
package highscoremanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LocalHighScoreManager implements HighScoreManager{    
        
    List<HighScore> highScoreArray = new ArrayList<HighScore>();
    
    int maxScores;
        
    public LocalHighScoreManager() {
        this(10);   // Call the LocalHighScoreManager constructor that takes 
                    // maxScores as parameter.  Trick so that there is only 
                    // one real constructor that is doing all the work and you 
                    // don't need to replicate same code in all constuctors.
    }
    
    public LocalHighScoreManager(int maxScores) {        
        this.maxScores = maxScores;
        
        addScore(new HighScore( 120,  500, "JMG"));
        addScore(new HighScore( 250,  300, "WTB"));
        addScore(new HighScore( 900,  200, "GMJ"));
        addScore(new HighScore(1200,  501, "LNB"));
        addScore(new HighScore( 250,  250, "JAB"));        
        
    }

    @Override
    public HighScore getTopScore() {
        return highScoreArray.get(0);
    }

    @Override
    public HighScore[] getHighScores() {
        return highScoreArray.toArray(new HighScore[1]);        
    }

    @Override
    public void addScore(HighScore newScore) {
        
        highScoreArray.add(newScore);  
        
        Collections.sort(highScoreArray);
        
        // After sorting get rid of any scores that are not in the 
        // range.
        if (highScoreArray.size() > maxScores) {
            highScoreArray.remove(maxScores);
        }
        
    }        
}
