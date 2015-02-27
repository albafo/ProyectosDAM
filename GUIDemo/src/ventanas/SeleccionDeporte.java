package ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SeleccionDeporte extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image img;
	private static JPanel thisPanel;
	
	public SeleccionDeporte(VentanaPrincipal frame, String src) {
		 this.img=(new ImageIcon(getClass().getResource(src))).getImage();
		 thisPanel=this;
		 Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		 setPreferredSize(size);
		 setMinimumSize(size);
		 setMaximumSize(size);
		 setSize(size);
		 setLayout(null);
		 JButton btnFutbol7 = new BotonMod("/img/button_blue.png", "/img/button_blue_clicked.png", "Fútbol 7", Color.WHITE);
		 btnFutbol7.setBounds(415, 299, 200, 44);
			btnFutbol7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					setVisible(false);
					frame.addPanelStack(thisPanel);
					JPanel contentPane=new Futbol7(frame, "/img/background_tactics.jpg");
					frame.setContentPane(contentPane);
					contentPane.setVisible(true);
				}
			});
			
		   
			
			add(btnFutbol7);
	}
	public SeleccionDeporte() {
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
