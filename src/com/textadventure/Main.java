package com.textadventure;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Turwaith
 *
 * This is a basic TextRPG Engine that can be extended. For more detailed info and description, read the readme.md file
 * in the Github repository.
 */

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello, and welcome to this little text adventure!\n");
        System.out.print("Please enter a player/character name: ");
        String playername = input.nextLine();

        Game game = new Game(playername);
        game.run();
    }
}
