import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameController extends JPanel implements ActionListener {
    private Player player;
    private Ball ball;
    private Timer timer;

    public GameController() {
        player = new Player(100, 500);
        ball = new Ball(400, 300, Color.GREEN);

        timer = new Timer(30, this);
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                // Arrow keys for moving the player
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    player.moveLeft();  // Move left
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    player.moveRight();  // Move right
                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    player.moveUp();  // Move up
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    player.moveDown();  // Move down
                }
            }
        });
    }

    public void startGame() {
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        player.draw(g);
        ball.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
