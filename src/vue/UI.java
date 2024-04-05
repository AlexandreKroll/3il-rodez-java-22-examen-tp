package vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame{
	private static void main(String[] args) {
		
	}
	private UI() {
        setTitle("ok");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        JLabel titleLabel = new JLabel("cool :");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel);

        setVisible(true);
	}
}

