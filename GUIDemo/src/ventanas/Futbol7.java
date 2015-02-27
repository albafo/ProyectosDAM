package ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import controllers.UsuarioController;
public class Futbol7 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image img;

	public Futbol7(VentanaPrincipal frame, String src) {
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
		 

		 JTextField inputEmail = new JTextField();
		 inputEmail.setBounds(435, 305, 171, 39);
			add(inputEmail);
			inputEmail.setColumns(10);
			
			JLabel lblEmail = new JLabel("Email");
			lblEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			lblEmail.setBounds(435, 261, 171, 33);
			add(lblEmail);
			
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			lblPassword.setBounds(435, 375, 171, 33);
			add(lblPassword);
			
			JTextField inputPassword = new JTextField();
			inputPassword.setColumns(10);
			inputPassword.setBounds(435, 419, 171, 39);
			add(inputPassword);
			JTextPane textFallo = new JTextPane();
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textFallo.setVisible(false);
					if(UsuarioController.checkRegistro(inputEmail.getText(), inputPassword.getText())==-1) {
						
						textFallo.setForeground(Color.RED);
						textFallo.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
						textFallo.setBounds(433, 587, 168, 16);
						textFallo.setText("Fallo de autentificación!!!");
						textFallo.setOpaque(false);
						frame.add(textFallo);
						textFallo.setVisible(true);
					}
					
				}
			});
			JButton btnAtras = new BotonMod("/img/boton_atras.png", "/img/boton_atras_clicked.png");
			btnAtras.setBounds(52, 57, 67, 49);
			add(btnAtras);
			btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					frame.atras();
				}
			});

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
