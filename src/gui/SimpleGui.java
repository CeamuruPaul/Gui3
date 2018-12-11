package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui implements ActionListener {

    private JButton button;
    private JFrame window;

    public static void main(String[] args) {
        new SimpleGui().run();
    }

    private void run() {
        window = new JFrame();

        button = new JButton("Click me");
        button.addActionListener(this);

        window.getContentPane().add(button);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setVisible(true);
    }

    public void changeText() {
        button.setText("You clicked me");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        changeText();
    }
}
