package visual;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Implementa heranca da classe JFrame
public class HelloSwing extends JFrame {
	//Construtor da classe
	public HelloSwing() {
		super("Minha janela");
		
		//definr dimensao
		setSize(300,120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Criação de objeto JLabel
		JLabel jlabel = new JLabel("Hello java's Visual World");
		JButton buttonNorth = new JButton("Norte");
		JButton buttonSouth = new JButton("Sul");
		JButton buttonCenter = new JButton("Centro");
		JButton buttonEast = new JButton("Leste");
		JButton buttonWest = new JButton("Oeste");
		
		//Adicionar ao frame
		add(buttonCenter, BorderLayout.CENTER);
		add(buttonNorth, BorderLayout.NORTH);
		add(buttonSouth, BorderLayout.SOUTH);
		add(buttonEast, BorderLayout.EAST);
		add(buttonWest, BorderLayout.WEST);
		
		buttonCenter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Click botão CENTER");
				
			}
		});
		
		buttonNorth.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Click botão NORTH");
			}
		});
		
		
		//Habilitar visibilidade do frame apos inicialixar componentes
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new HelloSwing();
		
	}

}
