package com.textadventure;

import com.action.handler.*;
import com.world.World;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;





/**
 * Game class that gets instanced in the main method and represents the game itself.
 */
public class Game {

    Scanner myInput = new Scanner(System.in);
    private PrintStream output;
    private ArrayList<ActionHandler> actionHandlers;
    private World world;
    private String command = "";

    private boolean wantExit;


    /**
     * Game construtor.
     * adds Object of each ActionHandler child to actionHandlers ArrayList
     * instances World object
     */
    public Game(String playername){
        this.output = System.out;
        this.actionHandlers = new ArrayList<>();
        this.wantExit = false;

        this.actionHandlers.add(new ExitHandler(this));
        this.actionHandlers.add(new TimeHandler(this));
        this.actionHandlers.add(new GetCurrentLocationHandler(this));
        this.actionHandlers.add(new GetPlayerNameHandler(this));
        this.actionHandlers.add(new ListInventoryHandler(this));
        this.actionHandlers.add(new ShowImprintHandler(this));
        this.actionHandlers.add(new GetCommandsHandler(this));

        this.world = new World(playername);

    }

    public World getWorld() {
        return this.world;
    }


    /**
     * Sets exit condition to true. Gets called when /exit command is used
     */
    public void requestExit(){
        this.wantExit = true;
    }

    public String getCommand(){
        return this.command;
    }



    /**
     * Is the main run method which runs the game loop.
     * @throws IOException
     */
    public void run() throws IOException {

        System.out.println("Enter /info to see the imprint");
        System.out.println("or /commands to see a list of all available commands");

        while(!this.wantExit){

            //Input
            this.output.print("Command > ");
            command = myInput.nextLine();

            //processing
            String outputString = this.update(command);

            //Output
            this.output.println(outputString);

        }
    }

    /**
     * queries ActionHandler objects with the correct command keyword
     * @param command query with command as string
     * @return handle() method of the handler that was called
     */
    public String update(String command) {
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
