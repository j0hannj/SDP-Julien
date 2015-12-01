
package change;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import java.util.LinkedList;
import java.util.List;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class GetAction extends AbstractAction {//classe controleur
    private Change fenetre;
    private List<Money> list;

    public GetAction(Change fenetre, List<Money> list){
        this.fenetre = fenetre;
        this.list=list;

        fenetre.comboAdd(list);
        this.fenetre.getButon().addActionListener(this);
        this.fenetre.setVisible(true);
    }

    public double CalculConvert(Money M1, Money M2)
    {// On crée la fonction qui effectue la conversion.
        return M2.getChange()/M1.getChange();
    }
    public void actionPerformed(ActionEvent e) {// ici on crée une fonction qui se déclenche quand le boutton est cliqué.

       // javax.swing.JOptionPane.showMessageDialog(null,"Ton message");
        String m1=fenetre.getComboStat1().toString();
        String m2=fenetre.getComboStat2().toString();
        Money M1= new Money("",0);
        Money M2= new Money("",0);
        double c=0;
        Boolean done=true;

        for(int i=0; i<list.size();i++)
        {
            if(list.get(i).getName()==m1)
                M1=list.get(i);
            else if(list.get(i).getName()==m2)
                M2=list.get(i);

        }
        if(m1==m2)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"entrer deux devises differentes!");// gestion d'erreur si les devises sont egales

        }
        else {
            String text = fenetre.getField().getText();
            try {
                c = Double.parseDouble(text);
            } catch (NumberFormatException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "entrer un nombre reel!\n le separateur est un point, merci");// gestion d'erreur
                done = false;
            }

            if (done) {
                // on gere la conversion dans la methode conversion.
                fenetre.getLabel().setText(Double.toString(c * CalculConvert(M1, M2))+" "+M2.getName());
            }
        }

    }
}