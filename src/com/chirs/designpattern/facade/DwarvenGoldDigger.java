package com.chirs.designpattern.facade;

import java.util.logging.Logger;

/**
 * Created by Admin on 2018/5/16.
 */
public class DwarvenGoldDigger extends DwarvenMineWorker {
    private static final Logger LOGGER = Logger.getLogger(DwarvenGoldDigger.class.getName());

    @Override
    public void work() {
        LOGGER.info( name()+" digs for gold.");
    }

    @Override
    public String name() {
        return "Dwarf gold digger";
    }
}
