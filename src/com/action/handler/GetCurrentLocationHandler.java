package com.action.handler;

import com.textadventure.Game;

public class GetCurrentLocationHandler extends PhraseActionHandler{


    public GetCurrentLocationHandler(Game game) {
        super(game);
    }

    @Override
    public String handle() {
        return this.game.getWorld().getCurrentSituation();
    }

    @Override
    protected String[] getPhrases() {
        return new String[]{"/location"};
    }
}