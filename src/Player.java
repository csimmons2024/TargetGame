import java.awt.Color;
import java.awt.Graphics;

public class Player {
    private int x, y;
    private int score;

    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
        this.score = 0;
    }

    public void moveRight() {
        x += 5; // Move right
    }

    public void moveLeft() {
        x -= 5; // Move left
    }

    public void moveUp() {
        y -= 5; // Move up
    }

    public void moveDown() {
        y += 5; // Move down
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 20, 20);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getScore() {
        return score;
    }

    public void collectBall() {
        score++;
    }
}
