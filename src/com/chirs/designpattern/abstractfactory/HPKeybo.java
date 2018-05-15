package com.chirs.designpattern.abstractfactory;

import com.chirs.designpattern.utils.PrintUtil;

/**
 * Created by Admin on 2018/5/13.
 */
public class HPKeybo implements Keybo {
    @Override
    public void keypress() {
        PrintUtil.print("HPKeybo keypress");
    }
}
