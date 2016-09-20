import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by artem on 20.09.2016.
 * игрок 1
 */
public class Player {
    public void playerInitialize(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = reader.readLine();
        } catch (Exception e) {
            System.out.println("!!!Error!!!");
            System.out.println("Enter ");
        }
    }

}
