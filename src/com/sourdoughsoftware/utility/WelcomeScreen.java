package com.sourdoughsoftware.utility;

/**
 * Welcome screen displays a welcome message to the player when the game begins.
 *
 * @author Tyrone Moore, Kelson Smith, and Gina Villegas
 * @version 1.0.0
 */
public class WelcomeScreen {
    public static final String WELCOME_MESSAGE = "Welcome to \"The Last Slice of Pi\"";

    public WelcomeScreen() {}


    /**
     * @return the welcome message
     */
    public static String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }
}
