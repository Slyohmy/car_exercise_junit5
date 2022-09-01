package se.nackademin;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StandardTests {

    Car car = new Car(new Frontlights(), new Backlights());

    //String car = new String();

    @Test
    void checkIfCar() {
        assertEquals(car.getClass(), Car.class);
    }

    @Test
    void checkIfLights() {
        assertNotNull(car.getFrontLights());
    }

    @Test
    void checkIfTurnedOn() {
        car.getFrontLights().setTurnedOn(true);
        assertTrue(car.getFrontLights().isTurnedOn());
    }

    @Test
    void checkIfTurnedOff() {
        assertFalse(car.getFrontLights().isTurnedOn());
    }

    @Test
    void checkIfFullLights() {
        car.getFrontLights().setFullLights(true);
        assertTrue(car.getFrontLights().isFullLights());
    }

    @Test
    void checkIfHalfLights() {
        assertFalse(car.getFrontLights().isFullLights());
    }

    @Test
    void checkIfBackLightsAreOn() {
        car.getBacklights().setTurnedOn(true);
        assertTrue(car.getBacklights().isTurnedOn());
    }

    @Test
    void checkIfBackLightsAreOff() {
        assertFalse(car.getBacklights().isTurnedOn());
    }

    @Test
    void checkIfCarTurnedOn() {
        car.setCarTurnedOn(true);
        assertTrue(car.isCarTurnedOn());
    }

    @Test
    void checkIfAllLightsAreOff() {
        car.setCarTurnedOn(true);
        car.getFrontLights().setTurnedOn(true);
        car.getBacklights().setTurnedOn(true);
        car.setCarTurnedOn(false);
        assertFalse(car.getBacklights().isTurnedOn());
        assertFalse(car.getFrontLights().isTurnedOn());
    }

    @Test
    void checkIfWarningLightsAreOnWhenCarIsOn() {
        car.setCarTurnedOn(true);
        car.setWarningLights(true);
        assertTrue(car.isWarningLights());
    }

    @Test
    void checkIfWarningLightsAreOnWhenCarIsOff() {
        car.setCarTurnedOn(false);
        car.setWarningLights(true);
        assertTrue(car.isWarningLights());
    }

    @Test
    void checkIfCarAccelerate() {
        car.setCarTurnedOn(true);
        car.getAccelerate().setGear(1);
        assertTrue(car.getAccelerate().getGear() == 1 || car.getAccelerate().getGear() == -1);
    }

    @Test
    void checkTopSpeed() {
        car.setCarTurnedOn(true);
        car.setSpeed(180);
        car.checkSpeed();
        assertEquals(0, car.getAccelerate().getGear());
    }

    @Test
    void checkBreak() {
        car.setCarTurnedOn(true);
        car.setBreaking(true);
        car.setSpeed(0);
        car.checkSpeed();
        assertFalse(car.isBreaking());
    }

    @Test
    void checkReverse() {
        car.setCarTurnedOn(false);
        car.setBreaking(true);
        car.setSpeed(0);
        car.checkSpeed();
        assertFalse(car.isBreaking());
    }
    @Test
    void checkbreaklightsOn(){
        car.setBreaking(true);
        assertTrue(car.getBacklights().isBreaklightsOn());
    }
    @Test
    void checkbreaklightsOff(){
        assertFalse(car.getBacklights().isBreaklightsOn());
    }

    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
    }

    @Test
    void succeedingTest() {
    }

    @Test
    void failingTest() {
 //       fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }


    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }

}