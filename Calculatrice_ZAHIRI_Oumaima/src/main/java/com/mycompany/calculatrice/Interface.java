/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculatrice;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;


/**
 *
 * @author oumai
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Calculatrice
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ans;
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
	private javax.swing.JButton clear;
    private javax.swing.JButton coma;
    private javax.swing.JButton divide;
    private javax.swing.JButton enter;
    private javax.swing.JButton minus;
    private javax.swing.JButton modulo;
    private javax.swing.JButton mult;
    private javax.swing.JButton plus;
    private javax.swing.JButton sc;
    private javax.swing.JButton power;
    private javax.swing.JTextField text;
   
    private String str="", result="";
    
    public Interface() {
        initComponents();
        clear.setBackground(Color.PINK);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
    	

        button0 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        coma = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        power = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        modulo = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        ans = new javax.swing.JButton();
        text = new javax.swing.JTextField();
        
        Image calcul = new ImageIcon("Calcul.png").getImage();
        List imgicon = new ArrayList();
        imgicon.add(calcul);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculatrice");
        setBackground(new java.awt.Color(0, 0, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(calcul);
        setIconImages(imgicon);

        button0.setText("0");
        button2.setText("2");
        button1.setText("1");
        button7.setText("7");
        coma.setText(",");
        button4.setText("4");
        button5.setText("5");
        button8.setText("8");
        enter.setText("Enter");
        button3.setText("3");
        button6.setText("6");
        button9.setText("9");
        plus.setText("+");
        minus.setText("-");
        divide.setText("/");
        modulo.setText("%");
        clear.setText("Clear");
        mult.setText("x");
        ans.setText("ANS");
        text.setText("");
        power.setText("^");
        
        listener l = new listener(this);
    	keylistener kl = new keylistener(text, l); // on a choisi de rajouter un keylistener pour d??tecter les entr??es (Enter key) 
    	// l'utilisateur peut donc soit taper entr??e sur le text field (plus simple s'il tape l'expression ?? la main), soit
    	// cliquer sur le bouton enter s'il pr??f??re passer par les boutons de l'interface.
    	
    	// on rajoute des listeners pour chacun des boutons
		text.addKeyListener(kl);
        button0.addActionListener(l);
        button1.addActionListener(l);
        button2.addActionListener(l);
        button3.addActionListener(l);
        button4.addActionListener(l);
        button5.addActionListener(l);
        button6.addActionListener(l);
        button7.addActionListener(l);
        button8.addActionListener(l);
        button9.addActionListener(l);
        coma.addActionListener(l);
        clear.addActionListener(l);
        modulo.addActionListener(l);
        plus.addActionListener(l);
        minus.addActionListener(l);
        divide.addActionListener(l);
        mult.addActionListener(l);
        ans.addActionListener(l);
        text.addActionListener(l);
        enter.addActionListener(l);
        power.addActionListener(l);

        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(text))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(coma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(button8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(ans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(4, 4, 4)
                                        .addComponent(modulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    	.addComponent(power, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(button9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button3, button6, button9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mult)
                    .addComponent(modulo)
                    .addComponent(power)
                    .addComponent(ans))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button7)
                    .addComponent(button8)
                    .addComponent(button9)
                    .addComponent(divide))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button4)
                    .addComponent(button5)
                    .addComponent(button6)
                    .addComponent(minus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button2)
                    .addComponent(button1)
                    .addComponent(button3)
                    .addComponent(plus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button0)
                    .addComponent(coma)
                    .addComponent(enter))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // les getters et setters permettent la communication entre la classe du listener et la classe Interface.
    
    public String getStr() {
        return str;
    }
    
    /**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @return the ans
	 */
	public javax.swing.JButton getAns() {
		return ans;
	}

	/**
	 * @return the button0
	 */
	public javax.swing.JButton getButton0() {
		return button0;
	}

	/**
	 * @return the button1
	 */
	public javax.swing.JButton getButton1() {
		return button1;
	}

	/**
	 * @return the button2
	 */
	public javax.swing.JButton getButton2() {
		return button2;
	}

	/**
	 * @return the button3
	 */
	public javax.swing.JButton getButton3() {
		return button3;
	}

	/**
	 * @return the button4
	 */
	public javax.swing.JButton getButton4() {
		return button4;
	}

	/**
	 * @return the button5
	 */
	public javax.swing.JButton getButton5() {
		return button5;
	}

	/**
	 * @return the button6
	 */
	public javax.swing.JButton getButton6() {
		return button6;
	}

	/**
	 * @return the button7
	 */
	public javax.swing.JButton getButton7() {
		return button7;
	}

	/**
	 * @return the button8
	 */
	public javax.swing.JButton getButton8() {
		return button8;
	}

	/**
	 * @return the button9
	 */
	public javax.swing.JButton getButton9() {
		return button9;
	}

	/**
	 * @return the clear
	 */
	public javax.swing.JButton getClear() {
		return clear;
	}

	/**
	 * @return the coma
	 */
	public javax.swing.JButton getComa() {
		return coma;
	}

	/**
	 * @return the divide
	 */
	public javax.swing.JButton getDivide() {
		return divide;
	}

	/**
	 * @return the power
	 */
	public javax.swing.JButton getPower() {
		return power;
	}
	
	/**
	 * @return the enter
	 */
	public javax.swing.JButton getEnter() {
		return enter;
	}

	/**
	 * @return the minus
	 */
	public javax.swing.JButton getMinus() {
		return minus;
	}

	/**
	 * @return the modulo
	 */
	public javax.swing.JButton getModulo() {
		return modulo;
	}

	/**
	 * @return the mult
	 */
	public javax.swing.JButton getMult() {
		return mult;
	}

	/**
	 * @return the plus
	 */
	public javax.swing.JButton getPlus() {
		return plus;
	}

	/**
	 * @return the sc
	 */
	public javax.swing.JButton getSc() {
		return sc;
	}

	/**
	 * @return the text
	 */
	public javax.swing.JTextField getText() {
		return text;
	}
	
	/**
	 * @return the text
	 */
	public String gettext() {
		return text.getText(); // permet de retourner le contenu du text field : plus simple pour les m??thodes de la classe listener.
	}

	/**
	 * @param str the str to set
	 */
	public void setStr(String str) {
		this.str = str;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String txt) {
		text.setText(txt);
	}

    
	
}
