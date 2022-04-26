package me.mirsowasvonegal.wwm.gui;

import javax.swing.*;
import java.awt.*;

public class GUI {

    private JFrame jFrame;
    private JPanel jPanel;
    private CardLayout layout;

    public GUI() {
        layout = new CardLayout();
        jPanel = new JPanel(layout);
        jFrame = new JFrame("Wer wird Millionär?");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(740, 490));
        jFrame.setResizable(false);
        jFrame.setContentPane(jPanel);
        importGUIs();
        open("menu");
        jFrame.pack();
        jFrame.setVisible(true);
    }

    private void importGUIs() {
        jPanel.add(new MenuGUI(), "menu");
        jPanel.add(new GameGUI(), "game");
    }

    public void open(String gui) {
        layout.show(jPanel, gui);
    }

}
