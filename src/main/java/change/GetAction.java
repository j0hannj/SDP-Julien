
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

       // javax.swing.JOptionPane.showMessageDialog(null,"Ton message");
        String m1=fenetre.getComboStat1().toString();
        String m2=fenetre.getComboStat2().toString();
        Money M1= new Money("",0);
        Money M2= new Money("",0);

        for(int i=0; i<list.size();i++)
        {
            if(list.get(i).getName()==m1)
                M1=list.get(i);
            else if(list.get(i).getName()==m2)
                M2=list.get(i);

        }
        CalculConvert conv= new CalculConvert(M1,M2);
        fenetre.getLabel().setText(Double.toString(conv.Convert()));

    }
}