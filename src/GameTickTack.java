/**
 * Created by tanyabednyakova on 19/01/2017.
 */
import java.awt.Point;
public class GameTickTack {



    private static GameTickTack instance;
    private PlayerTicTac p1;
    private PlayerTicTac p2;
    private VeiwTicTacField view;
    FieldTicTac fieldTicTac;


    public static GameTickTack getInstance()
    {
        if(instance==null) instance=new GameTickTack();
        return instance;
    }

    private boolean isFinish(Point p)
    {
        Type [][] field= fieldTicTac.getGameField();
        if(field[p.x][p.y]==field[(p.x+1)%3][p.y] && field[p.x][p.y]==field[(p.x+2)%3][p.y])  return true;
        if(field[p.x][p.y]==field[p.x][(p.y+1)%3] && field[p.x][p.y]==field[p.x][(p.y+2)%3])  return true;
        if(field[0][0]==field[1][1] && field[0][0]==field[2][2]) return  true;
        else
            return false;

    }

    public void initGame(VeiwTicTacField view, PlayerTicTac p1, PlayerTicTac p2)
    {
        fieldTicTac =new FieldTicTac();
        this.view=view;
        this.p1=p1;
        this.p2=p2;
        view.showFiaeld(fieldTicTac);
        this.startGame();
    }



    private void startGame() {
        PlayerTicTac playerTicTac =p1;

        while (true) {
            view.showMsg("Ход: "+ playerTicTac.getType());
            Point p = playerTicTac.makуMove();
            if(p.x>2 || p.y>2 || p.x < 0 || p.y<0) view.errorMsg("нет такой клетки");
            else if(fieldTicTac.getGameField()[p.x][p.y]!=Type.n) view.errorMsg("Поле уже занято!");
            else {
                fieldTicTac.changeMove(p, playerTicTac.getType());
                view.showFiaeld(fieldTicTac);
                if (isFinish(p)) {
                    view.showMsg("Победа! "+ playerTicTac.getType());
                    break;
                }

                if (playerTicTac == p1) playerTicTac = p2;
                else playerTicTac = p1;
            }
        }
    }


}
