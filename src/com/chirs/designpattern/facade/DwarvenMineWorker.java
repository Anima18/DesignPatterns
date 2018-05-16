package com.chirs.designpattern.facade;

import java.util.logging.Logger;

/**
 * Created by Admin on 2018/5/16.
 */
public abstract class DwarvenMineWorker {

    private static final Logger LOGGER = Logger.getLogger(DwarvenMineWorker.class.getName());

    public void goToSleep() {
        LOGGER.info( name()+" goes to sleep.");
    }

    public void wakeUp() {
        LOGGER.info( name()+" wakes up.");
    }

    public void goHome() {
        LOGGER.info( name()+" goes home.");
    }

    public void goToMine() {
        LOGGER.info( name()+" goes to the mine.");
    }

    private void action(Action action) {
        switch (action) {
            case GO_TO_SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_HOME:
                goHome();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            case WORK:
                work();
                break;
            default:
                LOGGER.info("Undefined action");
                break;
        }
    }

    public void action(Action... actions) {
        for (Action action : actions) {
            action(action);
        }
    }

    public abstract void work();

    public abstract String name();

    static enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }
}