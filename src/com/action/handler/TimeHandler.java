package com.action.handler;

import com.textadventure.Game;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeHandler extends PhraseActionHandler{

    public TimeHandler(Game game) {
        super(game);
    }

    @Override
    public String handle() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    @Override
    protected String[] getPhrases() {
        return new String[]{"/time"};
    }
}