/*
* This program get the name of planet as string input,
* matches with enumeration and shows the planet position.
*
* @author  Jay Lee
* @version 1.0
* @since   2021-05-04
*/
// package ca.mths.unit1.unit10.java.main;

import java.util.Scanner;

public final class PlanetaryPosition {
    private PlanetaryPosition() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    public enum Planet {
        /** Mercury is the first planet in the solar system. */
        Mercury("first"),
        /** Venus is the second planet in the solar system. */
        Venus("second"),
        /** Earth is the third planet in the solar system. */
        Earth("third"),
        /** Mars is the fourth planet in the solar system. */
        Mars("fourth"),
        /** Jupiter is the fifth planet in the solar system. */
        Jupiter("fifth"),
        /** Saturn is the sixth planet in the solar system. */
        Saturn("sixth"),
        /** Uranus is the seventh planet in the solar system. */
        Uranus("seventh"),
        /** Neptune is the eighth planet in the solar system. */
        Neptune("eighth");

        /** String value of position. */
        private final String position;

        Planet(final String pos) {
            position = pos;
        }
        /**
        * This method returns position of the planet.
        * @return position
        */
        public String showPosition() {
            return position;
        }
    }

    /**
    * This method gets planet name as string input,
    * matches with enumeration and shows the planet position.
    * @param args
    */
    public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);
        Planet planet;

        // Input
        System.out.print("Enter the name of the planet: ");
        String stringPlanet = myObj.nextLine();
        try {
            planet = Planet.valueOf(stringPlanet);

            // Output
            System.out.println(planet + " is the " + planet.showPosition()
                               + " planet in the solar system.");

        } catch (Exception invalidInput) {
            System.err.print("The planet with entered name does not exist.");
        }

        System.out.println("\nDone.");
    }
}
