/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author Bprog
 */
public class PauseState extends BasicGameState {
    public static final int ID = 3;
    private Image background;
    private StateBasedGame pause;
    
    PauseState () {
        
    }

    @Override
    public int getID () {
        return ID;
    }

    @Override
    public void init (GameContainer container, StateBasedGame game) throws SlickException {
        this.pause = game;
        this.background = new Image ("resources/images/paused_background.png");
    }

    @Override
    public void render (GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        background.draw (0, 0, container.getWidth (), container.getHeight ());
    }

    @Override
    public void update (GameContainer container, StateBasedGame game, int i) throws SlickException {

    }
    
    @Override
    public void keyReleased (int key, char c) {
        pause.enterState (2);
    }
}
