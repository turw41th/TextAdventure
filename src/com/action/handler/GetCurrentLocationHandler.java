package com.action.handler;

import com.textadventure.Game;

public class GetCurrentLocationHandler extends PhraseActionHandler{


    public GetCurrentLocationHandler(Game game) {
        super(game);
    }

    @Override
    public String handle() {
        if (this.game.getCommand().equalsIgnoreCase("/location") || this.game.getCommand().equalsIgnoreCase("/l")){
            return this.game.getWorld().getCurrentSituation();
        }
        return this.game.getWorld().getCurrentSituationDetailed();
    }

    @Override
    protected String[] getPhrases() {
        return new String[]{"/location", "/locationdetails", "/l", "/ld"};
    }
}