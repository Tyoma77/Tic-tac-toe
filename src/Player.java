import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by artem on 20.09.2016.
 * Класс игрока
 */
public class Player {
    String name;
    static int count = 0;
    static ArrayList<String> nameList = new ArrayList<>();
    static int turnCount = 1;


    public static int getTurnCount() {
        return turnCount;
    }

    public static void setTurnCount(int turnCount) {
        Player.turnCount = turnCount;
    }


    public static int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Player() {

    }

    public void playerInitialize() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        name = reader.readLine();
        while (true) {
            if (name.isEmpty()) {
                System.out.println("Error");
                System.out.println("Enter your name again");
                name = reader.readLine();
            } else
                break;
        }
        if (getCount() == 0)
            System.out.println("Thank you " + name + ". You play for \"0\"");
        else
            System.out.println("Thank you " + name + ". You play for \"X\"");
        System.out.println();
        setCount(1);
        nameList.add(name);
    }

    public void playerTurn() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cell;
        System.out.println("");
        if (turnCount % 2 != 0) {
            System.out.println(nameList.get(0) + ", your turn");
            System.out.println("Enter where to put your \"0\". (Example A1, B2)");
            String sCell = reader.readLine();
            int x = Integer.parseInt(sCell.substring(2,2))
            String[][] nField = new String[3][3];
            nField = Field.field.clone();
//            nField[cell[0]][cell[1]]
        }
            else{
                System.out.println(nameList.get(1) + ", your turn");
                System.out.println("Enter where to put your \"X\"");
            }
            int a = 1;
            a++;
            setTurnCount(a);
        }

    public void playerWin() {

    }
}