/**
 *
 * @author Bprog
 */
package game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class StateGame extends StateBasedGame {

    public StateGame () {
        super ("StateGame");
    }

    @Override
    public void initStatesList (GameContainer container) throws SlickException {
        container.setShowFPS (false);
        addState (new MainScreenGameState ());
        addState (new PauseState ());
    }
    
    public static void main (String[] argv) throws SlickException {
        new AppGameContainer (new StateGame (), 640, 480, false).start ();
    }
}
