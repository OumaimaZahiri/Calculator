package com.mycompany.calculatrice;

import java.awt.event.*;

public class listener implements ActionListener {

	private Interface i;
	
	public listener(Interface i) {
		this.i = i;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object b = e.getSource();
		
		if (b==i.getButton0()) {
			button0ActionPerformed(e);
		}
		
		if (b==i.getButton1()) {
			button1ActionPerformed(e);
		}
		
		if (b==i.getButton2()) {
			button2ActionPerformed(e);
		}
		
		if (b==i.getButton3()) {
			button3ActionPerformed(e);
		}
		
		if (b==i.getButton4()) {
			button4ActionPerformed(e);
		}
		
		if (b==i.getButton5()) {
			button5ActionPerformed(e);
		}
		
		if (b==i.getButton6()) {
			button6ActionPerformed(e);
		}
		
		if (b==i.getButton7()) {
			button7ActionPerformed(e);
		}
		
		if (b==i.getButton8()) {
			button8ActionPerformed(e);
		}
		
		if (b==i.getButton9()) {
			button9ActionPerformed(e);
		}
		
		if (b==i.getMult()) {
			multActionPerformed(e);
		}
		
		if (b==i.getPlus()) {
			plusActionPerformed(e);
		}
		
		if (b==i.getDivide()) {
			divideActionPerformed(e);
		}
		
		if (b==i.getPower()) {
			powerActionPerformed(e);
		}
		
		if (b==i.getMinus()) {
			minusActionPerformed(e);
		}
		
		if (b==i.getModulo()) {
			moduloActionPerformed(e);
		}
		
		if (b==i.getComa()) {
			comaActionPerformed(e);
		}
		
		if (b==i.getAns()) {
			ansActionPerformed(e);
		}
		
		if (b==i.getClear()) {
			clearActionPerformed(e);
		}
		
		if (b==i.getEnter()) {
			enterActionPerformed();
		}
		
		if (b==i.getSc()) {
			scActionPerformed(e);
		}

		
	}
		
		
		private void powerActionPerformed(ActionEvent e) {
			i.setText(i.gettext() + "^");
	}

		private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
	    	i.setText(i.gettext() + "1");
	    }//GEN-LAST:event_button1ActionPerformed

	    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
	    	i.setText(i.gettext() + "4");
	    }//GEN-LAST:event_button4ActionPerformed

	    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
	    	i.setText(i.gettext() + "7");
	    }//GEN-LAST:event_button7ActionPerformed

	    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
	    	i.setText(i.gettext() + "8");
	    }//GEN-LAST:event_button8ActionPerformed

	    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
	    	System.out.println(i.gettext() + "9");
	    	i.setText(i.gettext() + "9");
	    }//GEN-LAST:event_button9ActionPerformed

	    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
	    	i.setText(i.gettext() + "3");
	    }//GEN-LAST:event_button3ActionPerformed

	    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
	    	i.setText(i.gettext() + "6");
	    }//GEN-LAST:event_button6ActionPerformed

	    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
	    	if (i.gettext()=="0") { // si le chiffre 0 est déjà sur le text field il n'y a pas besoin de le réécrire
	            i.setText("0");
	    	}
	    	else { i.setText(i.gettext() + "0"); }
	    }//GEN-LAST:event_button0ActionPerformed

	    public void enterActionPerformed() {//GEN-FIRST:event_enterActionPerformed
	        calcul cal=new calcul();
	        i.setStr(i.gettext());
	        i.setResult(cal.eval(i.getStr()));
	        System.out.println(i.getResult());
	        if ((i.getResult().equals("Infinity"))||(i.getResult().equals("NaN"))) {
	            popup p = new popup("(You cannot divide by zero !)");
	            p.show();
	        }
	        else if (i.getResult().equals("Error")) { }
	        else {
	            i.setText(i.getResult());
	            i.setStr(i.getResult());
	        }
	    }//GEN-LAST:event_enterActionPerformed

	    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
	        
	    	i.setText(i.gettext() + "+");
	    }//GEN-LAST:event_plusActionPerformed

	    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
	        
	        i.setText("");
	    }//GEN-LAST:event_clearActionPerformed

	    private void scActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scActionPerformed
	       
	    }//GEN-LAST:event_scActionPerformed

	    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
	        
	    }//GEN-LAST:event_textActionPerformed

	    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
	    	i.setText(i.gettext() + "x");
	    }//GEN-LAST:event_multActionPerformed

	    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
	    	i.setText(i.gettext() + "/");
	    }//GEN-LAST:event_divideActionPerformed

	    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
	    	i.setText(i.gettext() + "-");
	    }//GEN-LAST:event_minusActionPerformed

	    private void moduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduloActionPerformed
	    	i.setText(i.gettext() + "%");
	    }//GEN-LAST:event_moduloActionPerformed

	    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
	    	i.setText(i.gettext() + "5");
	    }//GEN-LAST:event_button5ActionPerformed

	    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
	    	i.setText(i.gettext() + "2");
	    }//GEN-LAST:event_button2ActionPerformed
	    
	    private void comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comaActionPerformed
	    	i.setText(i.gettext() + ",");
	    }//GEN-LAST:event_comaActionPerformed


	    private void ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansActionPerformed
	    	i.setText(i.gettext() + i.getResult());
	    }//GEN-LAST:event_ansActionPerformed

	
	
}
