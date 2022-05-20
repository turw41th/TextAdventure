package com.action.handler;

import com.textadventure.Game;

/**
 * THIS IS NOT YET THE FINAL VERSION OF THIS COMMAND
 *
 * Command will not have hard coded text but will query all command classes to
 */
public class GetCommandsHandler extends PhraseActionHandler {
    public GetCommandsHandler(Game game) {
        super(game);
    }

    @Override
    public String handle() {
        return """
                The following commands are available at the moment:
                /exit                   - exit the game
                /location, /l           - get your current location
                /locationdetails, /ld   - get location details
                /name                   - prints your character name
                /inventory, /i          - shows your inventory
                /time                   - shows current system date and time
                /info                   - shows the imprint
                """;
    }

    @Override
    protected String[] getPhrases() {
        return new String[]{"/commands"};
    }
}
