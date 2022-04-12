package com.action.handler;

import com.textadventure.Game;

public class ErrorHandler extends ActionHandler{

    public ErrorHandler(Game game){
        super(game);
    }

    @Override
    public String handle(){
        return "Please enter a valid command";
    }

    @Override
    public  boolean matches(String command){
        return true;
    }

}
