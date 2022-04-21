package com.action.handler;

import com.textadventure.Game;

public class GetCommandsHandler extends PhraseActionHandler{


    public GetCommandsHandler(Game game) {
        super(game);
    }

    @Override
    public String handle() {
        String returnstring = "";

        for (ActionHandler handler: game.getActionHandlers()){

        }


        return null;
    }

    @Override
    protected String[] getPhrases() {
        return new String[]{"/commands"};
    }
}
