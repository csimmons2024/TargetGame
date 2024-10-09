import javax.swing.*;

public class TargetGame extends JFrame {
    private GameController gameController;

    public TargetGame() {
        gameController = new GameController();
        add(gameController);
        setTitle("Target Game");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        gameController.startGame();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TargetGame::new);
    }
}
