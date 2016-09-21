import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by artem on 20.09.2016.
 * Класс игрока
 */
public class Player {
    String name;
    static int count = 0;

    public static int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Player() {

    }

    public void playerInitialize() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            if (name.isEmpty()) {
                System.out.println("Error");
                System.out.println("Enter your name again");
                try {
                    name = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else
                break;
        }
        if (getCount() == 0)
            System.out.println("Thank you " + name + ". You play for \"0\"");
        else
            System.out.println("Thank you " + name + ". You play for \"X\"");
        System.out.println();
        setCount(1);
    }

    public void playerTurn() {
        int count = 1;
        System.out.println("");
    }

    public void playerWin() {

    }
}
