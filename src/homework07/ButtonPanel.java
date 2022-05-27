package homework07;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonDivide;
    private JButton buttonMultiple;
    private JButton buttonResult;

    private GridBagLayout gridBagLayout;

    public ButtonPanel() {
        gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);
        createButtons();
        addButtons();
    }

    private void addButtons() {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridwidth = 1;
        constraints.gridheight = 1;

        constraints.gridx = 0;
        constraints.gridy = 0;
        gridBagLayout.setConstraints(button1, constraints);
        add(button1);

        constraints.gridx = 1;
        constraints.gridy = 0;
        gridBagLayout.setConstraints(button2, constraints);
        add(button2);

        constraints.gridx = 2;
        constraints.gridy = 0;
        gridBagLayout.setConstraints(button3, constraints);
        add(button3);

        constraints.gridx = 3;
        constraints.gridy = 0;
        gridBagLayout.setConstraints(buttonPlus, constraints);
        add(buttonPlus);

        constraints.gridx = 0;
        constraints.gridy = 1;
        gridBagLayout.setConstraints(button4, constraints);
        add(button4);

        constraints.gridx = 1;
        constraints.gridy = 1;
        add(button5, constraints);

        constraints.gridx = 2;
        constraints.gridy = 1;
        gridBagLayout.setConstraints(button6, constraints);
        add(button6);

        constraints.gridx = 3;
        constraints.gridy = 1;
        gridBagLayout.setConstraints(buttonMinus, constraints);
        add(buttonMinus);

        constraints.gridx = 0;
        constraints.gridy = 2;
        gridBagLayout.setConstraints(button7, constraints);
        add(button7);

        constraints.gridx = 1;
        constraints.gridy = 2;
        gridBagLayout.setConstraints(button8, constraints);
        add(button8);

        constraints.gridx = 2;
        constraints.gridy = 2;
        gridBagLayout.setConstraints(button9, constraints);
        add(button9);

        constraints.gridx = 3;
        constraints.gridy = 2;
        gridBagLayout.setConstraints(buttonDivide, constraints);
        add(buttonDivide);

        constraints.gridwidth = 2;
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagLayout.setConstraints(button0, constraints);
        add(button0);

        constraints.gridwidth = 1;
        constraints.gridx = 2;
        constraints.gridy = 3;
        gridBagLayout.setConstraints(buttonResult, constraints);
        add(buttonResult);

        constraints.gridx = 3;
        constraints.gridy = 3;
        gridBagLayout.setConstraints(buttonMultiple, constraints);
        add(buttonMultiple);
    }

    private void createButtons() {
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDivide = new JButton("/");
        buttonMultiple = new JButton("*");
        buttonResult = new JButton("=");
    }
}
