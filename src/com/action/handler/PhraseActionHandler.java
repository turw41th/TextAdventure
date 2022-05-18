package com.action.handler;

import com.textadventure.Game;

/**
 * Parent class for every command class except error handler
 */
public abstract class PhraseActionHandler extends ActionHandler{

    public PhraseActionHandler(Game game){
        super(game);
    }

    @Override
    public boolean matches(String command){

        String[] phrases = this.getPhrases();
        for (String phrase : phrases) {
            if(phrase.equalsIgnoreCase(command)){
                return true;
            }
        }
        return false;
    }

    protected abstract String[] getPhrases();

}
