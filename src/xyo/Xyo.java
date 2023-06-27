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

   //Arreglo donde se define el espacio que es nueve esto es porque son 9 cuadrados 
   int opcion[]=new int[9];
	 String texto, x="x",o="o"; //Se declara el valor de texto y de x y o pero estas inicializadas respectivamente
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
 
	//Inicializa la aplicacion.
	 
	public Xyo() {
		initialize();
	}
 
	//Inicializa el frame
	public void initialize() {
		JButton bt1 = new JButton(""); //Se crea boton y se le asigna variable con una cadena de texto vacia
                bt1.setBackground(Color.WHITE);
		bt1.setFont(new Font("Tahoma", Font.BOLD, 25)); //Font es el estilo de la letra este caso es tahoma, el font es negrita y el tamaño de este
		JButton bt2 = new JButton("");
                bt2.setBackground(Color.WHITE);
		bt2.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt3 = new JButton("");
                bt3.setBackground(Color.WHITE);
		bt3.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt4 = new JButton("");
                bt4.setBackground(Color.WHITE);
		bt4.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt5 = new JButton("");
                bt5.setBackground(Color.WHITE);
		bt5.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt6 = new JButton("");
                bt6.setBackground(Color.WHITE);
		bt6.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt7 = new JButton("");
                bt7.setBackground(Color.WHITE);
		bt7.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt8 = new JButton("");
                bt8.setBackground(Color.WHITE);
		bt8.setFont(new Font("Tahoma", Font.BOLD, 25));
		JButton bt9 = new JButton("");
                bt9.setBackground(Color.WHITE);
		bt9.setFont(new Font("Tahoma", Font.BOLD, 25));
 
 
 
		frame = new JFrame(); //Se crea el frame y el nombre de este
		frame.setResizable(false); // Se configura para que el usuario no puea modificar el tamaño de la ventana
		frame.setBounds(100, 100, 398, 300); //Ubicacion de la ventana y tamaño de la ventana, los primeros dos datos nos dicen la ubicacion de la ventana y los dos ultimos datos nos dice la el tamaño que tendra la ventana
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Se configura que cuando le den al boton x pata cerrar la ventana, la aplicacion dejara de correrse
		frame.getContentPane().setLayout(null); //Para que no se pongan automaticamente las cosas y se modificar con puro codigo
		frame.setLocationRelativeTo(null); //Esto es para que la ventana se coloque en el centro
              
                
 
		bt1.addActionListener(new ActionListener() { //Evento que al darle click al boton 1 suceda todo esto
			public void actionPerformed(ActionEvent arg0) { //El metodo que se va a reliazar cuando se de click
 
 
					while (true) { //Se inicia bucle cuando se cumpla ciertas condiciones
						texto= JOptionPane.showInputDialog("Introduzca 'x' o 'o': ").toString().toLowerCase(); //Solicitar al usuario que ingrese x || o
						if (texto.equals(x)) { //Comparacion si el texto es igual a x
					            bt1.setText(texto); //Se pone el texto asignado
					            opcion[0]=1; //Se le agrega el valor de 1 a la posicion 0 del arreglo (1 = x)
					            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9); //Se llama a este metodo para hacer una validacion de que si gano
					            break;
						  }
                                                else if (texto.equals(o)) { //Comparacion si el texto es igual a 0
					            bt1.setText(texto);
					            opcion[0]=2; //Se le agrega el valor de 1 a la posicion 0 del arreglo (2 = o)
					            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
					            break;
					      } else {
                                                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, ingrese 'x' o 'o'."); 
                                               }
					}
 
					desactiva(bt1);//Evitar que interactuen con el boton desactivandolo
			}
		});
		bt1.setBounds(23, 28, 89, 65); //Configuracion del boton en la ventana, los primeros dos numeros son las coordenadas primero "x" y despues "y", y los otros dos numeros son los pixeles primero el ancho y despues la altura
		frame.getContentPane().add(bt1);
 
 
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca 'x' o 'o': ").toString().toLowerCase();
					if (texto.equals(x)) {
				            bt2.setText(texto);
				            opcion[1]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
 
				            break;
					  }
                                        else if (texto.equals(o)) {
				            bt2.setText(texto);
				            opcion[1]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
                                        else {
                                                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, ingrese 'x' o 'o'."); 
                                               }
 
				}
				desactiva(bt2);
 
			}
		});
		bt2.setBounds(152, 28, 89, 65);
		frame.getContentPane().add(bt2);
 
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca 'x' o 'o': ").toString().toLowerCase();
					if (texto.equals(x)) {
				            bt3.setText(texto);
				            opcion[2]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            bt3.setEnabled(false);
				            break;
					  }
                                        else if (texto.equals(o)) {
				            bt3.setText(texto);
				            opcion[2]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
                                        else {
                                                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, ingrese 'x' o 'o'."); 
                                               }
 
				}                                
				desactiva(bt3);
 
			}
		});
		bt3.setBounds(268, 28, 89, 65);
		frame.getContentPane().add(bt3);
 
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca 'x' o 'o': ").toString().toLowerCase();
					if (texto.equals(x)) {
				         //   System.out.print(" son iguales en X");
				            bt4.setText(texto);
				            opcion[3]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
					  }
                                        else if (texto.equals(o)) {
				          //  System.out.print(" son iguales en O");
				            bt4.setText(texto);
				            opcion[3]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
                                      else {
                                        JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, ingrese 'x' o 'o'."); 
                                               }
				}
                        desactiva(bt4);
			}
		});
		bt4.setBounds(23, 104, 89, 65);
		frame.getContentPane().add(bt4);
 
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca 'x' o 'o': ").toString().toLowerCase();
					if (texto.equals(x)) {
				            bt5.setText(texto);
				            opcion[4]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
					  }
                                        else if (texto.equals(o)) {bt5.setText(texto);
				            opcion[4]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
                                        else {
                                                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, ingrese 'x' o 'o'."); 
                                               }
 
				}
                            desactiva(bt5);
			}
		});
		bt5.setBounds(152, 104, 89, 65);
		frame.getContentPane().add(bt5);
 
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca 'x' o 'o': ").toString().toLowerCase();
					if (texto.equals(x)) {
				            bt6.setText(texto);
				            opcion[5]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
					  }
					 if (texto.equals(o)) {
				            bt6.setText(texto);
				            opcion[5]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
                                         else {
                                                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, ingrese 'x' o 'o'."); 
                                               }
				}
                             desactiva(bt6);
			}
		});
		bt6.setBounds(268, 104, 89, 65);
		frame.getContentPane().add(bt6);
 
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca 'x' o 'o': ").toString().toLowerCase();
					if (texto.equals(x)) {
				            bt7.setText(texto);
				            opcion[6]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
					  }
                                        else if (texto.equals(o)) {
				            bt7.setText(texto);
				            opcion[6]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
                                        else {
                                                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, ingrese 'x' o 'o'."); 
                                               }
 
				}
                             desactiva(bt7);
			}
		});
		bt7.setBounds(23, 181, 89, 70);
		frame.getContentPane().add(bt7);
 
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca 'x' o 'o': ").toString().toLowerCase();
					if (texto.equals(x)) {
				         //   System.out.print(" son iguales en X");
				            bt8.setText(texto);
				            opcion[7]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
					  }
                                        else if (texto.equals(o)) {
				          //  System.out.print(" son iguales en O");
				            bt8.setText(texto);
				            opcion[7]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
                                        else {
                                                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, ingrese 'x' o 'o'."); 
                                               }
 
				}
                        desactiva(bt8);
			}
		});
		bt8.setBounds(152, 180, 89, 71);
		frame.getContentPane().add(bt8);
 
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				while (true) {
					texto= JOptionPane.showInputDialog("Introduzca X , O ?: ").toString().toLowerCase();
					if (texto.equals(x)) {
				         //   System.out.print(" son iguales en X");
				            bt9.setText(texto);
				            opcion[8]=1;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
					  }
                                        else if (texto.equals(o)) {
				          //  System.out.print(" son iguales en O");
				            bt9.setText(texto);
				            opcion[8]=2;
				            validar(bt1, bt2, bt3, bt4, bt5, bt6,bt7, bt8, bt9);
				            break;
				      }
                                else {
                                                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, ingrese 'x' o 'o'."); 
                                               }
				}
                            desactiva(bt9);
			}
		});
		bt9.setBounds(268, 180, 89, 71);
		frame.getContentPane().add(bt9);
	}
 
 
	void validar(JButton bt1,JButton bt2,JButton bt3,JButton bt4,JButton bt5,JButton bt6,JButton bt7,JButton bt8,JButton bt9){
	 //Ganar en X
			if(opcion[0]==1 && opcion[1]==1 && opcion[2]==1){
                            JOptionPane.showMessageDialog(null,"Ganaste X");
                            BotonColorRed(bt1, bt2, bt3);  
                            preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
                        else if(opcion[0]==1 && opcion[4]==1 && opcion[8]==1){
                            JOptionPane.showMessageDialog(null,"Ganaste X");
                            BotonColorRed(bt1, bt5, bt9);  
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
                        else if(opcion[0]==1 && opcion[3]==1 && opcion[6]==1){
                            JOptionPane.showMessageDialog(null,"Ganaste X");
                            BotonColorRed(bt1, bt4, bt7);   
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
                        else if(opcion[1]==1 && opcion[4]==1 && opcion[7]==1){
                            JOptionPane.showMessageDialog(null,"Ganaste X");
                            BotonColorRed(bt2, bt5, bt8);   
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
                        else if(opcion[2]==1 && opcion[4]==1 && opcion[6]==1){
                            JOptionPane.showMessageDialog(null,"Ganaste X");
                            BotonColorRed(bt3, bt5, bt7);   
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
                        else if(opcion[2]==1 && opcion[5]==1 && opcion[8]==1){
                            JOptionPane.showMessageDialog(null,"Ganaste X");
                            BotonColorRed(bt3, bt6, bt9);   
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
                        else if(opcion[3]==1 && opcion[4]==1 && opcion[6]==1){
                            JOptionPane.showMessageDialog(null,"Ganaste X");
                            BotonColorRed(bt4, bt5, bt6);   
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
                        else if(opcion[6]==1 && opcion[7]==1 && opcion[8]==1){
                            JOptionPane.showMessageDialog(null,"Ganaste X");
                            BotonColorRed(bt7, bt8, bt9);  
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
   //Ganar en O		
                        else if(opcion[0]==2 && opcion[1]==2 && opcion[2]==2){
                            JOptionPane.showMessageDialog(null,"Ganaste O");
                            BotonColorGreen(bt1, bt2, bt3);  
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
                        else if(opcion[0]==2 && opcion[4]==2 && opcion[8]==2){
                            JOptionPane.showMessageDialog(null,"Ganaste O");
                            BotonColorGreen(bt1, bt5, bt9);  
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
                        else if(opcion[0]==2 && opcion[3]==2 && opcion[6]==2){
                            JOptionPane.showMessageDialog(null,"Ganaste O");
                            BotonColorGreen(bt1, bt4, bt7);  
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
                        else if(opcion[1]==2 && opcion[4]==2 && opcion[7]==2){
                            JOptionPane.showMessageDialog(null,"Ganaste O");
                            BotonColorGreen(bt2, bt5, bt8);  
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
                        else if(opcion[2]==2 && opcion[4]==2 && opcion[6]==2){
                            JOptionPane.showMessageDialog(null,"Ganaste O");
                            BotonColorGreen(bt3, bt5, bt7);  
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
                        else if(opcion[2]==2 && opcion[5]==2 && opcion[8]==2){
                            JOptionPane.showMessageDialog(null,"Ganaste O");
                            BotonColorGreen(bt3, bt6, bt9);  
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
                        else if(opcion[3]==2 && opcion[4]==2 && opcion[6]==2){
                            JOptionPane.showMessageDialog(null,"Ganaste O");
                            BotonColorGreen(bt4, bt5, bt6); 
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
                        else if(opcion[6]==2 && opcion[7]==2 && opcion[8]==2){
                            JOptionPane.showMessageDialog(null,"Ganaste O");
                            BotonColorGreen(bt7, bt8, bt9); 
                             preguntarContinuar(bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
                        }
 
		}
        
	void desactiva(JButton bt){
		  bt.setEnabled(false);
	}
        
        void activa(JButton bt){
		  bt.setEnabled(true);
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
        
         void preguntarContinuar(JButton bt1,JButton bt2,JButton bt3,JButton bt4,JButton bt5,JButton bt6,JButton bt7,JButton bt8,JButton bt9) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                resetearJuego( bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9);
            } else {
                System.exit(0);
            }
        }
        
         void resetearJuego(JButton bt1,JButton bt2,JButton bt3,JButton bt4,JButton bt5,JButton bt6,JButton bt7,JButton bt8,JButton bt9) {
             
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
            bt1.setBackground(Color.WHITE);
            bt2.setBackground(Color.WHITE);
            bt3.setBackground(Color.WHITE);
            bt4.setBackground(Color.WHITE);
            bt5.setBackground(Color.WHITE);
            bt6.setBackground(Color.WHITE);
            bt7.setBackground(Color.WHITE);
            bt8.setBackground(Color.WHITE);
            bt9.setBackground(Color.WHITE);
            activa(bt1);
            activa(bt2);
            activa(bt3);
            activa(bt4);
            activa(bt5);
            activa(bt6);
            activa(bt7);
            activa(bt8);
            activa(bt9);
           /* 
            botones[0] = bt1;
            botones[1] = bt2;
            botones[2] = bt3;
            botones[3] = bt4;
            botones[4] = bt5;
            botones[5] = bt6;
            botones[6] = bt7;
            botones[7] = bt8;
            botones[8] = bt9;
    
    /*for (int i = 0; i < 9; i++) {
        opcion[i] = 0;
        botones[i].setText("");
        botones[i].setBackground(Color.WHITE);
        activa(botones[i]);
    */
    // Reiniciar el arreglo de opciones
    for (int i = 0; i < opcion.length; i++) {
        opcion[i] = 0;
    }
    }
}


         
