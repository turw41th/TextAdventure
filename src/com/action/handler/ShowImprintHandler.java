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
                Year: 2022
                Version: 1.0
                License: MIT Licence
                
                For licence details see Licence.md file
                
                #Disclaimer:
                Ths game is not finished and not ready to play. Feel free to expand this code to your desires according to the Licence.""";
    }

    @Override
    protected String[] getPhrases() {
        return new String[]{"/info"};
    }
}