import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Retangulo extends JFrame {

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
					Retangulo frame = new Retangulo();
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
	public Retangulo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 710, 536);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(121, 11, 302, 208);
		lblNewLabel.setIcon(new ImageIcon(Retangulo.class.getResource("/img/retangulo1.jpg")));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(55, 240, 117, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Largura");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(55, 298, 117, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u00C1rea\r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(55, 356, 117, 30);
		panel.add(lblNewLabel_3);
		
		cx1 = new JTextField();
		cx1.setBounds(227, 245, 86, 20);
		panel.add(cx1);
		cx1.setColumns(10);
		
		cx2 = new JTextField();
		cx2.setBounds(227, 303, 86, 20);
		panel.add(cx2);
		cx2.setColumns(10);
		
		cxResu = new JTextField();
		cxResu.setEditable(false);
		cxResu.setBounds(227, 361, 86, 20);
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
		btnNewButton.setBounds(55, 444, 89, 23);
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
		btnNewButton_1.setBounds(227, 444, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Inicio");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaInicial janela = new TelaInicial();
				
				Retangulo.this.dispose();
				
				janela.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(399, 444, 89, 23);
		panel.add(btnNewButton_2);
	}

}
