package com.textadventure;

import com.action.handler.ActionHandler;
import com.action.handler.ErrorHandler;
import com.action.handler.ExitHandler;
import com.action.handler.TimeHandler;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    Scanner myInput = new Scanner(System.in);
    private PrintStream output;
    private ArrayList<ActionHandler> actionHandlers;

    private boolean wantExit;

    public Game(){
        this.output = System.out;
        this.actionHandlers = new ArrayList<>();
        this.wantExit = false;

        this.actionHandlers.add(new ExitHandler(this));
        this.actionHandlers.add(new TimeHandler(this));
    }

    public void requestExit(){
        this.wantExit = true;
    }


    public void run() throws IOException {

        String command = "";


        while(!this.wantExit){

            //Input
            this.output.print("> ");
            command = myInput.nextLine();

            //Verarbeitung
            String outputString = this.update(command);

            //Output
            this.output.println(outputString + "\n");

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
            return relevantHandler.handle();
        } catch (NullPointerException e){
            return new ErrorHandler(this).handle();
        }
    }

}
