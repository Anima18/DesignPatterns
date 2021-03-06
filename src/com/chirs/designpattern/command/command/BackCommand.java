package com.chirs.designpattern.command.command;

import com.chirs.designpattern.command.character.Character;

public class BackCommand implements Command {
    private Character character;

    public BackCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.back();
    }
}
