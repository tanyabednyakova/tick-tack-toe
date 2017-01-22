import java.awt.*;
import java.util.Random;

/**
 * Created by tanyabednyakova on 22/01/2017.
 */
public class ComputerPlayer extends PlayerTicTac {
    public ComputerPlayer(Type type)
    {
        super(type);
    }

    @Override
    public Point makуMove() {
        Random rnd=new Random();
        Point p=new Point(rnd.nextInt(FieldTicTac.size), rnd.nextInt(FieldTicTac.size));
        return p;
    }
}
