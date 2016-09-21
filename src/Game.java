/**
 * Created by Artem on 20.09.2016.
 * Главный класс для запуска игры
 */
public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to the tic tac toe game");

        System.out.println("Enter Player1 name");
        Player p1 = new Player();
        p1.playerInitialize();

        System.out.println("Enter Player2 name");
        Player p2 = new Player();
        p2.playerInitialize();

        Field field = new Field();
        field.fieldInitialize();
        field.fieldPrint();

//        while (true) {
//            p1.playerTurn();
//            p1.playerWin();
//            p2.playerTurn();
//            p1.playerWin();
//        }
    }

}
