package com.chirs.designpattern.command;

import com.chirs.designpattern.command.character.Character;
import com.chirs.designpattern.command.command.Command;

public class GamePad {
    private Character controlCharcter;

    public GamePad() {
    }

    public GamePad(Character controlCharcter) {
        this.controlCharcter = controlCharcter;
    }

    public void keyUp(Command command) {
        command.execute();
    }
}
