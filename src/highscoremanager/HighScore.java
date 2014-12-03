package highscoremanager;

public class HighScore implements Comparable {
    
    private long time;
    private long clicks;
    private String name;    
    
    public HighScore(long time, long clicks, String name) {
        this.time = time;
        this.clicks = clicks;
        this.name = name;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getClicks() {
        return clicks;
    }

    public void setClicks(long clicks) {
        this.clicks = clicks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Used for sorting Collections.  Sorts by time and then by click.
    @Override
    public int compareTo(Object o) {
        int retVal = 0;
        if ( o instanceof HighScore) {
            HighScore hs = (HighScore)o;
            if (time < hs.time) 
                retVal = -10;
            else if ( time > hs.time)
                retVal = 10;
            else { // they equal
                if (clicks < hs.clicks)
                    retVal = -10;
                else if (clicks > hs.clicks)
                    retVal = 10;
                else 
                    retVal = 0;
            }
        }
        return retVal;
    }
    
}
