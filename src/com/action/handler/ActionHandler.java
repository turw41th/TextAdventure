package com.action.handler;

public abstract class ActionHandler {

    public abstract boolean matches(String command);

    public abstract String handle();

}
