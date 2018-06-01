package com.chirs.designpattern.command.character;

import com.chirs.designpattern.utils.PrintUtil;

public class Yagami implements Character {
    @Override
    public void up() {
        PrintUtil.print("Yagami jump up");
    }

    @Override
    public void down() {
        PrintUtil.print("Yagami keep down");
    }

    @Override
    public void forward() {
        PrintUtil.print("Yagami go forward");
    }

    @Override
    public void back() {
        PrintUtil.print("Yagami go back");
    }

    @Override
    public void punch() {
        PrintUtil.print("Yagami punch");
    }

    @Override
    public void kick() {
        PrintUtil.print("Yagami kick");
    }
}
