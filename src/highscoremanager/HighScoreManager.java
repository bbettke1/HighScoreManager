
package highscoremanager;

import highscoremanager.HighScore;


public interface HighScoreManager {
    public HighScore getTopScore();
    public HighScore [] getHighScores();
    public void addScore(HighScore newScore);
}
