/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;

/**
 *
 * @author Bprog
 */
public class MenuController implements KeyListener {
    private MainMenu menu;
    private Input input;
    
    public MenuController (MainMenu menu) {
        this.menu = menu;
    }

    @Override
    public void keyPressed(int key, char c) {
        switch (key) {
            case Input.KEY_UP:    menu.previous (); break;
            case Input.KEY_DOWN:  menu.next ();  break;
                
            case Input.KEY_ENTER:  menu.update ();  break;
        }
    }

    @Override
    public void keyReleased(int i, char c) {
    }

    @Override
    public void setInput(Input input) {
        this.input = input;
    }

    @Override
    public boolean isAcceptingInput() {
        return true;
    }

    @Override
    public void inputEnded() {
    }

    @Override
    public void inputStarted() {
    }
    
}
