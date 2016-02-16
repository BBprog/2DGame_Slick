 /*
 *
 * @author Bprog
 */
package game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class MainScreenGameState extends BasicGameState {
    public static final int ID = 1;
    private GameContainer container;
    private StateBasedGame game;
    private Image background;
    private MainMenu menu;
    private MenuController controller;
    
    MainScreenGameState () {
    }
  
    @Override
    public int getID () {
        return ID;
    }

    @Override
    public void init (GameContainer container, StateBasedGame game) throws SlickException {
        this.game = game;
        this.container = container;
        this.menu = new MainMenu ();
        this.controller = new MenuController (menu);
        this.background = new Image ("resources/images/main_menu_background.png");
        this.controller.setInput (container.getInput ());
        container.getInput ().addKeyListener (controller);
        //container.setFullscreen (true);
    }

    @Override
    public void render (GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        background.draw (0, 0, container.getWidth (), container.getHeight ());
        //menu.draw (g, 230, 230);
        //g.drawImage (new Image ("resources/images/window_dial.png"), 230, 230);
    }

    @Override
    public void update (GameContainer container, StateBasedGame game, int delta) throws SlickException {
        
    }
    
    @Override
    public void keyReleased (int key, char c) {
        if (key == Input.KEY_ENTER) {
            game.enterState (PauseState.ID, new FadeOutTransition(), new FadeInTransition());
        }
    }  
}
