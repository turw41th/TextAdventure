package com.textadventure;

import com.action.handler.ActionHandler;
import com.action.handler.ExitHandler;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    Scanner myInput = new Scanner(System.in);
    private PrintStream output;
    private List<ActionHandler> actionHandlers;

    public Game(){
        this.output = System.out;
        this.actionHandlers = new ArrayList<>();

        this.actionHandlers.add(new ExitHandler());
    }


    public void run(){

        String command = "";


        while(!command.equalsIgnoreCase("/exit")){

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
        return relevantHandler.handle();
    }

}
