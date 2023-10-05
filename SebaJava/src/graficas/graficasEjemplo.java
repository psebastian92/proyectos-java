package graficas;

import java.awt.*;
import java.awt.event.*;

public class graficasEjemplo extends Frame implements ActionListener {
    private TextField pantalla;
    private double numero1, numero2, resultado;
    private char operacion;

    public graficasEjemplo() {
        // Configurar la ventana
        setTitle("Calculadora");
        setSize(300, 300);
        setLayout(new BorderLayout());

        // Configurar el campo de texto
        pantalla = new TextField();
        pantalla.setEditable(false);
        add(pantalla, BorderLayout.NORTH);

        // Configurar los botones
        Panel panelBotones = new Panel(new GridLayout(4, 4));
        String[] botones = {"7", "8", "9", "/",
                            "4", "5", "6", "*",
                            "1", "2", "3", "-",
                            "C", "0", "=", "+"};

        for (String boton : botones) {
            Button btn = new Button(boton);
            btn.addActionListener(this);
            panelBotones.add(btn);
        }

        add(panelBotones, BorderLayout.CENTER);

        // Manejar el evento de cierre de la ventana
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        if (comando.equals("C")) {
            pantalla.setText("");
            numero1 = numero2 = resultado = 0;
            operacion = ' ';
        } else if (comando.equals("=")) {
            numero2 = Double.parseDouble(pantalla.getText());
            switch (operacion) {
                case '+':
                    resultado = numero1 + numero2;
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    break;
                case '/':
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        pantalla.setText("Error: No se puede dividir por cero.");
                        return;
                    }
                    break;
            }
            pantalla.setText(String.valueOf(resultado));
            numero1 = resultado;
        } else {
            if (operacion == ' ') {
                numero1 = Double.parseDouble(pantalla.getText());
                operacion = comando.charAt(0);
                pantalla.setText("");
            } else {
                pantalla.setText(pantalla.getText() + comando);
            }
        }
    }

    public static void main(String[] args) {
        new graficasEjemplo();
    }
}