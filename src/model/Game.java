package model;

/**
 * Created by Artem on 20.09.2016.
 * Главный класс для запуска игры
 */
public class Game {
    public static void start(){
//        System.out.println("Welcome to the tic tac toe game");
//
//        System.out.println("Enter Player1 name");
//        model.Player p1 = new model.Player();
//        p1.playerInitialize();
//
//        System.out.println("Enter Player2 name");
//        model.Player p2 = new model.Player();
//        p2.playerInitialize();
//
        model.Field field = new model.Field();
        field.fieldInitialize();
        field.fieldPrint();
//
////        while (true) {
//            p1.playerTurn();
////            field.fieldPrint();
////            p1.playerWin();
////            p2.playerTurn();
////            p1.playerWin();
////        }
   }

}
