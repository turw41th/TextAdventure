package com.action.handler;

import com.textadventure.Game;
import com.world.World;

public class GetPlayerNameHandler extends PhraseActionHandler{


    public GetPlayerNameHandler(Game game) {
        super(game);
    }

    @Override
    public String handle() {
        return "Your characters name is: " + game.getWorld().getPlayer().getName() + "!";
    }

    @Override
    protected String[] getPhrases() {
        return new String[]{"/name"};
    }
}
