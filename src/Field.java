/**
 * Created by artem on 20.09.2016.
 * класс поле игры
 */
public class Field {

    public Field() {
    }

    public static String[][] field = new String[3][3];

    public static String[][] getField() {
        return field;
    }

    public static void setField(String[][] field) {
        Field.field = field;
    }

    public void fieldInitialize(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = "-";
            }
        }
    }

    public void fieldPrint() {
        System.out.print("  A B C");
        System.out.println();
        for (int i = 0; i < field.length; i++) {
            System.out.print(i+1 + " ");
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                if (j != 2)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
