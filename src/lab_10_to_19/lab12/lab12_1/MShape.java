package lab_10_to_19.lab12.lab12_1;

import java.awt.Color;
import java.awt.Graphics;

public abstract class MShape {
    protected Color color;
    protected int x;
    protected int y;

    public MShape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}