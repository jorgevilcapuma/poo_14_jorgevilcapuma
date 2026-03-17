package vallegrandeledu.pe.poo_14_jorgevilcapuma.actividad1_calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {

    JTextField txt1, txt2, txtResultado;
    JButton btnSumar, btnRestar ,getBtnMuntiplicacion ;

    int num1;
    int num2;

    public Calculadora() {

        setTitle("Calculadora");
        setSize(300,200);
        setLayout(null);

        txt1 = new JTextField();
        txt1.setBounds(50,20,200,25);

        txt2 = new JTextField();
        txt2.setBounds(50,50,200,25);

        txtResultado = new JTextField();
        txtResultado.setBounds(50,80,200,25);

        btnSumar = new JButton("Sumar");
        btnSumar.setBounds(50,120,90,30);

        btnRestar = new JButton("Restar");
        btnRestar.setBounds(160,120,90,30);

        add(txt1);
        add(txt2);
        add(txtResultado);
        add(btnSumar);
        add(btnRestar);


        btnSumar.addActionListener(this);
        btnRestar.addActionListener(this);

        setVisible(true);
    }

    public void sumar(){
        num1 = Integer.parseInt(txt1.getText());
        num2 = Integer.parseInt(txt2.getText());
        txtResultado.setText(String.valueOf(num1 + num2));
    }

    public void restar(){
        num1 = Integer.parseInt(txt1.getText());
        num2 = Integer.parseInt(txt2.getText());
        txtResultado.setText(String.valueOf(num1 - num2));
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnSumar){
            sumar();
        }

        if(e.getSource() == btnRestar){
            restar();
        }
    }

    public static void main(String[] args) {

        Calculadora obj = new Calculadora();

    }
}