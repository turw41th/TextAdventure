package com.action.handler;

import com.textadventure.Game;

/**
 * Parent class for all command handler classes
 */
public abstract class ActionHandler {

    protected Game game;

    public ActionHandler(Game game){
        this.game = game;
    }

    public abstract boolean matches(String command);

    public abstract String handle();

}