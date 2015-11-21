package change;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Change extends JFrame{
    private JTextField field1;
    //private JTextField field2;
    private static JComboBox Box1;
    private static JComboBox Box2;

    public Change(){
        super();

        build();//On initialise notre fen�tre
    }

    public static  void comboAdd(List<Money> listemoney)
    {
        for(int i = 0; i < listemoney.size(); i++)
        {
            Box1.addItem(listemoney.get(i).getName());
            Box2.addItem(listemoney.get(i).getName());
        }
    }

    private void build(){
        setTitle("Convertisseur"); //On donne un titre � l'application
        setSize(600,200); //On donne une taille � notre fen�tre
        setLocationRelativeTo(null); //On centre la fen�tre sur l'�cran
        setResizable(false); //On interdit la redimensionnement de la fen�tre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit � l'application de se fermer lors du clic sur la croix
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);

        field1 = new JTextField();
        field1.setColumns(10);

        panel.add(field1);

        Box1=new JComboBox();
        panel.add(Box1);


        JLabel label = new JLabel("Convertir en");
        panel.add(label);

        Box2=new JComboBox();
        panel.add(Box2);

        /*field2 = new JTextField();
        field2.setColumns(10);

        panel.add(field2);*/

        JButton bouton = new JButton(new CalculConvert(this, "Calculer"));

        panel.add(bouton);

        return panel;
    }



    public static void main(String[] args)
    {
        List l = new LinkedList<Money>();

        l.add(new Money("USD",1));
        l.add(new Money("EUR",0.93));
        l.add(new Money("GBP",0.65));


        Change fenetre= new Change();
        comboAdd(l);
        fenetre.setVisible(true);
    }
}