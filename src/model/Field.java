package model;

/**
 * Created by artem on 20.09.2016.
 * класс поле игры
 */
public class Field {
    public static final int fieldSize = 3;

    public Field() {
    }

    public static String[][] field = new String[fieldSize][fieldSize];

    public static String[][] getField() {
        return field;
    }

    public static void setField(String[][] field) {
        Field.field = field;
    }

    public void fieldInitialize(){
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = "-";
            }
        }
    }

    public void fieldPrint() {
        System.out.println();
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                System.out.print(field[i][j]);
                if (j != 2)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean isWin() {
        if (field[0][0].equals(field[0][1]) && field[0][0].equals(field[0][2]) && !field[0][0].equals("-"))
            return true;
        if (field[1][0].equals(field[1][1]) && field[1][0].equals(field[1][2]) && !field[1][0].equals("-"))
            return true;
        if (field[2][0].equals(field[2][1]) && field[2][0].equals(field[2][2]) && !field[2][0].equals("-"))
            return true;
        if (field[0][0].equals(field[1][0]) && field[0][0].equals(field[2][0]) && !field[0][0].equals("-"))
            return true;
        if (field[0][1].equals(field[1][1]) && field[0][1].equals(field[2][1]) && !field[0][1].equals("-"))
            return true;
        if (field[0][2].equals(field[1][2]) && field[0][2].equals(field[2][2]) && !field[0][2].equals("-"))
            return true;
        if (field[0][0].equals(field[1][1]) && field[0][0].equals(field[2][2]) && !field[0][0].equals("-"))
            return true;
        if (field[0][2].equals(field[1][1]) && field[0][2].equals(field[2][0]) && !field[0][2].equals("-"))
            return true;
        else
            return false;
    }
}
