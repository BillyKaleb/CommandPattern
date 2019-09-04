package com.kaleb.commandpattern;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version SecondCommand, v 0.1 2019-07-25 16:59 by Billy Kaleb Hananto
 */
public class SecondCommand implements Action {

    private FirstReceiver firstReceiver = new FirstReceiver();

    @Override
    public void executeAction() {
        firstReceiver.secondVersion();
    }
}
