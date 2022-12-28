import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Quadrado extends JFrame {

	private JPanel contentPane;
	private JTextField cx1;
	private JTextField cx2;
	private JTextField cxResu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quadrado frame = new Quadrado();
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
	public Quadrado() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 667, 514);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Quadrado.class.getResource("/img/quadrado1.jpg")));
		lblNewLabel.setBounds(185, 11, 300, 194);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(56, 238, 142, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Largura");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(56, 294, 142, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u00C1rea");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(56, 363, 142, 30);
		panel.add(lblNewLabel_3);
		
		cx1 = new JTextField();
		cx1.setBounds(207, 243, 86, 20);
		panel.add(cx1);
		cx1.setColumns(10);
		
		cx2 = new JTextField();
		cx2.setBounds(207, 299, 86, 20);
		panel.add(cx2);
		cx2.setColumns(10);
		
		cxResu = new JTextField();
		cxResu.setEditable(false);
		cxResu.setBounds(208, 368, 86, 20);
		panel.add(cxResu);
		cxResu.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double altura, area, base;
				base = Double.parseDouble(cx2.getText());
				
				altura = Double.parseDouble(cx1.getText());
				
				area = base * altura;
				
				cxResu.setText(String.valueOf(area));
					
			}
		});
		btnNewButton.setBounds(56, 442, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cx1.setText("");
				cx2.setText("");
				cxResu.setText("");
				
				cx1.requestFocus();
				
			}
		});
		btnNewButton_1.setBounds(207, 442, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("In\u00EDcio");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial janela = new TelaInicial();
				
				Quadrado.this.dispose();
				
				janela.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(367, 442, 89, 23);
		panel.add(btnNewButton_2);
	}

}
