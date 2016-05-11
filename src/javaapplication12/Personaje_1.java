/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 *
 * @author Estudiante
 */
public class Personaje_1 {
    
    private int x;
    private int y;
    
    
    public void dibujar(Graphics g){
        g.setColor(Color.black);
        g.drawRect(x+195, y+15, 60, 60);  
        g.setColor(Color.BLUE);
        g.drawRect(x+200, y+50, 50, -25);  
        g.setColor(Color.black);
        g.fillOval(x+200, y+50, 25, 25);//x,y,ancho,alto
        g.fillOval(x+225, y+50, 25, 25);
        
        
    }
    
        
    public void keyPressed(KeyEvent ke){
        switch (ke.getKeyCode()){
            case KeyEvent.VK_S: y += 10; break;
            case KeyEvent.VK_W: y -= 10; break;
            case KeyEvent.VK_A: x -= 10; break;
            case KeyEvent.VK_D: x += 10; break;
        }
        
    }
    
    
    public void keyTyped(KeyEvent e){
        
    }

    
    public void keyReleased(KeyEvent e) {
            
    }
}
