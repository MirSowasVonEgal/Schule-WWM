package me.mirsowasvonegal.wwm.gui;

import me.mirsowasvonegal.wwm.Main;
import me.mirsowasvonegal.wwm.models.Answer;
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
	Question question;
	JLabel q;
	JButton a1;
	JButton a2;
	JButton a3;
	JButton a4;

	/**
	 * Create the panel.
	 */
	public GameGUI() {
		game = Main.getGame();

		setLayout(null);

		q = new JLabel("Loading...");
		q.setBounds(16, 6, 696, 124);
		q.setHorizontalAlignment(SwingConstants.CENTER);
		q.setFont(new Font("Tahoma", Font.PLAIN, 31));
		add(q);

		a1 = new JButton("Loading...");
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerQuestion(a1);
			}
		});
		a1.setFont(new Font("Tahoma", Font.BOLD, 26));
		a1.setBounds(16, 141, 340, 121);
		add(a1);
		
		a2 = new JButton("Loading...");
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerQuestion(a2);
			}
		});
		a2.setFont(new Font("Tahoma", Font.BOLD, 26));
		a2.setBounds(366, 141, 340, 121);
		add(a2);
		
		a3 = new JButton("Loading...");
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerQuestion(a3);
			}
		});
		a3.setFont(new Font("Tahoma", Font.BOLD, 26));
		a3.setBounds(16, 273, 340, 121);
		add(a3);
		
		a4 = new JButton("Loading...");
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerQuestion(a4);
			}
		});
		a4.setFont(new Font("Tahoma", Font.BOLD, 26));
		a4.setBounds(366, 273, 340, 121);
		add(a4);
		
		JLabel lblNewLabel = new JLabel("Geld: 0€");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(26, 405, 669, 46);
		add(lblNewLabel);

		generateQuestions();
	}

	public void generateQuestions() {
		question = game.getRandomQuestion();
		Answer[] answers = question.getAnswers();
		q.setText(question.getQuestion());
		a1.setText(answers[0].getAnswer());
		a2.setText(answers[1].getAnswer());
		a3.setText(answers[2].getAnswer());
		a4.setText(answers[3].getAnswer());
	}

	public void answerQuestion(JButton button) {
		for (Answer answer : question.getAnswers()) {
			if(answer.getAnswer().equals(button.getText())) {
				if(answer.getCorrect()) {
					Main.getGui().open("won");

					new Thread(() -> {
						try {
							Thread.sleep(1000*3);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						generateQuestions();
						Main.getGui().open("game");
					}).start();
					return;
				}
				Main.getGui().open("lose");
				return;
			}
		}
	}



}
