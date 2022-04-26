package me.mirsowasvonegal.wwm;

import me.mirsowasvonegal.wwm.gui.GUI;
import me.mirsowasvonegal.wwm.models.Answer;
import me.mirsowasvonegal.wwm.models.Game;
import me.mirsowasvonegal.wwm.models.Question;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    private static Game game;
    private static GUI gui;

    public static Game getGame() {
        return game;
    }

    public static GUI getGui() {
        return gui;
    }

    public static void main(String[] args) {
        game = new Game();
        gui = new GUI();
    }

}
