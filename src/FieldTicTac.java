import java.awt.*;

/**
 * Created by tanyabednyakova on 22/01/2017.
 */
public class FieldTicTac {
    public static final int size=3;

    private Type [][] gameField;

    public FieldTicTac()
    {
        gameField=new Type[size][size];
        initField();

    }

    public void initField()
    {
        for (int i = 0; i < gameField.length; i++)
        {
            for (int j = 0; j < gameField[i].length; j++)
            {
                gameField[i][j]=Type.n;
            }
        }
    }

    public void changeMove(Point p, Type t)
    {
        gameField[p.x][p.y]=t;
    }

    public Type[][] getGameField() {
        return gameField;
    }
}
