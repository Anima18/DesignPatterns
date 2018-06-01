package com.chirs.designpattern.command;

import com.chirs.designpattern.command.character.Character;
import com.chirs.designpattern.command.character.Yagami;
import com.chirs.designpattern.command.command.DownCommand;
import com.chirs.designpattern.command.command.ForwardCommand;
import com.chirs.designpattern.command.command.KickCommand;
import com.chirs.designpattern.command.command.UpCommand;

public class GamePadPay {
    public static void main(String[] args) {
        Character yagami = new Yagami();
        GamePad gamePad = new GamePad();

        gamePad.keyUp(new ForwardCommand(yagami));
        gamePad.keyUp(new KickCommand(yagami));
        gamePad.keyUp(new UpCommand(yagami));
        gamePad.keyUp(new DownCommand(yagami));
    }
}
