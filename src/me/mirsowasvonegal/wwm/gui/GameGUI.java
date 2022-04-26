package me.mirsowasvonegal.wwm.gui;

import me.mirsowasvonegal.wwm.Main;
import me.mirsowasvonegal.wwm.models.Game;
import me.mirsowasvonegal.wwm.models.Question;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameGUI extends JPanel {

	Game game;

	/**
	 * Create the panel.
	 */
	public GameGUI() {
		game = Main.getGame();

		Question question = game.getRandomQuestion();

		setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Loading...");
		lblNewLabel_1_1.setBounds(16, 6, 696, 124);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 31));
		add(lblNewLabel_1_1);
		
		JButton btnSpielBeenden_1_1_1_1 = new JButton("Loading...");
		btnSpielBeenden_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSpielBeenden_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnSpielBeenden_1_1_1_1.setBounds(16, 141, 340, 121);
		add(btnSpielBeenden_1_1_1_1);
		
		JButton btnSpielBeenden_1_1_1_1_1 = new JButton("Loading...");
		btnSpielBeenden_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSpielBeenden_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnSpielBeenden_1_1_1_1_1.setBounds(366, 141, 340, 121);
		add(btnSpielBeenden_1_1_1_1_1);
		
		JButton btnSpielBeenden_1_1_1_1_2 = new JButton("Loading...");
		btnSpielBeenden_1_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSpielBeenden_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnSpielBeenden_1_1_1_1_2.setBounds(16, 273, 340, 121);
		add(btnSpielBeenden_1_1_1_1_2);
		
		JButton btnSpielBeenden_1_1_1_1_3 = new JButton("Loading...");
		btnSpielBeenden_1_1_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSpielBeenden_1_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnSpielBeenden_1_1_1_1_3.setBounds(366, 273, 340, 121);
		add(btnSpielBeenden_1_1_1_1_3);
		
		JLabel lblNewLabel = new JLabel("Geld: 0\u20AC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(26, 405, 669, 46);
		add(lblNewLabel);

	}

}
