
package change;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import java.util.LinkedList;
import java.util.List;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class GetAction extends AbstractAction {
    private Change fenetre;
    private List<Money> list;

    public GetAction(Change fenetre, List<Money> list){
        this.fenetre = fenetre;
        this.list=list;

        fenetre.comboAdd(list);
        this.fenetre.getButon().addActionListener(this);
        this.fenetre.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        javax.swing.JOptionPane.showMessageDialog(null,"Ton message");
        fenetre.getLabel().setText(fenetre.getComboStat().toString());

    }
}