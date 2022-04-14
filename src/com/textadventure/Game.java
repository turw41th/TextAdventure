package com.textadventure;

import com.action.handler.*;
import com.world.Location;
import com.world.World;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Game class that gets instanced in the main method and represents the game itself.
 */
public class Game {

    Scanner myInput = new Scanner(System.in);
    private PrintStream output;
    private ArrayList<ActionHandler> actionHandlers;
    private World world;

    private boolean wantExit;

    /**
     * Game construtor.
     * adds Object of each ActionHandler child to actionHandlers ArrayList
     * instances World object
     */
    public Game(){
        this.output = System.out;
        this.actionHandlers = new ArrayList<>();
        this.wantExit = false;

        this.actionHandlers.add(new ExitHandler(this));
        this.actionHandlers.add(new TimeHandler(this));
        this.actionHandlers.add(new GetCurrentLocationHandler(this));

        this.world = new World();
    }

    /**
     *
     * @return World object
     */
    public World getWorld() {
        return this.world;
    }

    /**
     * Sets exit condition to true. Gets called when /exit command is used
     */
    public void requestExit(){
        this.wantExit = true;
    }

    /**
     * Is the main run method which runs the game loop.
     * @throws IOException
     */
    public void run() throws IOException {

        String command = "";

        while(!this.wantExit){

            //Input
            this.output.print("> ");
            command = myInput.nextLine();

            //processing
            String outputString = this.update(command);

            //Output
            this.output.println(outputString);

        }

    }

    public String update(String command){
        ActionHandler relevantHandler = null;
        for(ActionHandler handler : this.actionHandlers){
            if (handler.matches(command)){
                relevantHandler = handler;
                break;
            }
        }
        try {
            return relevantHandler.handle() + "\n";
        } catch (NullPointerException e){
            return new ErrorHandler(this).handle();
        }
    }

}
