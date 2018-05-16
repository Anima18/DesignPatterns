package com.chirs.designpattern.facade;

import java.util.logging.Logger;

/**
 * Created by Admin on 2018/5/16.
 */
public class DwarvenTunnelDigger extends DwarvenMineWorker {
    private static final Logger LOGGER = Logger.getLogger(DwarvenTunnelDigger.class.getName());

    @Override
    public void work() {
        LOGGER.info( name()+" creates another promising tunnel.");
    }

    @Override
    public String name() {
        return "Dwarven tunnel digger";
    }
}
