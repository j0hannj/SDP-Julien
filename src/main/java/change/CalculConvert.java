package change;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class CalculConvert{
    private Money m1;
    private Money m2;


    public CalculConvert(Money m1, Money m2){
        this.m1=m1;
        this.m2=m2;

    }

    public double Convert()
    {
        return m1.getChange()/m2.getChange();
    }
}