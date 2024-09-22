package Clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazDeUsuario extends JFrame {
    // Atributos de la interfaz gráfica
    private JTextField nombreField;
    private JTextField edadField;
    private JButton enviarButton;
    private JLabel resultadoLabel;

    // Constructor
    public InterfazDeUsuario() {
        // Configuración básica de la ventana
        setTitle("Formulario de Empleado");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Centrar la ventana

        // Crear el panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Agregar componentes al panel
        panel.add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        panel.add(nombreField);

        panel.add(new JLabel("Edad:"));
        edadField = new JTextField();
        panel.add(edadField);

        enviarButton = new JButton("Enviar");
        panel.add(enviarButton);

        resultadoLabel = new JLabel("");
        panel.add(resultadoLabel);

        // Agregar el panel a la ventana
        add(panel);

        // Acción al presionar el botón "Enviar"
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String edadTexto = edadField.getText();

                try {
                    int edad = Integer.parseInt(edadTexto);
                    resultadoLabel.setText("Empleado: " + nombre + ", Edad: " + edad);
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Por favor ingresa una edad válida.");
                }
            }
        });
    }

    // Método principal para ejecutar la interfaz
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazDeUsuario().setVisible(true);
            }
        });
    }
}

