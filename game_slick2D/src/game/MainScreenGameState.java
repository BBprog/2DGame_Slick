/**
 *
 * @author Bprog
 */
package game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class MainScreenGameState extends BasicGameState {
    public static final int ID = 1;
    private Image background;
    private StateBasedGame game;
    private Image[] buttons = new Image[3];

    MainScreenGameState () throws SlickException {
        buttons[0] = new Image ("resources/buttons/new_game_button.png");
        buttons[1] = new Image ("resources/buttons/load_game_button.png");
        buttons[2] = new Image ("resources/buttons/exit_button.png");
    }
  
    @Override
    public int getID () {
        return ID;
    }

    @Override
    public void init (GameContainer container, StateBasedGame game) throws SlickException {
        this.game = game;
        this.background = new Image ("resources/images/main_menu_background.png");
        //container.setFullscreen (true);
    }

    @Override
    public void render (GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        background.draw (0, 0, container.getWidth (), container.getHeight ());
        g.drawImage (new Image ("resources/buttons/new_game_button.png"), 230, 230);
        g.drawImage (new Image ("resources/buttons/load_game_button.png"), 230, 290);
        g.drawImage (new Image ("resources/buttons/exit_button.png"), 230, 350);
    }

    @Override
    public void update (GameContainer container, StateBasedGame game, int delta) throws SlickException {
        
    }
    
    @Override
    public void keyReleased (int key, char c) {
        game.enterState (PauseState.ID, new FadeOutTransition(), new FadeInTransition());
    }  
}
