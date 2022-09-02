/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA.DESIGNS;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author james
 */
public class DiseComboMenu extends BasicComboBoxUI{
    
    public static ComboBoxUI createUI(JComponent cbmenu){
        
        return new DiseComboMenu();
    }

//    @Override
    protected JButton createArrowButton() {
        JButton btn = new JButton();
        btn.setBackground(new java.awt.Color(14, 22, 40));
        btn.setSize(0,0);
        btn.setBorder(BorderFactory.createLineBorder(new java.awt.Color(14, 22, 40),4));
        btn.setEnabled(false);
        return btn;
    }
//    
//
//    @Override
//    public void paintCurrentValueBackground(Graphics grphcs, Rectangle bounds, boolean bln) {
//        grphcs.setColor(Color.yellow);
//        grphcs.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
//    }

    @Override
    protected ListCellRenderer createRenderer() {
        return new DefaultListCellRenderer(){
                    @Override
                    public Component getListCellRendererComponent(JList<?> jlist, Object o, int i, boolean bln, boolean bln1) {
                        super.getListCellRendererComponent(jlist, o, i, bln, bln1); //To change body of generated methods, choose Tools | Templates.
                        jlist.setSelectionBackground(new java.awt.Color(14, 22, 40));
//                        jlist.setBackground(isSelected ? Color.cyan : Color.blue);
                        jlist.setSelectionForeground(new java.awt.Color(184,199,206));
//                        jlist.setBorder(BorderFactory.createLineBorder(Color.green, 2));
                        return this;
                    }
        };
    }
    
}
