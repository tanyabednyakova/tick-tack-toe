/**
 * Created by tanyabednyakova on 22/01/2017.
 */
public class ConsoleTicTac implements VeiwTicTacField  {

    @Override
    public void showFiaeld(FieldTicTac field) {
        Type [][] gameField=field.getGameField();

        for (Type []t1:gameField)
        {
            for(Type t2:t1)
            {
                System.out.print(t2+" ");
            }
            System.out.println();
        }

    }

    @Override
    public void errorMsg(String s) {
        System.out.println(s);
    }

    @Override
    public void showMsg(String s) {
        System.out.println(s);
    }
}
