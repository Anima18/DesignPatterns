package com.chirs.designpattern.abstractfactory;

import com.chirs.designpattern.utils.PrintUtil;

/**
 * Created by Admin on 2018/5/13.
 */
public class DellMouse implements Mouse{
    @Override
    public void rightClick() {
        PrintUtil.print("DellMouse rightClick");
    }
}
