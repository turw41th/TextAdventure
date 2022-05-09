package com.action.handler;

import com.textadventure.Game;

public class ListInventoryHandler extends PhraseActionHandler{


    public ListInventoryHandler(Game game) {
        super(game);
    }

    @Override
    public String handle() {
        return game.getWorld().getPlayer().listInventory();
    }

    @Override
    protected String[] getPhrases() {
        return new String[]{"/i", "/inventory"};
    }
}
