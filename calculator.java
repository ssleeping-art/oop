package calculator1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener {

    private JTextField textField;
    private String operator;
    private double firstOperand, secondOperand, result;
    private boolean isTrigOperation = false;
    private boolean isNegative = false;

    public calculator() {
        setTitle("Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 30));
      
        textField.setEditable(false);
        getContentPane().add(textField, BorderLayout.NORTH);

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            ".", "0", "=", "+",
            "sin", "cos", "tan", "%",
            "AC", "C",
        };

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setLayout(new GridLayout(6, 4, 10, 10));

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 30));
            //button.setBackground(Color.WHITE);
            button.addActionListener(this);
            panel.add(button);
        }

        getContentPane().add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            calculator calc = new calculator();
            calc.setVisible(true);
        });
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
            textField.setText(textField.getText() + command);
        } else if (command.equals("AC")) {
            textField.setText("");
            operator = "";
            firstOperand = secondOperand = result = 0;
            isTrigOperation = false;
            isNegative = false;
        } else if (command.equals("C")) {
            String text = textField.getText();
            if (!text.isEmpty()) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        } else if (command.equals("=")) {
            if (!textField.getText().isEmpty()) {
                if (isTrigOperation) {
                    double value = Double.parseDouble(textField.getText().replace(operator, ""));
                    switch (operator) {
                        case "sin":
                            result = Math.sin(Math.toRadians(value));
                            break;
                        case "cos":
                            result = Math.cos(Math.toRadians(value));
                            break;
                        case "tan":
                            result = Math.tan(Math.toRadians(value));
                            break;
                    }
                    textField.setText(String.valueOf(result));
                    isTrigOperation = false;
                } else if (operator == null || operator.isEmpty()) {
                    textField.setText(textField.getText());
                } else {
                    secondOperand = Double.parseDouble(textField.getText());
                    switch (operator) {
                        case "+":
                            result = firstOperand + secondOperand;
                            break;
                        case "-":
                            result = firstOperand - secondOperand;
                            break;
                        case "*":
                            result = firstOperand * secondOperand;
                            break;
                        case "/":
                            result = firstOperand / secondOperand;
                            break;
                        case "%":
                            result = firstOperand % secondOperand;
                            break;
                    }
                    textField.setText(String.valueOf(result));
                    firstOperand = result;
                }
            }
        } else if (command.equals("sin") || command.equals("cos") || command.equals("tan")) {
            operator = command;
            textField.setText(command);
            isTrigOperation = true;
        } else if (command.equals("-")) {
            String text = textField.getText();
            if (text.isEmpty()) {
                textField.setText("-");
                isNegative = true;
            } else if (operator == null || operator.isEmpty()) {
                firstOperand = Double.parseDouble(text);
                operator = command;
                textField.setText("");
            } else {
                if (!text.isEmpty()) {
                    secondOperand = Double.parseDouble(text);
                    switch (operator) {
                        case "+":
                            result = firstOperand + secondOperand;
                            break;
                        case "-":
                            result = firstOperand - secondOperand;
                            break;
                        case "*":
                            result = firstOperand * secondOperand;
                            break;
                        case "/":
                            result = firstOperand / secondOperand;
                            break;
                        case "%":
                            result = firstOperand % secondOperand;
                            break;
                    }
                    operator = command;
                    textField.setText(String.valueOf(result) + operator);
                    firstOperand = result;
                    isNegative = true;
                }
            }
        } else {
            if (!textField.getText().isEmpty()) {
                firstOperand = Double.parseDouble(textField.getText());
                operator = command;
                textField.setText("");
            }
        }
    }
}
