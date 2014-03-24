import javax.swing.*;
import java.awt.event.*;

public class interfaz {
		
 public interfaz (){
		calculadora calcula = new calculadora ();
        JFrame ventana = new JFrame("Calculadora");
		JButton bt1, bt2, bt3, bt4;
		JLabel L1, L2, L3, L4;
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X
        ventana.setSize(700, 300);//configurando tamaño de la ventana
        ventana.setVisible(true);//configurando visualización de la ventana    
		ventana.setLayout(null);
		
		L1 = new JLabel ("Numero 1:");
		L2 = new JLabel ("Numero 2:");
		L3 = new JLabel ("Resultado:");
		L4 = new JLabel ();
		
		L1.setBounds(100,20,60,30);
		L2.setBounds(340,20,60,30);
		L3.setBounds(120,150,80,30);
		L4.setBounds(220,150,30,30);
		
		ventana.add(L1); 
		ventana.add(L2); 
		ventana.add(L3); 
		ventana.add(L4);
		
		
		bt1 = new JButton("Suma");
        bt2 = new JButton("Resta");
		bt3 = new JButton("Multiplicación");
        bt4 = new JButton("Division");
		
		bt1.setBounds(120,80,100,30);
		bt2.setBounds(240,80,100,30);
		bt3.setBounds(360,80,100,30);
		bt4.setBounds(480,80,100,30);
		
		ventana.add(bt1); 
		ventana.add(bt2); 
		ventana.add(bt3); 
		ventana.add(bt4);
		
		JTextField textfield1=new JTextField();
        textfield1.setBounds(180,20,100,30);
        ventana.add(textfield1);
		
		JTextField textfield2=new JTextField();
        textfield2.setBounds(420,20,100,30);
        ventana.add(textfield2);
		
		bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int R = calcula.sumaC(Integer.parseInt(textfield1.getText()), Integer.parseInt(textfield2.getText()));
				L4.setText(String.valueOf(R));
            }
		});
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int R = calcula.restaC(Integer.parseInt(textfield1.getText()), Integer.parseInt(textfield2.getText()));
				L4.setText(String.valueOf(R));
            }
		});
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int R = calcula.multC(Integer.parseInt(textfield1.getText()), Integer.parseInt(textfield2.getText()));
				L4.setText(String.valueOf(R));
            }
		});
		bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int R = calcula.divC(Integer.parseInt(textfield1.getText()), Integer.parseInt(textfield2.getText()));
				L4.setText(String.valueOf(R));
            }
		});
		
    } 

	

}