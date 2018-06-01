package com.chirs.designpattern.command.command;

import com.chirs.designpattern.command.character.Character;

public class ForwardCommand implements Command {
    private Character character;

    public ForwardCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.forward();
    }
}
