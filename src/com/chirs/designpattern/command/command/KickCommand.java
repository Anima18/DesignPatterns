package com.chirs.designpattern.command.command;

import com.chirs.designpattern.command.character.Character;

public class KickCommand implements Command {
    private Character character;

    public KickCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.kick();
    }
}
