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
    private JLabel label1;
    private JButton bouton;


    public Change(){
        super();

        build();//On initialise notre fenêtre
    }
    public JTextField getField()
    {
        return field1;
    }
    public static  void comboAdd(List<Money> listemoney)
    {
        for(int i = 0; i < listemoney.size(); i++)
        {
            Box1.addItem(listemoney.get(i).getName());
            Box2.addItem(listemoney.get(i).getName());
        }
    }

    public JLabel getLabel()
    {
        return label1;
    }
    public JButton getButon()
    {
        return bouton;
    }
    public Object getComboStat1()
    {
        //javax.swing.JOptionPane.showMessageDialog(null,"Ton message");
        return Box1.getSelectedItem();
    }

    public Object getComboStat2()
    {
        //javax.swing.JOptionPane.showMessageDialog(null,"Ton message");
        return Box2.getSelectedItem();
    }

    private void build(){
        setTitle("Convertisseur"); //On donne un titre à l'application
        setSize(500,75); //On donne une taille à notre fenêtre
        setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
        setResizable(false); //On interdit la redimensionnement de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
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

        bouton = new JButton("Calculer");

        panel.add(bouton);

        label1= new JLabel("....");
        panel.add(label1);

        return panel;
    }



    public static void main(String[] args)
    {
        List l = new LinkedList<Money>();

        l.add(new Money("USD",1));
        l.add(new Money("EUR",0.93));
        l.add(new Money("GBP",0.65));


        Change fenetre= new Change();
        GetAction action= new GetAction(fenetre,l);

    }
}