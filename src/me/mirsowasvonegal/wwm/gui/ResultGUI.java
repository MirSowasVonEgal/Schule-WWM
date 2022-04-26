package me.mirsowasvonegal.wwm.gui;

import me.mirsowasvonegal.wwm.Main;
import me.mirsowasvonegal.wwm.models.Game;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ResultGUI extends JPanel {

	Game game = Main.getGame();

	/**
	 * Create the panel.
	 */
	public ResultGUI(boolean correct) {
		setLayout(null);


		String text = "Du hast diese Frage falsch beantwortet!";
		if(correct)
			text = "Du hast diese Frage richtig beantwortet!";

		JLabel lblNewLabel = new JLabel(text);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 35, 630, 69);
		add(lblNewLabel);

		String text2 = "";
		if(correct)
			text2 = "Nächste Runde in 3 Sekunden";
		JLabel lblNchsteRundeIn = new JLabel(text2);
		lblNchsteRundeIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblNchsteRundeIn.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNchsteRundeIn.setBounds(0, 149, 630, 69);
		add(lblNchsteRundeIn);
	}
}
