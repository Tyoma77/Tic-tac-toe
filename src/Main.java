import model.Game;
import view.GameWindow;

/**
 * Created by artem on 22.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        GameWindow gameWindow = new GameWindow();
        gameWindow.init();

        Game.start();
    }
}
