package com.mycompany.calculatrice;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JTextField;

public class keylistener extends Applet implements KeyListener {
	
	private JTextField t;
	private listener l;
  
	public keylistener(JTextField t, listener l) {
		this.t = t;
		this.l = l;
	}
  
	public void init(){
		add(t);
		t.addKeyListener(this);
    }
  
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			Toolkit.getDefaultToolkit().beep();
			l.enterActionPerformed();
			System.out.println("ENTER pressed");
        	}
     	}
}
