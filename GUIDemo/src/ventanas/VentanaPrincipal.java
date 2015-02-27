package ventanas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.Stack;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Stack<JPanel> stack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public VentanaPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 768);
		stack=new Stack<JPanel>();
		contentPane = new SeleccionDeporte(this, "/img/background_tactics.jpg");
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		//JPanel futbol7=new Futbol7(this, "/img/background_tactics.jpg");
		//setContentPane(futbol7);
		//futbol7.setLayout(null);
		
		
		
	}
	
	public void addPanelStack(JPanel panel) {
		stack.push(panel);
	}
	
	public void atras() {
		getContentPane().setVisible(false);
		JPanel panel=stack.pop();
		setContentPane(panel);
		panel.setVisible(true);
	}
}
