/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Bprog
 */
public class MainMenu {
    private ArrayList<String> items = new ArrayList<String> ();
    private int currentItem = 0;
    private int y;
    
    public MainMenu () {
        items.add("New Game");
        items.add("Load Game");
        items.add("Exit");
    }
    
    public void previous () {
        if (0 == currentItem) {
            currentItem = items.size() - 1;
        }
        else {
            currentItem--;
        }
        System.out.println(items.get(currentItem));
    }
    
    public void next () {
        if (items.size() - 1 == currentItem) {
            currentItem = 0;
        }
        else {
            currentItem++;
        }
        System.out.println(items.get(currentItem));
    }
    
    public void draw (Graphics g, int x, int y) throws SlickException {
        this.y = y;
        g.drawImage (new Image ("resources/images/window_dial.png"), x, y);
        for (String str : items) {
            g.drawString (str, x+30, y+30);
            y += 30;
        } 
    }
    
    public void update () {
        
    }
}
