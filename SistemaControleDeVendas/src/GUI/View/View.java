package GUI.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View {

	private JFrame frame;
	private JTextField textCor;
	private JTextField textQuantidade;
	
	// criar um app e instanciar 

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public View() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton BotaoEnviar = new JButton("Enviar");
		
		BotaoEnviar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				// tratamento de evento
			}
		});
		
		BotaoEnviar.setBounds(209, 173, 77, 25);
		frame.getContentPane().add(BotaoEnviar);
		
		JLabel lblCor = new JLabel("Cor");
		lblCor.setBounds(85, 107, 66, 15);
		frame.getContentPane().add(lblCor);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(60, 134, 91, 15);
		frame.getContentPane().add(lblQuantidade);
		
		textCor = new JTextField();
		textCor.setBounds(162, 105, 124, 19);
		frame.getContentPane().add(textCor);
		textCor.setColumns(10);
		
		textQuantidade = new JTextField();
		textQuantidade.setBounds(162, 132, 124, 19);
		frame.getContentPane().add(textQuantidade);
		textQuantidade.setColumns(10);
		
		JLabel lblSistemaDeCores = new JLabel("Sistema de Cores");
		lblSistemaDeCores.setBounds(162, 35, 140, 44);
		frame.getContentPane().add(lblSistemaDeCores);
	}
}
