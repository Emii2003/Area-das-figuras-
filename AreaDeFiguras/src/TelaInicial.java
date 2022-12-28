import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 392, 535);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Triangulo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				triangulo janela = new triangulo();
				
				TelaInicial.this.dispose();
				
				janela.setVisible(true);
			}
		});
		btnNewButton.setBounds(67, 25, 250, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quadrado");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Quadrado janela = new Quadrado();
				
				TelaInicial.this.dispose();
				
				janela.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(67, 124, 250, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Retangulo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Retangulo janela = new Retangulo();
				
				TelaInicial.this.dispose();
				
				janela.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(67, 223, 250, 23);
		panel.add(btnNewButton_2);
	}
}
