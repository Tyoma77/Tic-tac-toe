package model;

/**
 * Created by artem on 22.09.2016.
 */
public class Cell {

    public Cell() {

    }

    private int x;
    private int y;

    public Cell(int y, int x) {
        this.y = y;
        this.x = x;
    }

//    Проверка занята ли кнопка
    public boolean isBusy() {
        if (Field.field[x][y].equals("-"))
            return false;
        else
            return true;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void makeShoot() {
        Cell cell = new Cell();
//        cell.setX();
//        cell.setY();
    }


}
