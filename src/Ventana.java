import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtCalle;
	private JTextField txtJhonDoe;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(30, 11, 517, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("[Sin Base de datos]");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(35, 30, 184, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFondoTop = new JLabel("");
		lblFondoTop.setForeground(Color.WHITE);
		lblFondoTop.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFondoTop.setOpaque(true);
		lblFondoTop.setEnabled(true);
		lblFondoTop.setBackground(Color.decode("#006599"));
		lblFondoTop.setBounds(0, 0, 584, 66);
		contentPane.add(lblFondoTop);
		
		JLabel lblNewLabel_3 = new JLabel(" Datos del cliente");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBounds(20, 84, 84, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Documento:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(30, 109, 58, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setText("123456");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setBounds(98, 106, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Dirección:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_1.setBounds(30, 153, 47, 14);
		contentPane.add(lblNewLabel_4_1);
		
		txtCalle = new JTextField();
		txtCalle.setText("Calle 1 # 123");
		txtCalle.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCalle.setColumns(10);
		txtCalle.setBounds(98, 150, 140, 20);
		contentPane.add(txtCalle);
		
		JLabel lblNewLabel_4_2 = new JLabel("Nombres:");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_2.setBounds(278, 109, 46, 14);
		contentPane.add(lblNewLabel_4_2);
		
		txtJhonDoe = new JTextField();
		txtJhonDoe.setText("Jhon Doe");
		txtJhonDoe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtJhonDoe.setColumns(10);
		txtJhonDoe.setBounds(357, 106, 190, 20);
		contentPane.add(txtJhonDoe);
		
		JLabel lblNewLabel_4_3 = new JLabel("Teléfono:");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_3.setBounds(278, 153, 46, 14);
		contentPane.add(lblNewLabel_4_3);
		
		textField_1 = new JTextField();
		textField_1.setText("5554433");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(357, 150, 190, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblNewLabel_2.setBounds(10, 90, 564, 91);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_1 = new JLabel(" Datos de factura");
		lblNewLabel_3_1.setOpaque(true);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3_1.setBackground(Color.WHITE);
		lblNewLabel_3_1.setBounds(20, 186, 87, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_4 = new JLabel("N° Factura:");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_4.setBounds(27, 216, 58, 14);
		contentPane.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_4_1 = new JLabel("1");
		lblNewLabel_4_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_4_1.setBounds(98, 216, 58, 14);
		contentPane.add(lblNewLabel_4_4_1);
		
		JLabel lblNewLabel_4_4_2 = new JLabel("Fecha:");
		lblNewLabel_4_4_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_4_2.setBounds(282, 216, 58, 14);
		contentPane.add(lblNewLabel_4_4_2);
		
		JLabel lblNewLabel_4_4_1_1 = new JLabel("2021/50/21");
		lblNewLabel_4_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_4_1_1.setBounds(357, 216, 84, 14);
		contentPane.add(lblNewLabel_4_4_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblNewLabel_2_1.setBounds(10, 192, 564, 66);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4_4_3_1 = new JLabel("Ver listado de facturas");
		//lblNewLabel_4_4_3_1.setIcon(new ImageIcon(Ventana.class.getResource("/images/menu.png")));
		lblNewLabel_4_4_3_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png")).getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH)));
		lblNewLabel_4_4_3_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_4_3_1.setBounds(30, 267, 144, 32);
		contentPane.add(lblNewLabel_4_4_3_1);
		
		JLabel lblNewLabel_4_4_3_1_1 = new JLabel("Añadir");
		lblNewLabel_4_4_3_1_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mas.png")).getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH)));
		lblNewLabel_4_4_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_4_3_1_1.setBounds(367, 267, 74, 32);
		contentPane.add(lblNewLabel_4_4_3_1_1);
		
		JLabel lblNewLabel_4_4_3_1_1_1 = new JLabel("Eliminar");
		lblNewLabel_4_4_3_1_1_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png")).getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH)));
		lblNewLabel_4_4_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_4_3_1_1_1.setBounds(473, 267, 74, 32);
		contentPane.add(lblNewLabel_4_4_3_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblNewLabel_2_1_1.setBounds(8, 263, 568, 40);
		contentPane.add(lblNewLabel_2_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(10, 310, 564, 109);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setToolTipText("");
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Agua", "2", "500", "1000.0"},
				{"Cereal", "5", "1000", "5000.0"},
				{"Leche", "2", "300", "600.0"},
			},
			new String[] {
				"Producto", "Cantidad", "Valor", "Sub Total"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_4_4_3 = new JLabel("SubTotal:");
		lblNewLabel_4_4_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_4_3.setBounds(35, 430, 58, 14);
		contentPane.add(lblNewLabel_4_4_3);
		
		JLabel lblNewLabel_4_4_1_2 = new JLabel("6600.0");
		lblNewLabel_4_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_4_1_2.setBounds(116, 430, 40, 14);
		contentPane.add(lblNewLabel_4_4_1_2);
		
		JLabel lblNewLabel_4_4_3_2 = new JLabel("% Descuento:");
		lblNewLabel_4_4_3_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_4_3_2.setBounds(30, 455, 74, 14);
		contentPane.add(lblNewLabel_4_4_3_2);
		
		textField_2 = new JTextField();
		textField_2.setText("5");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(116, 452, 40, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_4_4_3_2_1 = new JLabel("Iva 19%:");
		lblNewLabel_4_4_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_4_3_2_1.setBounds(30, 480, 74, 14);
		contentPane.add(lblNewLabel_4_4_3_2_1);
		
		JLabel lblNewLabel_4_4_1_2_1 = new JLabel("1254.0");
		lblNewLabel_4_4_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_4_1_2_1.setBounds(116, 480, 40, 14);
		contentPane.add(lblNewLabel_4_4_1_2_1);
		
		JLabel lblNewLabel_4_4_3_2_1_1 = new JLabel("Total Factura:");
		lblNewLabel_4_4_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_4_3_2_1_1.setBounds(30, 506, 74, 14);
		contentPane.add(lblNewLabel_4_4_3_2_1_1);
		
		JLabel lblNewLabel_4_4_1_2_1_1 = new JLabel("7524.0");
		lblNewLabel_4_4_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_4_1_2_1_1.setBounds(116, 506, 40, 14);
		contentPane.add(lblNewLabel_4_4_1_2_1_1);
		
		JLabel lblNewLabel_4_4_3_2_2 = new JLabel("Valor descontado:");
		lblNewLabel_4_4_3_2_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_4_3_2_2.setBounds(234, 455, 90, 14);
		contentPane.add(lblNewLabel_4_4_3_2_2);
		
		JLabel lblNewLabel_4_4_1_2_2 = new JLabel("330.0");
		lblNewLabel_4_4_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_4_1_2_2.setBounds(345, 455, 40, 14);
		contentPane.add(lblNewLabel_4_4_1_2_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setToolTipText("");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(177, 451, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(353, 527, 127, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setForeground(Color.BLACK);
		btnLimpiar.setBackground(Color.LIGHT_GRAY);
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLimpiar.setBounds(490, 527, 84, 23);
		contentPane.add(btnLimpiar);
		
		JLabel lblFondoTop_1 = new JLabel("");
		lblFondoTop_1.setOpaque(true);
		lblFondoTop_1.setForeground(Color.WHITE);
		lblFondoTop_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFondoTop_1.setEnabled(true);
		lblFondoTop_1.setBackground(new Color(0, 101, 153));
		lblFondoTop_1.setBounds(0, 561, 584, 20);
		contentPane.add(lblFondoTop_1);
	}
}
