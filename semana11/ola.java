import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ola extends JFrame {
    private JButton boton;
    private JLabel etiqueta;

    public ola() {
        super("Formulario con Botón");
        initUI();
    }

    private void initUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320,160);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10,10));

        etiqueta = new JLabel("Presiona el botón", SwingConstants.CENTER);
        etiqueta.setFont(new Font("SansSerif", Font.PLAIN, 14));

        boton = new JButton("Botón");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("¡Botón pulsado!");
            }
        });

        panel.add(etiqueta, BorderLayout.CENTER);
        panel.add(boton, BorderLayout.SOUTH);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ola().setVisible(true);
        });
    }
}
