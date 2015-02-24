package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotonMod extends JButton{
	
	ImageIcon icon;
	ImageIcon iconPressed;
	public BotonMod(String srcImg, String srcImgClick, String text, Color color) {
		
		icon=new ImageIcon(getClass().getResource(srcImg));
		iconPressed=new ImageIcon(getClass().getResource(srcImgClick));
		setIcon(icon);
		
		setBorderPainted(false); 
		setContentAreaFilled(false); 
		setFocusPainted(false); 
		setOpaque(false);
		setHorizontalTextPosition(AbstractButton.CENTER);
		setVerticalTextPosition(AbstractButton.CENTER);
		setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		setForeground(color);
		setText(text);
	}
	
	public BotonMod(String srcImg, String srcImgClick) {
		
		icon=new ImageIcon(getClass().getResource(srcImg));
		iconPressed=new ImageIcon(getClass().getResource(srcImgClick));
		setIcon(icon);
		
		setBorderPainted(false); 
		setContentAreaFilled(false); 
		setFocusPainted(false); 
		setOpaque(false);
		
	}
	 
	 @Override
     protected void paintComponent(Graphics g) {
		 if (getModel().isPressed()) {
			 setIcon(icon);
        
         } else {
        	 setIcon(iconPressed);
         }
		 super.paintComponent(g);
	 }
}
