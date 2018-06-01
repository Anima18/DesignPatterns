package com.chirs.designpattern.command.command;

import com.chirs.designpattern.command.character.Character;

public class PunchCommand implements Command {
    private Character character;

    public PunchCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.punch();
    }
}
