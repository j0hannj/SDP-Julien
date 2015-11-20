package change;
import javax.swing.JFrame;

/**
 * Created by johann on 20/11/2015.
 */

public class Change {
    public static void main(String[] args)
    {
        JFrame fenetre= new JFrame();

        fenetre.setTitle("taux de change");
        fenetre.setSize(400,400);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
        Money usd= new Money("usd", 1);
    }
}
