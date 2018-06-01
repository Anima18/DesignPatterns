package com.chirs.designpattern.command.command;

import com.chirs.designpattern.command.character.Character;

public class UpCommand implements Command {
    private Character character;

    public UpCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.up();
    }
}
