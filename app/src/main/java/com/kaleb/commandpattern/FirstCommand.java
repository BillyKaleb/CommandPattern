package com.kaleb.commandpattern;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version FirstCommand, v 0.1 2019-07-25 16:45 by Billy Kaleb Hananto
 */
public class FirstCommand implements Action {

    private FirstReceiver firstReceiver = new FirstReceiver();

    @Override
    public void executeAction() {
        firstReceiver.firstVerion();
    }
}
