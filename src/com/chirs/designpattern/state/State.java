package com.chirs.designpattern.state;

/**
 * Created by Admin on 2018/6/12.
 */
public interface State {
    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
