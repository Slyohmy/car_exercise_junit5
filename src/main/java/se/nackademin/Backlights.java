package se.nackademin;

public class Backlights {
    private boolean isTurnedOn;
    private boolean breaklightsOn = false;

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }
    
    
   // SQqsqs

    public boolean isBreaklightsOn() {
        return breaklightsOn;
    }

    public void setBreaklightsOn(boolean breaklightsOn) {
        this.breaklightsOn = breaklightsOn;
    }
}
