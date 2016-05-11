/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class Carro  extends JPanel implements ActionListener, KeyListener{
    
    private Timer timer;
    private Carro_1 carro = new Carro_1();
    private Personaje_1 p1 = new Personaje_1();

    public Carro(){       
        this.timer = new Timer(5, this);
        this.setFocusable(true);
        addKeyListener(this);
        this.timer.start();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
          carro.dibujar(g);
          p1.dibujar(g);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    
    @Override
    public void keyPressed(KeyEvent ke){
    carro.keyPressed(ke);
    p1.keyPressed(ke);
        
        repaint();
    }
    
    @Override
    public void keyTyped(KeyEvent e){
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
            
    }
}
