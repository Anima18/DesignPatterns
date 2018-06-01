package com.chirs.designpattern.command.character;

import com.chirs.designpattern.utils.PrintUtil;

public class KyoKusanagi implements Character {
    @Override
    public void up() {
        PrintUtil.print("KyoKusanagi jump up");
    }

    @Override
    public void down() {
        PrintUtil.print("KyoKusanagi keep down");
    }

    @Override
    public void forward() {
        PrintUtil.print("KyoKusanagi go forward");
    }

    @Override
    public void back() {
        PrintUtil.print("KyoKusanagi go back");
    }

    @Override
    public void punch() {
        PrintUtil.print("KyoKusanagi punch");
    }

    @Override
    public void kick() {
        PrintUtil.print("KyoKusanagi kick");
    }
}
