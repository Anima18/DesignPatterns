package com.chirs.designpattern.facade;

import java.util.logging.Logger;

/**
 * Created by Admin on 2018/5/16.
 */
public class DwarvenCartOperator extends DwarvenMineWorker {
    private static final Logger LOGGER = Logger.getLogger(DwarvenCartOperator.class.getName());

    @Override
    public void work() {
        LOGGER.info( name()+" moves gold chunks out of the mine.");
    }

    @Override
    public String name() {
        return "Dwarf cart operator";
    }
}
