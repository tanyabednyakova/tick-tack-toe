import java.awt.*;

/**
 * Created by tanyabednyakova on 22/01/2017.
 */
public abstract class PlayerTicTac {
    private Type type;

    public PlayerTicTac(Type type) {
        this.type=type;
    }

    public Type getType() {
        return type;
    }

    public abstract Point makуMove();


}
