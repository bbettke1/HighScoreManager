
package highscoremanager;



public class HighScoreManagerTester {

    public static void main(String[] args) {
        HighScoreManager scoreManager = new LocalHighScoreManager();
        HighScore hs = scoreManager.getTopScore();
        System.out.println("Time = " + hs.getTime());
        showHighScores(scoreManager.getHighScores());
        scoreManager.addScore(new HighScore(123, 456, "BMB"));
        showHighScores(scoreManager.getHighScores());        
    }
    
    public static void showHighScores(HighScore [] highScores) {
        System.out.printf("%-8s%-8s%-8s\n", "Time", "Clicks", "Name");
        for(int i=0; i<highScores.length; i++) {
            System.out.printf("%-8d%-8d%-8s\n", highScores[i].getTime(),
                    highScores[i].getClicks(),highScores[i].getName());
        }            
        System.out.println();
    }
    
}
