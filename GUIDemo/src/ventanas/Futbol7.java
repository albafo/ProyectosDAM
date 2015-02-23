package ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Futbol7 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image img;
	
	public Futbol7(JFrame frame, String src) {
		 this.img=(new ImageIcon(getClass().getResource(src))).getImage();
		 Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		 setPreferredSize(size);
		 setMinimumSize(size);
		 setMaximumSize(size);
		 setSize(size);
		 setLayout(null);
		 JButton btnLogin = new BotonMod("/img/button_blue.png", "/img/button_blue_clicked.png", "Log-in", Color.WHITE);
		 btnLogin.setBounds(415, 499, 200, 44);
		 this.add(btnLogin);
		 JTextField textField = new JTextField();
			textField.setBounds(435, 305, 171, 39);
			add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel = new JLabel("Email");
			lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			lblNewLabel.setBounds(435, 261, 171, 33);
			add(lblNewLabel);
			
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			lblPassword.setBounds(435, 375, 171, 33);
			add(lblPassword);
			
			JTextField textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(435, 419, 171, 39);
			add(textField_1);
	}
	public Futbol7() {
		this.img=null;
	}
	
	
	
	
	@Override
	public void paintComponent(Graphics g) {
		if(this.img!=null) {
			setOpaque(false);
			Dimension tamanio = getSize();
			g.drawImage(img,0,0,tamanio.width, tamanio.height, null);

		}
	  }
}
