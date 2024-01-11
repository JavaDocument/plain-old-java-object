package com.gof.chap03.command.step2;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    private Color color = Color.red;

    private int redius = 6;
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics graphics = getGraphics();
        graphics.setColor(color);
        graphics.fillOval(x - redius, y - redius, redius * 2, redius * 2);
    }
}
