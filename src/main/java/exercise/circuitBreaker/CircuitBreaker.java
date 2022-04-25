package exercise.circuitBreaker;

import exercise.circuitBreaker.house.Bathroom;

/**
 * Using Object-Oriented Programming techniques, build
 * a circuit breaker that controls part of the house.
 *  -> Garage
 *      - garageDoor
 *      - waterHeater
 *      - hvacUnit
 *  -> Kitchen
 *      - refrigerator
 *      - dishWasher
 *  -> LivingRoom
 *      - lights
 *  -> DiningRoom
 *      - lights
 *  -> Bedroom1
 *      - lights
 *  -> Bedroom2
 *      - lights
 *      - fan
 *  -> Bathroom
 *      - lights
 *      - fan
 *  -> MasterBedroom
 *      - lights
 *      - fan
 */

public class CircuitBreaker {

    // Bathroom
    public void displayBathroom() {

        Bathroom bathroom = new Bathroom();

        switch (bathroom.getIsLightsOn()) {
            case "false":
                System.out.println("Bathroom lights are off.");
                break;
            case "true":
                System.out.println("Bathroom lights are on.");
                break;
        }

        switch (bathroom.getIsFanOn()) {

            case "false":
                System.out.println("Bathroom fan is off.");
                break;
            case "true":
                System.out.println("Bathroom fan is on.");
                break;

        }

    }

    // TODO: Complete display switch for the rest of the rooms.

}
