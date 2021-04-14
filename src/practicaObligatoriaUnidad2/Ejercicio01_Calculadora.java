package practicaObligatoriaUnidad2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Ejercicio01_Calculadora {

	private JFrame frame;
	private JTextField jtfNumero1;
	private JTextField jtfNumero2;
	private JTextField jtfResultado;
	
	static {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		} // Look and Feel Windows - Solo en entornos Windows
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio01_Calculadora window = new Ejercicio01_Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio01_Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Sumador");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		frame.getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel label = new JLabel("Numero 1:");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel_1.add(label, gbc_label);
		
		jtfNumero1 = new JTextField();
		GridBagConstraints gbc_jtfNumero1 = new GridBagConstraints();
		gbc_jtfNumero1.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNumero1.anchor = GridBagConstraints.WEST;
		gbc_jtfNumero1.gridx = 1;
		gbc_jtfNumero1.gridy = 0;
		panel_1.add(jtfNumero1, gbc_jtfNumero1);
		jtfNumero1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfNumero2 = new JTextField();
		GridBagConstraints gbc_jtfNumero2 = new GridBagConstraints();
		gbc_jtfNumero2.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNumero2.anchor = GridBagConstraints.WEST;
		gbc_jtfNumero2.gridx = 1;
		gbc_jtfNumero2.gridy = 1;
		panel_1.add(jtfNumero2, gbc_jtfNumero2);
		jtfNumero2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfResultado = new JTextField();
		jtfResultado.setEnabled(false);
		jtfResultado.setEditable(false);
		GridBagConstraints gbc_jtfResultado = new GridBagConstraints();
		gbc_jtfResultado.anchor = GridBagConstraints.WEST;
		gbc_jtfResultado.gridx = 1;
		gbc_jtfResultado.gridy = 2;
		panel_1.add(jtfResultado, gbc_jtfResultado);
		jtfResultado.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				suma();
			}
		});
		panel.add(btnSumar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				terminarAplicacion();
			}
		});
		panel.add(btnSalir);
		
		// Controlador del cierre de la ventana
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() { // Uso de WindowsListener y WindowsAdapter
			@Override
			public void windowClosing(WindowEvent e) {
				terminarAplicacion();
			}
		});
		
		
	}
	
	/*
	 * Metodo que permite terminar el programa al cerrar la ventana
	 */
	private void terminarAplicacion() {
		String[] opciones = {"Aceptar","Cancelar"}; // Creo un array de String con las opciones que apareceran en el cuadro de dialogo
		// Guardo en la variable eleccion el valor de la eleccion, en cual 0 significara si y 1 no
		int eleccion = JOptionPane.showOptionDialog(frame,"¿Desea cerrar la aplicación?","Salir de la aplicación",
		JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) { // Si eleccion es igual a YES (0)
			System.exit(0); // El sistema saldra de la aplicacion
		}
	}
	
	public void suma() {
		int num1 = Integer.parseInt(this.jtfNumero1.getText());
		int num2 = Integer.parseInt(this.jtfNumero2.getText());
		this.jtfResultado.setText((num1 + num2) + "");
	}

}
