package konf.niceguys.minmax;

public class Calculator {

    /**
     * Return minimum of given numbers
     * @param lhs left hand side
     * @param rhs right hand side
     * @return minimum of given numbers
     */

    public int min(int lhs, int rhs) {

        return Math.min(lhs,rhs);


    }

    public int max(int lhs, int rhs) {
        return Math.max(lhs,rhs);
    }


    public int compare(int lhs, int rhs){

        if (lhs < rhs)
            return -5;
        else if (lhs > rhs) {
            return 5;
        } return 0;

    }
}
