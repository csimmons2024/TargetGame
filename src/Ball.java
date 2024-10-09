import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    private int x, y;
    private Color color;

    public Ball(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 20, 20);
    }
}
