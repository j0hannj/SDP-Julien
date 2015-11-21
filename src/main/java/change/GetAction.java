
package change;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class GetAction extends AbstractAction {
    private Change fenetre;

    public GetAction(Change fenetre, String texte){
        super(texte);

        this.fenetre = fenetre;
    }

    public void actionPerformed(ActionEvent e) {
        //Action lors du clic sur le bouton calculer
    }
}