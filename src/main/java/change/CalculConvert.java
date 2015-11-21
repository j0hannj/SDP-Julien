package change;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class CalculConvert extends AbstractAction {
    private  Change fenetre;

    public CalculConvert(Change fenetre, String texte){
        super(texte);

        this.fenetre = fenetre;
    }

    public void actionPerformed(ActionEvent e) {

     }
}