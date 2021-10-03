package com.action.handler;

public class ExitHandler extends PhraseActionHandler {


    @Override
    public String handle() {
        return "Exithandler called!";
    }

    @Override
    protected String[] getPhrases() {
        return new String[]{"/exit"};
    }
}
