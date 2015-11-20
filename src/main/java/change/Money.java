package change;

/**
 * Created by johann on 20/11/2015.
 */

public class Money {

    /**
     * Created by johann on 20/11/2015.
     */
        String name;
        double usd;

        public Money(String name, double usd) {
            this.name = name;
            this.usd = usd;
        }

        public double getChange() {
            return this.usd;
        }


    }

