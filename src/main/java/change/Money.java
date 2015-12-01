package change;

/**
 * Created by johann on 20/11/2015.
 */

public class Money
    {// la classe Money qui prend en argument un nom et un taux de change avec le dollars (USD/monnaie)

    /**
     * Created by johann on 20/11/2015.
     */
        String name;
        double usd;//USD/money ratio

        public Money(String name, double usd) {
            this.name = name;
            this.usd = usd;
        }

        public double getChange() {
            return this.usd;
        }

        public String getName(){
            return this.name;
        }




    }

