package com.action.handler;

public abstract class PhraseActionHandler extends ActionHandler{

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
