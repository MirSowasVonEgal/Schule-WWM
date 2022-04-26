package me.mirsowasvonegal.wwm.gui;

import me.mirsowasvonegal.wwm.Main;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuGUI extends JPanel {

	/**
	 * Create the panel.
	 */
	public MenuGUI() {
		setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Wer wird Millionär?");
		lblNewLabel_1_1.setBounds(16, 6, 696, 57);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 31));
		add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Spiel starten");
		btnNewButton_1_1.addActionListener(e -> Main.getGui().open("game"));
		btnNewButton_1_1.setBounds(34, 353, 253, 72);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Spiel beenden");
		btnNewButton_1_1_1.addActionListener(e -> System.exit(1));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton_1_1_1.setBounds(424, 353, 253, 72);
		add(btnNewButton_1_1_1);

	}

}
