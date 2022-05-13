package com.action.handler;

import com.textadventure.Game;

public class ShowImprintHandler extends PhraseActionHandler{

    public ShowImprintHandler(Game game) {
        super(game);
    }

    @Override
    public String handle() {

        return """
                Author: Nicolas Baur
                Version: 1.0
                License: MIT License
                
                For license details see License.md file""";
    }

    @Override
    protected String[] getPhrases() {
        return new String[]{"/info"};
    }
}
