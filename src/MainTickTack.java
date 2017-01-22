/**
 * Created by tanyabednyakova on 19/01/2017.
 */
public class MainTickTack {
    public static void main(String[] args) {

        GameTickTack game= GameTickTack.getInstance().getInstance();
        PlayerTicTac p1=new UserPlayer(Type.X);
        PlayerTicTac p2=new ComputerPlayer(Type.O);
        VeiwTicTacField view=new ConsoleTicTac();
        game.initGame(view, p1,p2);

    }
}
