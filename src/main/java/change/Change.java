package change;

import java.awt.*;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Change extends JFrame{
    private JTextField field1;
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
        setSize(600,200); //On donne une taille à notre fenêtre
        setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
        setResizable(false); //On interdit la redimensionnement de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 20);

        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.white);

        constraints.fill= GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        field1 = new JTextField(10);
        panel.add(field1, constraints);

        Box1=new JComboBox();
        constraints.fill= GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        panel.add(Box1,constraints);


        JLabel label = new JLabel("Convertir en");
        constraints.gridx = 2;
        panel.add(label, constraints);

        Box2=new JComboBox();
        constraints.gridx = 3;

        panel.add(Box2, constraints);

        /*field2 = new JTextField();
        field2.setColumns(10);

        panel.add(field2);*/

        constraints.gridx = 1;
        constraints.gridy = 1;
        bouton = new JButton("Calculer");

        panel.add(bouton, constraints);


        constraints.gridx = 1;
        constraints.gridy = 2;
        label1= new JLabel("Resultat de la conversion");
        panel.add(label1, constraints);

        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "convertor"));

        return panel;
    }



    public static void main(String[] args)
    {
        List l = new LinkedList<Money>();

        l.add(new Money("USD",1));
        l.add(new Money("EUR",0.94));
        l.add(new Money("GBP",0.65));


        Change fenetre= new Change();
        GetAction action= new GetAction(fenetre,l);

    }
}