package com.kaleb.commandpattern;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version ThirdCommand, v 0.1 2019-08-16 16:22 by Billy Kaleb Hananto
 */
public class ThirdCommand implements Action {

    private ThirdReceiver thirdReceiver = new ThirdReceiver();

    @Override
    public void executeAction() {
        thirdReceiver.doThisOnThirdReceiver();
    }
}
