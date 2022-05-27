package homework07;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private int windowH = 300;
    private int windowW = 200;
    private int windowX = 200;
    private int windowY = 400;

    private JPanel greetingPanel;
    private JPanel resultPanel;
    private JLabel greetingLabel;
    private JTextArea resultLabel;

    private GridBagLayout gridBagLayout;
    private GridBagConstraints constraints;

    public Calculator() {
        prepareConstraints();
        gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);

        prepareWindow();
        prepareGreeting();

        prepareResult();

        prepareButtons();

        setVisible(true);
    }

    private void prepareConstraints() {
        constraints = new GridBagConstraints();
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.gridx = 0;
    }
    private void prepareGreeting() {
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        greetingLabel = new JLabel("Hello calculator");

        greetingPanel = new JPanel();
        greetingPanel.add(greetingLabel);
        add(greetingPanel, constraints);
    }

    private void prepareResult() {
        resultLabel = new JTextArea("0");
        resultLabel.setEditable(false);
        constraints.gridy = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        resultPanel = new JPanel();
        resultPanel.add(resultLabel);
        add(resultPanel, constraints);
    }

    private void prepareButtons() {
        ButtonPanel buttonPanel = new ButtonPanel();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridy = 3;
        add(buttonPanel, constraints);
    }

    private void prepareWindow() {
        setSize(windowH, windowW);
        setLocation(windowX, windowY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);
    }
}
