import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField display;

    public Calculator() {
        // Configurações da janela
        setTitle("Calculadora");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criação do display
        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 48));
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);

        // Criação dos botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        // Adiciona os componentes ao JFrame
        setLayout(new BorderLayout(10, 10));
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("=")) {
                try {
                    display.setText(evaluate(display.getText()));
                } catch (Exception ex) {
                    display.setText("Erro");
                }
            } else if (command.equals("C")) {
                display.setText("");
            } else {
                display.setText(display.getText() + command);
            }
        }

        private String evaluate(String expression) {
            try {
                // Avaliação da expressão utilizando JavaScript engine
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
                return engine.eval(expression).toString();
            } catch (Exception e) {
                return "Erro";
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
