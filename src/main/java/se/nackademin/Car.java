package se.nackademin;

public class Car {
    public Car(Frontlights frontlights, Backlights backlights) {
        this.frontlights = frontlights;
        this.backlights = backlights;
    }

    private boolean breaking;
    private final Frontlights frontlights;
    private final Backlights backlights;
    private boolean warningLights;
    private int speed;
    private boolean carTurnedOn;
    private final Accelerate accelerate = new Accelerate();


    public void checkSpeed() {
        if (accelerate.getGear() == 1 && speed >= 180) {
            setSpeed(speed);
            accelerate.setGear(0);
        }
        else if (breaking && speed == 0) {
            breaking = false;
        }
    }

    public void honk () {
        System.out.println("Honk, honk!");
    }

    public Frontlights getFrontLights() {
        return frontlights;
    }
    public Backlights getBacklights() {
        return backlights;
    }
    public boolean isCarTurnedOn() {
        return carTurnedOn;
    }

    public void setCarTurnedOn(boolean carTurnedOn) {
        if (!carTurnedOn) {
            backlights.setTurnedOn(false);
            frontlights.setTurnedOn(false);
        }
        this.carTurnedOn = carTurnedOn;
    }
    public boolean isWarningLights() {
        return warningLights;
    }
    public void setWarningLights(boolean warningLights) {
        this.warningLights = warningLights;
    }
    public void setSpeed(int speed) {
        speed = Math.min(speed, 180);
        this.speed = speed;
    }

    public boolean isBreaking() {
        return breaking;
    }
    public void setBreaking(boolean breaking) {
        backlights.setBreaklightsOn(breaking);
        this.breaking = breaking;
    }

    public Accelerate getAccelerate() {
        return accelerate;
    }
}
