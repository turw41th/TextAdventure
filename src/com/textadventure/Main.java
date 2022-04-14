package com.textadventure;

import java.io.IOException;

/**
 * @author Turwaith
 *
 * This is a basic TextRPG Engine that can be extended. For more detailed info and description, read the readme.md file
 * in the Github repository.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Game game = new Game();
        game.run();
    }
}
