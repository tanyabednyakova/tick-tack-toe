import java.awt.*;
import java.util.Scanner;

/**
 * Created by tanyabednyakova on 22/01/2017.
 */
public class UserPlayer extends PlayerTicTac {

    public UserPlayer(Type type)
    {
        super(type);
    }

    @Override
    public Point makуMove() {
        Scanner s=new Scanner(System.in);

        int x=s.nextInt();
        int y=s.nextInt();
        return new Point(x, y);


    }
}
