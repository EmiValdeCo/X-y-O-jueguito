/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xyo;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
/**
 *
 * @author andre
 */
public class Xyo {

   int opcion[]=new int[9];
	 String texto, x="x",o="o";
	private JFrame frame;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
 
			public void run() {
				try {
 
					Xyo window = new Xyo();
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
	public Xyo() {
		initialize();
	}
 
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JButton bt1 = new JButton("");
		bt1.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt2 = new JButton("");
		bt2.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt3 = new JButton("");
		bt3.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt4 = new JButton("");
		bt4.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt5 = new JButton("");
		bt5.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt6 = new JButton("");
		bt6.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt7 = new JButton("");
		bt7.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt8 = new JButton("");
		bt8.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt9 = new JButton("");
		bt9.setFont(new Font("Tahoma", Font.BOLD, 25));
 
 
 
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 398, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
 
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
 
 
					while (true) {
						texto= JOptionPane.showInputDialog("Introduzca X , O ?: ").toString().toLowerCase();
						if (texto.equals(x)) {
					         //   System.out.print(" son iguales en X");
					            bt1.setText(texto);
					            opcion[0]=1;
					            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
					            break;
						  }
						 if (texto.equals(o)) {
					          //  System.out.print(" son iguales en O");
					            bt1.setText(texto);
					            opcion[0]=2;
					            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
					            break;
					      }
 
					}
 
					desactiva(bt1);
			}
		});
		bt1.setBounds(23, 28, 89, 65);
		frame.getContentPane().add(bt1);
 
 
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desactiva(bt2);
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca X , O ?: ").toString().toLowerCase();
					if (texto.equals(x)) {
				         //   System.out.print(" son iguales en X");
				            bt2.setText(texto);
				            opcion[1]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
 
				            break;
					  }
					 if (texto.equals(o)) {
				          //  System.out.print(" son iguales en O");
				            bt2.setText(texto);
				            opcion[1]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
 
				}
 
			}
		});
		bt2.setBounds(152, 28, 89, 65);
		frame.getContentPane().add(bt2);
 
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desactiva(bt3);
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca X , O ?: ").toString().toLowerCase();
					if (texto.equals(x)) {
				         //   System.out.print(" son iguales en X");
				            bt3.setText(texto);
				            opcion[2]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            bt3.setEnabled(false);
				            break;
					  }
					 if (texto.equals(o)) {
				          //  System.out.print(" son iguales en O");
				            bt3.setText(texto);
				            opcion[2]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
 
				}
 
			}
		});
		bt3.setBounds(268, 28, 89, 65);
		frame.getContentPane().add(bt3);
 
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desactiva(bt4);
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca X , O ?: ").toString().toLowerCase();
					if (texto.equals(x)) {
				         //   System.out.print(" son iguales en X");
				            bt4.setText(texto);
				            opcion[3]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
					  }
					 if (texto.equals(o)) {
				          //  System.out.print(" son iguales en O");
				            bt4.setText(texto);
				            opcion[3]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
 
				}
 
			}
		});
		bt4.setBounds(23, 104, 89, 65);
		frame.getContentPane().add(bt4);
 
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desactiva(bt5);
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca X , O ?: ").toString().toLowerCase();
					if (texto.equals(x)) {
				         //   System.out.print(" son iguales en X");
				            bt5.setText(texto);
				            opcion[4]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
					  }
					 if (texto.equals(o)) {
				          //  System.out.print(" son iguales en O");
				            bt5.setText(texto);
				            opcion[4]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
 
				}
 
			}
		});
		bt5.setBounds(152, 104, 89, 65);
		frame.getContentPane().add(bt5);
 
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desactiva(bt6);
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca X , O ?: ").toString().toLowerCase();
					if (texto.equals(x)) {
				         //   System.out.print(" son iguales en X");
				            bt6.setText(texto);
				            opcion[5]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
					  }
					 if (texto.equals(o)) {
				          //  System.out.print(" son iguales en O");
				            bt6.setText(texto);
				            opcion[5]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
 
				}
 
			}
		});
		bt6.setBounds(268, 104, 89, 65);
		frame.getContentPane().add(bt6);
 
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desactiva(bt7);
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca X , O ?: ").toString().toLowerCase();
					if (texto.equals(x)) {
				         //   System.out.print(" son iguales en X");
				            bt7.setText(texto);
				            opcion[6]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
					  }
					 if (texto.equals(o)) {
				          //  System.out.print(" son iguales en O");
				            bt7.setText(texto);
				            opcion[6]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
 
				}
 
			}
		});
		bt7.setBounds(23, 181, 89, 70);
		frame.getContentPane().add(bt7);
 
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desactiva(bt8);
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca X , O ?: ").toString().toLowerCase();
					if (texto.equals(x)) {
				         //   System.out.print(" son iguales en X");
				            bt8.setText(texto);
				            opcion[7]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
					  }
					 if (texto.equals(o)) {
				          //  System.out.print(" son iguales en O");
				            bt8.setText(texto);
				            opcion[7]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
 
				}
 
			}
		});
		bt8.setBounds(152, 180, 89, 71);
		frame.getContentPane().add(bt8);
 
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desactiva(bt9);
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca X , O ?: ").toString().toLowerCase();
					if (texto.equals(x)) {
				         //   System.out.print(" son iguales en X");
				            bt9.setText(texto);
				            opcion[8]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
					  }
					 if (texto.equals(o)) {
				          //  System.out.print(" son iguales en O");
				            bt9.setText(texto);
				            opcion[8]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
 
				}
 
			}
		});
		bt9.setBounds(268, 180, 89, 71);
		frame.getContentPane().add(bt9);
	}
 
 
	void validar(JButton bt1,JButton bt2,JButton bt3,JButton bt4,JButton bt5,JButton bt6,JButton bt7,JButton bt8,JButton bt9){
	 //Ganar en X
			if(opcion[0]==1 && opcion[1]==1 && opcion[2]==1){JOptionPane.showMessageDialog(null,"Ganaste maldito X");BotonColorRed(bt1, bt2, bt3); }
			if(opcion[0]==1 && opcion[4]==1 && opcion[8]==1){JOptionPane.showMessageDialog(null,"Ganaste maldito X");BotonColorRed(bt1, bt5, bt9); }
			if(opcion[0]==1 && opcion[3]==1 && opcion[6]==1){JOptionPane.showMessageDialog(null,"Ganaste maldito X");BotonColorRed(bt1, bt4, bt7); }
 
			if(opcion[1]==1 && opcion[4]==1 && opcion[7]==1){JOptionPane.showMessageDialog(null,"Ganaste maldito X");BotonColorRed(bt2, bt5, bt8); }
 
			if(opcion[2]==1 && opcion[4]==1 && opcion[6]==1){JOptionPane.showMessageDialog(null,"Ganaste maldito X");BotonColorRed(bt3, bt5, bt7); }
			if(opcion[2]==1 && opcion[5]==1 && opcion[8]==1){JOptionPane.showMessageDialog(null,"Ganaste maldito X");BotonColorRed(bt3, bt6, bt9); }
 
			if(opcion[3]==1 && opcion[4]==1 && opcion[6]==1){JOptionPane.showMessageDialog(null,"Ganaste maldito X");BotonColorRed(bt4, bt5, bt6); }
 
			if(opcion[6]==1 && opcion[7]==1 && opcion[8]==1){JOptionPane.showMessageDialog(null,"Ganaste maldito X");BotonColorRed(bt7, bt8, bt9); }
 
   //Ganar en O		
			if(opcion[0]==2 && opcion[1]==2 && opcion[2]==2){JOptionPane.showMessageDialog(null,"Ganaste maldito O");BotonColorGreen(bt1, bt2, bt3); }
			if(opcion[0]==2 && opcion[4]==2 && opcion[8]==2){JOptionPane.showMessageDialog(null,"Ganaste maldito O");BotonColorGreen(bt1, bt5, bt9); }
			if(opcion[0]==2 && opcion[3]==2 && opcion[6]==2){JOptionPane.showMessageDialog(null,"Ganaste maldito O");BotonColorGreen(bt1, bt4, bt7); }
 
			if(opcion[1]==2 && opcion[4]==2 && opcion[7]==2){JOptionPane.showMessageDialog(null,"Ganaste maldito O");BotonColorGreen(bt2, bt5, bt8); }
 
			if(opcion[2]==2 && opcion[4]==2 && opcion[6]==2){JOptionPane.showMessageDialog(null,"Ganaste maldito O");BotonColorGreen(bt3, bt5, bt7); }
			if(opcion[2]==2 && opcion[5]==2 && opcion[8]==2){JOptionPane.showMessageDialog(null,"Ganaste maldito O");BotonColorGreen(bt3, bt6, bt9); }
 
			if(opcion[3]==2 && opcion[4]==2 && opcion[6]==2){JOptionPane.showMessageDialog(null,"Ganaste maldito O");BotonColorGreen(bt4, bt5, bt6); }
 
			if(opcion[6]==2 && opcion[7]==2 && opcion[8]==2){JOptionPane.showMessageDialog(null,"Ganaste maldito O");BotonColorGreen(bt7, bt8, bt9); }
 
		}
 
	void desactiva(JButton bt){
		  bt.setEnabled(false);
	}
	void BotonColorRed(JButton bt1,JButton bt2,JButton bt3){
		bt1.setBackground(Color.RED);
		bt2.setBackground(Color.RED);
		bt3.setBackground(Color.RED);
	}
	void BotonColorGreen(JButton bt1,JButton bt2,JButton bt3){
		bt1.setBackground(Color.GREEN);
		bt2.setBackground(Color.GREEN);
		bt3.setBackground(Color.GREEN);
	}
}
