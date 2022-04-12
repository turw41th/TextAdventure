package com.action.handler;

import com.textadventure.Game;

public class ExitHandler extends PhraseActionHandler {

    public ExitHandler(Game game){
        super(game);
    }


    @Override
    public String handle() {
        this.game.requestExit();
        return "Thanks for playing!";
    }

    @Override
    protected String[] getPhrases() {
        return new String[]{"/exit"};
    }
}
